package com.example.dependency_injection.screens.common.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle

class ServerErrorDialogFragment : BaseDialog() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity).let {
            it.setTitle("Server Error")
            it.setMessage("Something went wrong on the server")
            it.setPositiveButton("OK") { _, _ -> dismiss() }
            it.create()
        }
    }

    companion object {
        fun newInstance(): ServerErrorDialogFragment {
            return ServerErrorDialogFragment()
        }
    }
}