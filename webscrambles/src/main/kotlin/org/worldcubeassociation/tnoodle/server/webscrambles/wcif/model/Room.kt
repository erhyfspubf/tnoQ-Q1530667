package org.worldcubeassociation.tnoodle.server.webscrambles.wcif.model

import kotlinx.serialization.Serializable

@Serializable
data class Room(val id: Int, override val name: String, val activities: List<Activity>) : SafeNamed()