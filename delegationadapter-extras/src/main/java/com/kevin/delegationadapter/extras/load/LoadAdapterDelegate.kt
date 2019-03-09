/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.kevin.delegationadapter.extras.load

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * LoadAdapterDelegate
 *
 * @author zhouwenkai@baidu.com, Created on 2019-03-09 10:59:27
 *         Major Function：<b></b>
 *         <p/>
 *         Note: If you modify this class please fill in the following content as a record.
 * @author mender，Modified Date Modify Content:
 */
abstract class LoadAdapterDelegate {

    abstract fun onCreateLoadMoreViewHolder(parent: ViewGroup): LoadViewHolder

    abstract fun onCreateNoMoreViewHolder(parent: ViewGroup): LoadViewHolder

    abstract fun onCreateLoadFailViewHolder(parent: ViewGroup): LoadViewHolder
}

class LoadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)