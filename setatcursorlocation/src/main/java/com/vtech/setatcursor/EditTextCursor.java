package com.vtech.setatcursor;

import android.annotation.SuppressLint;
import android.widget.EditText;

public class EditTextCursor {
    /**
     * @param editText provide EditText where you want to set text at cursor location
     * @param text     provide text to insert cursor location
     */

    @SuppressLint("SetTextI18n")
    public static void setText(EditText editText, String text) {
        int length = editText.length();
        int pos = editText.getSelectionStart();
        String s = editText.getText().toString();
        if (length == 0 || pos == length) {
            editText.append(text + "");
        } else {
            if (pos == 0) {
                editText.setText(text + s);
                editText.setSelection(pos + text.length());
            } else {
                String one = s.substring(0, pos);
                String two = s.substring(pos, length);
                one = one + text;
                editText.setText(one + two);
                editText.setSelection(pos + text.length());
            }
        }


    }


}
