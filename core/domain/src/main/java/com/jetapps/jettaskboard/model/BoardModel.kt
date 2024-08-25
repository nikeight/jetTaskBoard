package com.jetapps.jettaskboard.model

data class BoardModel(
    val id: Long? = null,
    val title: String = "",
    val lists: List<ListModel> = emptyList(),
    val isFav: Boolean = false,
    val imageUrl: String? = "https://images.unsplash.com/photo-1508264165352-258db2ebd59b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=776&q=80",
)

data class BoardWithListAndCard(
    val boardId: Long?,
    val boardTitle: String?,
    val isFav: Boolean?,
    val listModel: List<ListModel>?,
)