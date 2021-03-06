package com.noble.news.model.entity

/**
 * @author 小寒
 * @version 1.0
 * @date 2022/7/1 11:11
 */

/**
 * 分类
 *
 * @property title
 */
data class Category(
    val title: String,
    val id: String
)

/**
 * Category Response
 *
 * @property data List<Category>
 * @constructor
 */
data class CategoryResponse(var data: List<Category>) : BaseResponse() {

}