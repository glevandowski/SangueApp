package company.inside.sangue.ui.receptor.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import company.inside.sangue.R
import company.inside.sangue.ui.core.BaseFragment

class ReceiveBloodFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_receive_blood, container, false)

        return view
    }


}
