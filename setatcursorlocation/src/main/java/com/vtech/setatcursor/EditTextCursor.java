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


    /**
     * @param editText provide EditText where you want to remove text at cursor location
     */

    @SuppressLint("SetTextI18n")
    public static void removeText(EditText editText) {
        if (editText.getText().length() != 0) {
            if (editText.getText().length() == 1) editText.setText("");
            else {

                int length = editText.length();
                int pos = editText.getSelectionStart();
                if (pos == length) {
                    editText.setText(editText.getText().subSequence(0, editText.length() - 1));
                    editText.setSelection(pos - 1);
                } else {
                    String s = editText.getText().toString();
                    String one = s.substring(0, pos);
                    String two = s.substring(pos, length);
                    int newpos = pos;
                    if (one.length() != 0) {
                        if (one.length() == 1) {
                            one = "";
                            newpos = 0;
                        } else {
                            one = one.substring(0, pos - 1);
                            newpos--;
                        }
                    } else {
                        newpos = 0;
                    }
                    editText.setText(one + two);
                    editText.setSelection(newpos);

                }


            }
        }


    }


}
