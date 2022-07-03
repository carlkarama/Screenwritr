package com.scriptwritr.model;

public class Dialog {

    private int dialogID;
    private String dialog;

    public Dialog(int dialogID, String dialog) {
        this.dialogID = dialogID;
        this.dialog = dialog;
    }

    public int getDialogID() {
        return dialogID;
    }

    public void setDialogID(int dialogID) {
        this.dialogID = dialogID;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    @Override
    public String toString() {
        return dialog;
    }
}
