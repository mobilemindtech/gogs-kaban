package io.styles

import com.raquo.laminar.api.L.*
import com.raquo.laminar.tags.HtmlTag
import org.scalajs.dom
import org.scalajs.dom.HTMLElement

object fontawesome:

  extension [A <: HTMLElement](el: HtmlTag[A])
    def fw = new FWElement(el)

  class FWElement[A <: HTMLElement](element: HtmlTag[A]) extends Style(element):

    type Class = FWElement[A]

    def fa = add("fa")

    def fa(m: => CustomReactiveElement*) = build("fa", m)

    def `fa-lg` = add("fa-lg")

    def `fa-lg`(m: => CustomReactiveElement*) = build("fa-lg", m)

    def `fa-2x` = add("fa-2x")

    def `fa-2x`(m: => CustomReactiveElement*) = build("fa-2x", m)

    def `fa-3x` = add("fa-3x")

    def `fa-3x`(m: => CustomReactiveElement*) = build("fa-3x", m)

    def `fa-4x` = add("fa-4x")

    def `fa-4x`(m: => CustomReactiveElement*) = build("fa-4x", m)

    def `fa-5x` = add("fa-5x")

    def `fa-5x`(m: => CustomReactiveElement*) = build("fa-5x", m)

    def `fa-fw` = add("fa-fw")

    def `fa-fw`(m: => CustomReactiveElement*) = build("fa-fw", m)

    def `fa-ul` = add("fa-ul")

    def `fa-ul`(m: => CustomReactiveElement*) = build("fa-ul", m)

    def `fa-li` = add("fa-li")

    def `fa-li`(m: => CustomReactiveElement*) = build("fa-li", m)

    def `fa-border` = add("fa-border")

    def `fa-border`(m: => CustomReactiveElement*) = build("fa-border", m)

    def `fa-pull-left` = add("fa-pull-left")

    def `fa-pull-left`(m: => CustomReactiveElement*) = build("fa-pull-left", m)

    def `fa-pull-right` = add("fa-pull-right")

    def `fa-pull-right`(m: => CustomReactiveElement*) = build("fa-pull-right", m)

    def `pull-right` = add("pull-right")

    def `pull-right`(m: => CustomReactiveElement*) = build("pull-right", m)

    def `pull-left` = add("pull-left")

    def `pull-left`(m: => CustomReactiveElement*) = build("pull-left", m)

    def `fa-spin` = add("fa-spin")

    def `fa-spin`(m: => CustomReactiveElement*) = build("fa-spin", m)

    def `fa-pulse` = add("fa-pulse")

    def `fa-pulse`(m: => CustomReactiveElement*) = build("fa-pulse", m)

    def `fa-rotate-90` = add("fa-rotate-90")

    def `fa-rotate-90`(m: => CustomReactiveElement*) = build("fa-rotate-90", m)

    def `fa-rotate-180` = add("fa-rotate-180")

    def `fa-rotate-180`(m: => CustomReactiveElement*) = build("fa-rotate-180", m)

    def `fa-rotate-270` = add("fa-rotate-270")

    def `fa-rotate-270`(m: => CustomReactiveElement*) = build("fa-rotate-270", m)

    def `fa-flip-horizontal` = add("fa-flip-horizontal")

    def `fa-flip-horizontal`(m: => CustomReactiveElement*) = build("fa-flip-horizontal", m)

    def `fa-flip-vertical` = add("fa-flip-vertical")

    def `fa-flip-vertical`(m: => CustomReactiveElement*) = build("fa-flip-vertical", m)

    def `fa-stack` = add("fa-stack")

    def `fa-stack`(m: => CustomReactiveElement*) = build("fa-stack", m)

    def `fa-stack-1x` = add("fa-stack-1x")

    def `fa-stack-1x`(m: => CustomReactiveElement*) = build("fa-stack-1x", m)

    def `fa-stack-2x` = add("fa-stack-2x")

    def `fa-stack-2x`(m: => CustomReactiveElement*) = build("fa-stack-2x", m)

    def `fa-inverse` = add("fa-inverse")

    def `fa-inverse`(m: => CustomReactiveElement*) = build("fa-inverse", m)

    def `fa-glass` = add("fa-glass")

    def `fa-glass`(m: => CustomReactiveElement*) = build("fa-glass", m)

    def `fa-music` = add("fa-music")

    def `fa-music`(m: => CustomReactiveElement*) = build("fa-music", m)

    def `fa-search` = add("fa-search")

    def `fa-search`(m: => CustomReactiveElement*) = build("fa-search", m)

    def `fa-envelope-o` = add("fa-envelope-o")

    def `fa-envelope-o`(m: => CustomReactiveElement*) = build("fa-envelope-o", m)

    def `fa-heart` = add("fa-heart")

    def `fa-heart`(m: => CustomReactiveElement*) = build("fa-heart", m)

    def `fa-star` = add("fa-star")

    def `fa-star`(m: => CustomReactiveElement*) = build("fa-star", m)

    def `fa-star-o` = add("fa-star-o")

    def `fa-star-o`(m: => CustomReactiveElement*) = build("fa-star-o", m)

    def `fa-user` = add("fa-user")

    def `fa-user`(m: => CustomReactiveElement*) = build("fa-user", m)

    def `fa-film` = add("fa-film")

    def `fa-film`(m: => CustomReactiveElement*) = build("fa-film", m)

    def `fa-th-large` = add("fa-th-large")

    def `fa-th-large`(m: => CustomReactiveElement*) = build("fa-th-large", m)

    def `fa-th` = add("fa-th")

    def `fa-th`(m: => CustomReactiveElement*) = build("fa-th", m)

    def `fa-th-list` = add("fa-th-list")

    def `fa-th-list`(m: => CustomReactiveElement*) = build("fa-th-list", m)

    def `fa-check` = add("fa-check")

    def `fa-check`(m: => CustomReactiveElement*) = build("fa-check", m)

    def `fa-remove` = add("fa-remove")

    def `fa-remove`(m: => CustomReactiveElement*) = build("fa-remove", m)

    def `fa-close` = add("fa-close")

    def `fa-close`(m: => CustomReactiveElement*) = build("fa-close", m)

    def `fa-times` = add("fa-times")

    def `fa-times`(m: => CustomReactiveElement*) = build("fa-times", m)

    def `fa-search-plus` = add("fa-search-plus")

    def `fa-search-plus`(m: => CustomReactiveElement*) = build("fa-search-plus", m)

    def `fa-search-minus` = add("fa-search-minus")

    def `fa-search-minus`(m: => CustomReactiveElement*) = build("fa-search-minus", m)

    def `fa-power-off` = add("fa-power-off")

    def `fa-power-off`(m: => CustomReactiveElement*) = build("fa-power-off", m)

    def `fa-signal` = add("fa-signal")

    def `fa-signal`(m: => CustomReactiveElement*) = build("fa-signal", m)

    def `fa-gear` = add("fa-gear")

    def `fa-gear`(m: => CustomReactiveElement*) = build("fa-gear", m)

    def `fa-cog` = add("fa-cog")

    def `fa-cog`(m: => CustomReactiveElement*) = build("fa-cog", m)

    def `fa-trash-o` = add("fa-trash-o")

    def `fa-trash-o`(m: => CustomReactiveElement*) = build("fa-trash-o", m)

    def `fa-home` = add("fa-home")

    def `fa-home`(m: => CustomReactiveElement*) = build("fa-home", m)

    def `fa-file-o` = add("fa-file-o")

    def `fa-file-o`(m: => CustomReactiveElement*) = build("fa-file-o", m)

    def `fa-clock-o` = add("fa-clock-o")

    def `fa-clock-o`(m: => CustomReactiveElement*) = build("fa-clock-o", m)

    def `fa-road` = add("fa-road")

    def `fa-road`(m: => CustomReactiveElement*) = build("fa-road", m)

    def `fa-download` = add("fa-download")

    def `fa-download`(m: => CustomReactiveElement*) = build("fa-download", m)

    def `fa-arrow-circle-o-down` = add("fa-arrow-circle-o-down")

    def `fa-arrow-circle-o-down`(m: => CustomReactiveElement*) = build("fa-arrow-circle-o-down", m)

    def `fa-arrow-circle-o-up` = add("fa-arrow-circle-o-up")

    def `fa-arrow-circle-o-up`(m: => CustomReactiveElement*) = build("fa-arrow-circle-o-up", m)

    def `fa-inbox` = add("fa-inbox")

    def `fa-inbox`(m: => CustomReactiveElement*) = build("fa-inbox", m)

    def `fa-play-circle-o` = add("fa-play-circle-o")

    def `fa-play-circle-o`(m: => CustomReactiveElement*) = build("fa-play-circle-o", m)

    def `fa-rotate-right` = add("fa-rotate-right")

    def `fa-rotate-right`(m: => CustomReactiveElement*) = build("fa-rotate-right", m)

    def `fa-repeat` = add("fa-repeat")

    def `fa-repeat`(m: => CustomReactiveElement*) = build("fa-repeat", m)

    def `fa-refresh` = add("fa-refresh")

    def `fa-refresh`(m: => CustomReactiveElement*) = build("fa-refresh", m)

    def `fa-list-alt` = add("fa-list-alt")

    def `fa-list-alt`(m: => CustomReactiveElement*) = build("fa-list-alt", m)

    def `fa-lock` = add("fa-lock")

    def `fa-lock`(m: => CustomReactiveElement*) = build("fa-lock", m)

    def `fa-flag` = add("fa-flag")

    def `fa-flag`(m: => CustomReactiveElement*) = build("fa-flag", m)

    def `fa-headphones` = add("fa-headphones")

    def `fa-headphones`(m: => CustomReactiveElement*) = build("fa-headphones", m)

    def `fa-volume-off` = add("fa-volume-off")

    def `fa-volume-off`(m: => CustomReactiveElement*) = build("fa-volume-off", m)

    def `fa-volume-down` = add("fa-volume-down")

    def `fa-volume-down`(m: => CustomReactiveElement*) = build("fa-volume-down", m)

    def `fa-volume-up` = add("fa-volume-up")

    def `fa-volume-up`(m: => CustomReactiveElement*) = build("fa-volume-up", m)

    def `fa-qrcode` = add("fa-qrcode")

    def `fa-qrcode`(m: => CustomReactiveElement*) = build("fa-qrcode", m)

    def `fa-barcode` = add("fa-barcode")

    def `fa-barcode`(m: => CustomReactiveElement*) = build("fa-barcode", m)

    def `fa-tag` = add("fa-tag")

    def `fa-tag`(m: => CustomReactiveElement*) = build("fa-tag", m)

    def `fa-tags` = add("fa-tags")

    def `fa-tags`(m: => CustomReactiveElement*) = build("fa-tags", m)

    def `fa-book` = add("fa-book")

    def `fa-book`(m: => CustomReactiveElement*) = build("fa-book", m)

    def `fa-bookmark` = add("fa-bookmark")

    def `fa-bookmark`(m: => CustomReactiveElement*) = build("fa-bookmark", m)

    def `fa-print` = add("fa-print")

    def `fa-print`(m: => CustomReactiveElement*) = build("fa-print", m)

    def `fa-camera` = add("fa-camera")

    def `fa-camera`(m: => CustomReactiveElement*) = build("fa-camera", m)

    def `fa-font` = add("fa-font")

    def `fa-font`(m: => CustomReactiveElement*) = build("fa-font", m)

    def `fa-bold` = add("fa-bold")

    def `fa-bold`(m: => CustomReactiveElement*) = build("fa-bold", m)

    def `fa-italic` = add("fa-italic")

    def `fa-italic`(m: => CustomReactiveElement*) = build("fa-italic", m)

    def `fa-text-height` = add("fa-text-height")

    def `fa-text-height`(m: => CustomReactiveElement*) = build("fa-text-height", m)

    def `fa-text-width` = add("fa-text-width")

    def `fa-text-width`(m: => CustomReactiveElement*) = build("fa-text-width", m)

    def `fa-align-left` = add("fa-align-left")

    def `fa-align-left`(m: => CustomReactiveElement*) = build("fa-align-left", m)

    def `fa-align-center` = add("fa-align-center")

    def `fa-align-center`(m: => CustomReactiveElement*) = build("fa-align-center", m)

    def `fa-align-right` = add("fa-align-right")

    def `fa-align-right`(m: => CustomReactiveElement*) = build("fa-align-right", m)

    def `fa-align-justify` = add("fa-align-justify")

    def `fa-align-justify`(m: => CustomReactiveElement*) = build("fa-align-justify", m)

    def `fa-list` = add("fa-list")

    def `fa-list`(m: => CustomReactiveElement*) = build("fa-list", m)

    def `fa-dedent` = add("fa-dedent")

    def `fa-dedent`(m: => CustomReactiveElement*) = build("fa-dedent", m)

    def `fa-outdent` = add("fa-outdent")

    def `fa-outdent`(m: => CustomReactiveElement*) = build("fa-outdent", m)

    def `fa-indent` = add("fa-indent")

    def `fa-indent`(m: => CustomReactiveElement*) = build("fa-indent", m)

    def `fa-video-camera` = add("fa-video-camera")

    def `fa-video-camera`(m: => CustomReactiveElement*) = build("fa-video-camera", m)

    def `fa-photo` = add("fa-photo")

    def `fa-photo`(m: => CustomReactiveElement*) = build("fa-photo", m)

    def `fa-image` = add("fa-image")

    def `fa-image`(m: => CustomReactiveElement*) = build("fa-image", m)

    def `fa-picture-o` = add("fa-picture-o")

    def `fa-picture-o`(m: => CustomReactiveElement*) = build("fa-picture-o", m)

    def `fa-pencil` = add("fa-pencil")

    def `fa-pencil`(m: => CustomReactiveElement*) = build("fa-pencil", m)

    def `fa-map-marker` = add("fa-map-marker")

    def `fa-map-marker`(m: => CustomReactiveElement*) = build("fa-map-marker", m)

    def `fa-adjust` = add("fa-adjust")

    def `fa-adjust`(m: => CustomReactiveElement*) = build("fa-adjust", m)

    def `fa-tint` = add("fa-tint")

    def `fa-tint`(m: => CustomReactiveElement*) = build("fa-tint", m)

    def `fa-edit` = add("fa-edit")

    def `fa-edit`(m: => CustomReactiveElement*) = build("fa-edit", m)

    def `fa-pencil-square-o` = add("fa-pencil-square-o")

    def `fa-pencil-square-o`(m: => CustomReactiveElement*) = build("fa-pencil-square-o", m)

    def `fa-share-square-o` = add("fa-share-square-o")

    def `fa-share-square-o`(m: => CustomReactiveElement*) = build("fa-share-square-o", m)

    def `fa-check-square-o` = add("fa-check-square-o")

    def `fa-check-square-o`(m: => CustomReactiveElement*) = build("fa-check-square-o", m)

    def `fa-arrows` = add("fa-arrows")

    def `fa-arrows`(m: => CustomReactiveElement*) = build("fa-arrows", m)

    def `fa-step-backward` = add("fa-step-backward")

    def `fa-step-backward`(m: => CustomReactiveElement*) = build("fa-step-backward", m)

    def `fa-fast-backward` = add("fa-fast-backward")

    def `fa-fast-backward`(m: => CustomReactiveElement*) = build("fa-fast-backward", m)

    def `fa-backward` = add("fa-backward")

    def `fa-backward`(m: => CustomReactiveElement*) = build("fa-backward", m)

    def `fa-play` = add("fa-play")

    def `fa-play`(m: => CustomReactiveElement*) = build("fa-play", m)

    def `fa-pause` = add("fa-pause")

    def `fa-pause`(m: => CustomReactiveElement*) = build("fa-pause", m)

    def `fa-stop` = add("fa-stop")

    def `fa-stop`(m: => CustomReactiveElement*) = build("fa-stop", m)

    def `fa-forward` = add("fa-forward")

    def `fa-forward`(m: => CustomReactiveElement*) = build("fa-forward", m)

    def `fa-fast-forward` = add("fa-fast-forward")

    def `fa-fast-forward`(m: => CustomReactiveElement*) = build("fa-fast-forward", m)

    def `fa-step-forward` = add("fa-step-forward")

    def `fa-step-forward`(m: => CustomReactiveElement*) = build("fa-step-forward", m)

    def `fa-eject` = add("fa-eject")

    def `fa-eject`(m: => CustomReactiveElement*) = build("fa-eject", m)

    def `fa-chevron-left` = add("fa-chevron-left")

    def `fa-chevron-left`(m: => CustomReactiveElement*) = build("fa-chevron-left", m)

    def `fa-chevron-right` = add("fa-chevron-right")

    def `fa-chevron-right`(m: => CustomReactiveElement*) = build("fa-chevron-right", m)

    def `fa-plus-circle` = add("fa-plus-circle")

    def `fa-plus-circle`(m: => CustomReactiveElement*) = build("fa-plus-circle", m)

    def `fa-minus-circle` = add("fa-minus-circle")

    def `fa-minus-circle`(m: => CustomReactiveElement*) = build("fa-minus-circle", m)

    def `fa-times-circle` = add("fa-times-circle")

    def `fa-times-circle`(m: => CustomReactiveElement*) = build("fa-times-circle", m)

    def `fa-check-circle` = add("fa-check-circle")

    def `fa-check-circle`(m: => CustomReactiveElement*) = build("fa-check-circle", m)

    def `fa-question-circle` = add("fa-question-circle")

    def `fa-question-circle`(m: => CustomReactiveElement*) = build("fa-question-circle", m)

    def `fa-info-circle` = add("fa-info-circle")

    def `fa-info-circle`(m: => CustomReactiveElement*) = build("fa-info-circle", m)

    def `fa-crosshairs` = add("fa-crosshairs")

    def `fa-crosshairs`(m: => CustomReactiveElement*) = build("fa-crosshairs", m)

    def `fa-times-circle-o` = add("fa-times-circle-o")

    def `fa-times-circle-o`(m: => CustomReactiveElement*) = build("fa-times-circle-o", m)

    def `fa-check-circle-o` = add("fa-check-circle-o")

    def `fa-check-circle-o`(m: => CustomReactiveElement*) = build("fa-check-circle-o", m)

    def `fa-ban` = add("fa-ban")

    def `fa-ban`(m: => CustomReactiveElement*) = build("fa-ban", m)

    def `fa-arrow-left` = add("fa-arrow-left")

    def `fa-arrow-left`(m: => CustomReactiveElement*) = build("fa-arrow-left", m)

    def `fa-arrow-right` = add("fa-arrow-right")

    def `fa-arrow-right`(m: => CustomReactiveElement*) = build("fa-arrow-right", m)

    def `fa-arrow-up` = add("fa-arrow-up")

    def `fa-arrow-up`(m: => CustomReactiveElement*) = build("fa-arrow-up", m)

    def `fa-arrow-down` = add("fa-arrow-down")

    def `fa-arrow-down`(m: => CustomReactiveElement*) = build("fa-arrow-down", m)

    def `fa-mail-forward` = add("fa-mail-forward")

    def `fa-mail-forward`(m: => CustomReactiveElement*) = build("fa-mail-forward", m)

    def `fa-share` = add("fa-share")

    def `fa-share`(m: => CustomReactiveElement*) = build("fa-share", m)

    def `fa-expand` = add("fa-expand")

    def `fa-expand`(m: => CustomReactiveElement*) = build("fa-expand", m)

    def `fa-compress` = add("fa-compress")

    def `fa-compress`(m: => CustomReactiveElement*) = build("fa-compress", m)

    def `fa-plus` = add("fa-plus")

    def `fa-plus`(m: => CustomReactiveElement*) = build("fa-plus", m)

    def `fa-minus` = add("fa-minus")

    def `fa-minus`(m: => CustomReactiveElement*) = build("fa-minus", m)

    def `fa-asterisk` = add("fa-asterisk")

    def `fa-asterisk`(m: => CustomReactiveElement*) = build("fa-asterisk", m)

    def `fa-exclamation-circle` = add("fa-exclamation-circle")

    def `fa-exclamation-circle`(m: => CustomReactiveElement*) = build("fa-exclamation-circle", m)

    def `fa-gift` = add("fa-gift")

    def `fa-gift`(m: => CustomReactiveElement*) = build("fa-gift", m)

    def `fa-leaf` = add("fa-leaf")

    def `fa-leaf`(m: => CustomReactiveElement*) = build("fa-leaf", m)

    def `fa-fire` = add("fa-fire")

    def `fa-fire`(m: => CustomReactiveElement*) = build("fa-fire", m)

    def `fa-eye` = add("fa-eye")

    def `fa-eye`(m: => CustomReactiveElement*) = build("fa-eye", m)

    def `fa-eye-slash` = add("fa-eye-slash")

    def `fa-eye-slash`(m: => CustomReactiveElement*) = build("fa-eye-slash", m)

    def `fa-warning` = add("fa-warning")

    def `fa-warning`(m: => CustomReactiveElement*) = build("fa-warning", m)

    def `fa-exclamation-triangle` = add("fa-exclamation-triangle")

    def `fa-exclamation-triangle`(m: => CustomReactiveElement*) = build("fa-exclamation-triangle", m)

    def `fa-plane` = add("fa-plane")

    def `fa-plane`(m: => CustomReactiveElement*) = build("fa-plane", m)

    def `fa-calendar` = add("fa-calendar")

    def `fa-calendar`(m: => CustomReactiveElement*) = build("fa-calendar", m)

    def `fa-random` = add("fa-random")

    def `fa-random`(m: => CustomReactiveElement*) = build("fa-random", m)

    def `fa-comment` = add("fa-comment")

    def `fa-comment`(m: => CustomReactiveElement*) = build("fa-comment", m)

    def `fa-magnet` = add("fa-magnet")

    def `fa-magnet`(m: => CustomReactiveElement*) = build("fa-magnet", m)

    def `fa-chevron-up` = add("fa-chevron-up")

    def `fa-chevron-up`(m: => CustomReactiveElement*) = build("fa-chevron-up", m)

    def `fa-chevron-down` = add("fa-chevron-down")

    def `fa-chevron-down`(m: => CustomReactiveElement*) = build("fa-chevron-down", m)

    def `fa-retweet` = add("fa-retweet")

    def `fa-retweet`(m: => CustomReactiveElement*) = build("fa-retweet", m)

    def `fa-shopping-cart` = add("fa-shopping-cart")

    def `fa-shopping-cart`(m: => CustomReactiveElement*) = build("fa-shopping-cart", m)

    def `fa-folder` = add("fa-folder")

    def `fa-folder`(m: => CustomReactiveElement*) = build("fa-folder", m)

    def `fa-folder-open` = add("fa-folder-open")

    def `fa-folder-open`(m: => CustomReactiveElement*) = build("fa-folder-open", m)

    def `fa-arrows-v` = add("fa-arrows-v")

    def `fa-arrows-v`(m: => CustomReactiveElement*) = build("fa-arrows-v", m)

    def `fa-arrows-h` = add("fa-arrows-h")

    def `fa-arrows-h`(m: => CustomReactiveElement*) = build("fa-arrows-h", m)

    def `fa-bar-chart-o` = add("fa-bar-chart-o")

    def `fa-bar-chart-o`(m: => CustomReactiveElement*) = build("fa-bar-chart-o", m)

    def `fa-bar-chart` = add("fa-bar-chart")

    def `fa-bar-chart`(m: => CustomReactiveElement*) = build("fa-bar-chart", m)

    def `fa-twitter-square` = add("fa-twitter-square")

    def `fa-twitter-square`(m: => CustomReactiveElement*) = build("fa-twitter-square", m)

    def `fa-facebook-square` = add("fa-facebook-square")

    def `fa-facebook-square`(m: => CustomReactiveElement*) = build("fa-facebook-square", m)

    def `fa-camera-retro` = add("fa-camera-retro")

    def `fa-camera-retro`(m: => CustomReactiveElement*) = build("fa-camera-retro", m)

    def `fa-key` = add("fa-key")

    def `fa-key`(m: => CustomReactiveElement*) = build("fa-key", m)

    def `fa-gears` = add("fa-gears")

    def `fa-gears`(m: => CustomReactiveElement*) = build("fa-gears", m)

    def `fa-cogs` = add("fa-cogs")

    def `fa-cogs`(m: => CustomReactiveElement*) = build("fa-cogs", m)

    def `fa-comments` = add("fa-comments")

    def `fa-comments`(m: => CustomReactiveElement*) = build("fa-comments", m)

    def `fa-thumbs-o-up` = add("fa-thumbs-o-up")

    def `fa-thumbs-o-up`(m: => CustomReactiveElement*) = build("fa-thumbs-o-up", m)

    def `fa-thumbs-o-down` = add("fa-thumbs-o-down")

    def `fa-thumbs-o-down`(m: => CustomReactiveElement*) = build("fa-thumbs-o-down", m)

    def `fa-star-half` = add("fa-star-half")

    def `fa-star-half`(m: => CustomReactiveElement*) = build("fa-star-half", m)

    def `fa-heart-o` = add("fa-heart-o")

    def `fa-heart-o`(m: => CustomReactiveElement*) = build("fa-heart-o", m)

    def `fa-sign-out` = add("fa-sign-out")

    def `fa-sign-out`(m: => CustomReactiveElement*) = build("fa-sign-out", m)

    def `fa-linkedin-square` = add("fa-linkedin-square")

    def `fa-linkedin-square`(m: => CustomReactiveElement*) = build("fa-linkedin-square", m)

    def `fa-thumb-tack` = add("fa-thumb-tack")

    def `fa-thumb-tack`(m: => CustomReactiveElement*) = build("fa-thumb-tack", m)

    def `fa-external-link` = add("fa-external-link")

    def `fa-external-link`(m: => CustomReactiveElement*) = build("fa-external-link", m)

    def `fa-sign-in` = add("fa-sign-in")

    def `fa-sign-in`(m: => CustomReactiveElement*) = build("fa-sign-in", m)

    def `fa-trophy` = add("fa-trophy")

    def `fa-trophy`(m: => CustomReactiveElement*) = build("fa-trophy", m)

    def `fa-github-square` = add("fa-github-square")

    def `fa-github-square`(m: => CustomReactiveElement*) = build("fa-github-square", m)

    def `fa-upload` = add("fa-upload")

    def `fa-upload`(m: => CustomReactiveElement*) = build("fa-upload", m)

    def `fa-lemon-o` = add("fa-lemon-o")

    def `fa-lemon-o`(m: => CustomReactiveElement*) = build("fa-lemon-o", m)

    def `fa-phone` = add("fa-phone")

    def `fa-phone`(m: => CustomReactiveElement*) = build("fa-phone", m)

    def `fa-square-o` = add("fa-square-o")

    def `fa-square-o`(m: => CustomReactiveElement*) = build("fa-square-o", m)

    def `fa-bookmark-o` = add("fa-bookmark-o")

    def `fa-bookmark-o`(m: => CustomReactiveElement*) = build("fa-bookmark-o", m)

    def `fa-phone-square` = add("fa-phone-square")

    def `fa-phone-square`(m: => CustomReactiveElement*) = build("fa-phone-square", m)

    def `fa-twitter` = add("fa-twitter")

    def `fa-twitter`(m: => CustomReactiveElement*) = build("fa-twitter", m)

    def `fa-facebook-f` = add("fa-facebook-f")

    def `fa-facebook-f`(m: => CustomReactiveElement*) = build("fa-facebook-f", m)

    def `fa-facebook` = add("fa-facebook")

    def `fa-facebook`(m: => CustomReactiveElement*) = build("fa-facebook", m)

    def `fa-github` = add("fa-github")

    def `fa-github`(m: => CustomReactiveElement*) = build("fa-github", m)

    def `fa-unlock` = add("fa-unlock")

    def `fa-unlock`(m: => CustomReactiveElement*) = build("fa-unlock", m)

    def `fa-credit-card` = add("fa-credit-card")

    def `fa-credit-card`(m: => CustomReactiveElement*) = build("fa-credit-card", m)

    def `fa-feed` = add("fa-feed")

    def `fa-feed`(m: => CustomReactiveElement*) = build("fa-feed", m)

    def `fa-rss` = add("fa-rss")

    def `fa-rss`(m: => CustomReactiveElement*) = build("fa-rss", m)

    def `fa-hdd-o` = add("fa-hdd-o")

    def `fa-hdd-o`(m: => CustomReactiveElement*) = build("fa-hdd-o", m)

    def `fa-bullhorn` = add("fa-bullhorn")

    def `fa-bullhorn`(m: => CustomReactiveElement*) = build("fa-bullhorn", m)

    def `fa-bell` = add("fa-bell")

    def `fa-bell`(m: => CustomReactiveElement*) = build("fa-bell", m)

    def `fa-certificate` = add("fa-certificate")

    def `fa-certificate`(m: => CustomReactiveElement*) = build("fa-certificate", m)

    def `fa-hand-o-right` = add("fa-hand-o-right")

    def `fa-hand-o-right`(m: => CustomReactiveElement*) = build("fa-hand-o-right", m)

    def `fa-hand-o-left` = add("fa-hand-o-left")

    def `fa-hand-o-left`(m: => CustomReactiveElement*) = build("fa-hand-o-left", m)

    def `fa-hand-o-up` = add("fa-hand-o-up")

    def `fa-hand-o-up`(m: => CustomReactiveElement*) = build("fa-hand-o-up", m)

    def `fa-hand-o-down` = add("fa-hand-o-down")

    def `fa-hand-o-down`(m: => CustomReactiveElement*) = build("fa-hand-o-down", m)

    def `fa-arrow-circle-left` = add("fa-arrow-circle-left")

    def `fa-arrow-circle-left`(m: => CustomReactiveElement*) = build("fa-arrow-circle-left", m)

    def `fa-arrow-circle-right` = add("fa-arrow-circle-right")

    def `fa-arrow-circle-right`(m: => CustomReactiveElement*) = build("fa-arrow-circle-right", m)

    def `fa-arrow-circle-up` = add("fa-arrow-circle-up")

    def `fa-arrow-circle-up`(m: => CustomReactiveElement*) = build("fa-arrow-circle-up", m)

    def `fa-arrow-circle-down` = add("fa-arrow-circle-down")

    def `fa-arrow-circle-down`(m: => CustomReactiveElement*) = build("fa-arrow-circle-down", m)

    def `fa-globe` = add("fa-globe")

    def `fa-globe`(m: => CustomReactiveElement*) = build("fa-globe", m)

    def `fa-wrench` = add("fa-wrench")

    def `fa-wrench`(m: => CustomReactiveElement*) = build("fa-wrench", m)

    def `fa-tasks` = add("fa-tasks")

    def `fa-tasks`(m: => CustomReactiveElement*) = build("fa-tasks", m)

    def `fa-filter` = add("fa-filter")

    def `fa-filter`(m: => CustomReactiveElement*) = build("fa-filter", m)

    def `fa-briefcase` = add("fa-briefcase")

    def `fa-briefcase`(m: => CustomReactiveElement*) = build("fa-briefcase", m)

    def `fa-arrows-alt` = add("fa-arrows-alt")

    def `fa-arrows-alt`(m: => CustomReactiveElement*) = build("fa-arrows-alt", m)

    def `fa-group` = add("fa-group")

    def `fa-group`(m: => CustomReactiveElement*) = build("fa-group", m)

    def `fa-users` = add("fa-users")

    def `fa-users`(m: => CustomReactiveElement*) = build("fa-users", m)

    def `fa-chain` = add("fa-chain")

    def `fa-chain`(m: => CustomReactiveElement*) = build("fa-chain", m)

    def `fa-link` = add("fa-link")

    def `fa-link`(m: => CustomReactiveElement*) = build("fa-link", m)

    def `fa-cloud` = add("fa-cloud")

    def `fa-cloud`(m: => CustomReactiveElement*) = build("fa-cloud", m)

    def `fa-flask` = add("fa-flask")

    def `fa-flask`(m: => CustomReactiveElement*) = build("fa-flask", m)

    def `fa-cut` = add("fa-cut")

    def `fa-cut`(m: => CustomReactiveElement*) = build("fa-cut", m)

    def `fa-scissors` = add("fa-scissors")

    def `fa-scissors`(m: => CustomReactiveElement*) = build("fa-scissors", m)

    def `fa-copy` = add("fa-copy")

    def `fa-copy`(m: => CustomReactiveElement*) = build("fa-copy", m)

    def `fa-files-o` = add("fa-files-o")

    def `fa-files-o`(m: => CustomReactiveElement*) = build("fa-files-o", m)

    def `fa-paperclip` = add("fa-paperclip")

    def `fa-paperclip`(m: => CustomReactiveElement*) = build("fa-paperclip", m)

    def `fa-save` = add("fa-save")

    def `fa-save`(m: => CustomReactiveElement*) = build("fa-save", m)

    def `fa-floppy-o` = add("fa-floppy-o")

    def `fa-floppy-o`(m: => CustomReactiveElement*) = build("fa-floppy-o", m)

    def `fa-square` = add("fa-square")

    def `fa-square`(m: => CustomReactiveElement*) = build("fa-square", m)

    def `fa-navicon` = add("fa-navicon")

    def `fa-navicon`(m: => CustomReactiveElement*) = build("fa-navicon", m)

    def `fa-reorder` = add("fa-reorder")

    def `fa-reorder`(m: => CustomReactiveElement*) = build("fa-reorder", m)

    def `fa-bars` = add("fa-bars")

    def `fa-bars`(m: => CustomReactiveElement*) = build("fa-bars", m)

    def `fa-list-ul` = add("fa-list-ul")

    def `fa-list-ul`(m: => CustomReactiveElement*) = build("fa-list-ul", m)

    def `fa-list-ol` = add("fa-list-ol")

    def `fa-list-ol`(m: => CustomReactiveElement*) = build("fa-list-ol", m)

    def `fa-strikethrough` = add("fa-strikethrough")

    def `fa-strikethrough`(m: => CustomReactiveElement*) = build("fa-strikethrough", m)

    def `fa-underline` = add("fa-underline")

    def `fa-underline`(m: => CustomReactiveElement*) = build("fa-underline", m)

    def `fa-table` = add("fa-table")

    def `fa-table`(m: => CustomReactiveElement*) = build("fa-table", m)

    def `fa-magic` = add("fa-magic")

    def `fa-magic`(m: => CustomReactiveElement*) = build("fa-magic", m)

    def `fa-truck` = add("fa-truck")

    def `fa-truck`(m: => CustomReactiveElement*) = build("fa-truck", m)

    def `fa-pinterest` = add("fa-pinterest")

    def `fa-pinterest`(m: => CustomReactiveElement*) = build("fa-pinterest", m)

    def `fa-pinterest-square` = add("fa-pinterest-square")

    def `fa-pinterest-square`(m: => CustomReactiveElement*) = build("fa-pinterest-square", m)

    def `fa-google-plus-square` = add("fa-google-plus-square")

    def `fa-google-plus-square`(m: => CustomReactiveElement*) = build("fa-google-plus-square", m)

    def `fa-google-plus` = add("fa-google-plus")

    def `fa-google-plus`(m: => CustomReactiveElement*) = build("fa-google-plus", m)

    def `fa-money` = add("fa-money")

    def `fa-money`(m: => CustomReactiveElement*) = build("fa-money", m)

    def `fa-caret-down` = add("fa-caret-down")

    def `fa-caret-down`(m: => CustomReactiveElement*) = build("fa-caret-down", m)

    def `fa-caret-up` = add("fa-caret-up")

    def `fa-caret-up`(m: => CustomReactiveElement*) = build("fa-caret-up", m)

    def `fa-caret-left` = add("fa-caret-left")

    def `fa-caret-left`(m: => CustomReactiveElement*) = build("fa-caret-left", m)

    def `fa-caret-right` = add("fa-caret-right")

    def `fa-caret-right`(m: => CustomReactiveElement*) = build("fa-caret-right", m)

    def `fa-columns` = add("fa-columns")

    def `fa-columns`(m: => CustomReactiveElement*) = build("fa-columns", m)

    def `fa-unsorted` = add("fa-unsorted")

    def `fa-unsorted`(m: => CustomReactiveElement*) = build("fa-unsorted", m)

    def `fa-sort` = add("fa-sort")

    def `fa-sort`(m: => CustomReactiveElement*) = build("fa-sort", m)

    def `fa-sort-down` = add("fa-sort-down")

    def `fa-sort-down`(m: => CustomReactiveElement*) = build("fa-sort-down", m)

    def `fa-sort-desc` = add("fa-sort-desc")

    def `fa-sort-desc`(m: => CustomReactiveElement*) = build("fa-sort-desc", m)

    def `fa-sort-up` = add("fa-sort-up")

    def `fa-sort-up`(m: => CustomReactiveElement*) = build("fa-sort-up", m)

    def `fa-sort-asc` = add("fa-sort-asc")

    def `fa-sort-asc`(m: => CustomReactiveElement*) = build("fa-sort-asc", m)

    def `fa-envelope` = add("fa-envelope")

    def `fa-envelope`(m: => CustomReactiveElement*) = build("fa-envelope", m)

    def `fa-linkedin` = add("fa-linkedin")

    def `fa-linkedin`(m: => CustomReactiveElement*) = build("fa-linkedin", m)

    def `fa-rotate-left` = add("fa-rotate-left")

    def `fa-rotate-left`(m: => CustomReactiveElement*) = build("fa-rotate-left", m)

    def `fa-undo` = add("fa-undo")

    def `fa-undo`(m: => CustomReactiveElement*) = build("fa-undo", m)

    def `fa-legal` = add("fa-legal")

    def `fa-legal`(m: => CustomReactiveElement*) = build("fa-legal", m)

    def `fa-gavel` = add("fa-gavel")

    def `fa-gavel`(m: => CustomReactiveElement*) = build("fa-gavel", m)

    def `fa-dashboard` = add("fa-dashboard")

    def `fa-dashboard`(m: => CustomReactiveElement*) = build("fa-dashboard", m)

    def `fa-tachometer` = add("fa-tachometer")

    def `fa-tachometer`(m: => CustomReactiveElement*) = build("fa-tachometer", m)

    def `fa-comment-o` = add("fa-comment-o")

    def `fa-comment-o`(m: => CustomReactiveElement*) = build("fa-comment-o", m)

    def `fa-comments-o` = add("fa-comments-o")

    def `fa-comments-o`(m: => CustomReactiveElement*) = build("fa-comments-o", m)

    def `fa-flash` = add("fa-flash")

    def `fa-flash`(m: => CustomReactiveElement*) = build("fa-flash", m)

    def `fa-bolt` = add("fa-bolt")

    def `fa-bolt`(m: => CustomReactiveElement*) = build("fa-bolt", m)

    def `fa-sitemap` = add("fa-sitemap")

    def `fa-sitemap`(m: => CustomReactiveElement*) = build("fa-sitemap", m)

    def `fa-umbrella` = add("fa-umbrella")

    def `fa-umbrella`(m: => CustomReactiveElement*) = build("fa-umbrella", m)

    def `fa-paste` = add("fa-paste")

    def `fa-paste`(m: => CustomReactiveElement*) = build("fa-paste", m)

    def `fa-clipboard` = add("fa-clipboard")

    def `fa-clipboard`(m: => CustomReactiveElement*) = build("fa-clipboard", m)

    def `fa-lightbulb-o` = add("fa-lightbulb-o")

    def `fa-lightbulb-o`(m: => CustomReactiveElement*) = build("fa-lightbulb-o", m)

    def `fa-exchange` = add("fa-exchange")

    def `fa-exchange`(m: => CustomReactiveElement*) = build("fa-exchange", m)

    def `fa-cloud-download` = add("fa-cloud-download")

    def `fa-cloud-download`(m: => CustomReactiveElement*) = build("fa-cloud-download", m)

    def `fa-cloud-upload` = add("fa-cloud-upload")

    def `fa-cloud-upload`(m: => CustomReactiveElement*) = build("fa-cloud-upload", m)

    def `fa-user-md` = add("fa-user-md")

    def `fa-user-md`(m: => CustomReactiveElement*) = build("fa-user-md", m)

    def `fa-stethoscope` = add("fa-stethoscope")

    def `fa-stethoscope`(m: => CustomReactiveElement*) = build("fa-stethoscope", m)

    def `fa-suitcase` = add("fa-suitcase")

    def `fa-suitcase`(m: => CustomReactiveElement*) = build("fa-suitcase", m)

    def `fa-bell-o` = add("fa-bell-o")

    def `fa-bell-o`(m: => CustomReactiveElement*) = build("fa-bell-o", m)

    def `fa-coffee` = add("fa-coffee")

    def `fa-coffee`(m: => CustomReactiveElement*) = build("fa-coffee", m)

    def `fa-cutlery` = add("fa-cutlery")

    def `fa-cutlery`(m: => CustomReactiveElement*) = build("fa-cutlery", m)

    def `fa-file-text-o` = add("fa-file-text-o")

    def `fa-file-text-o`(m: => CustomReactiveElement*) = build("fa-file-text-o", m)

    def `fa-building-o` = add("fa-building-o")

    def `fa-building-o`(m: => CustomReactiveElement*) = build("fa-building-o", m)

    def `fa-hospital-o` = add("fa-hospital-o")

    def `fa-hospital-o`(m: => CustomReactiveElement*) = build("fa-hospital-o", m)

    def `fa-ambulance` = add("fa-ambulance")

    def `fa-ambulance`(m: => CustomReactiveElement*) = build("fa-ambulance", m)

    def `fa-medkit` = add("fa-medkit")

    def `fa-medkit`(m: => CustomReactiveElement*) = build("fa-medkit", m)

    def `fa-fighter-jet` = add("fa-fighter-jet")

    def `fa-fighter-jet`(m: => CustomReactiveElement*) = build("fa-fighter-jet", m)

    def `fa-beer` = add("fa-beer")

    def `fa-beer`(m: => CustomReactiveElement*) = build("fa-beer", m)

    def `fa-h-square` = add("fa-h-square")

    def `fa-h-square`(m: => CustomReactiveElement*) = build("fa-h-square", m)

    def `fa-plus-square` = add("fa-plus-square")

    def `fa-plus-square`(m: => CustomReactiveElement*) = build("fa-plus-square", m)

    def `fa-angle-double-left` = add("fa-angle-double-left")

    def `fa-angle-double-left`(m: => CustomReactiveElement*) = build("fa-angle-double-left", m)

    def `fa-angle-double-right` = add("fa-angle-double-right")

    def `fa-angle-double-right`(m: => CustomReactiveElement*) = build("fa-angle-double-right", m)

    def `fa-angle-double-up` = add("fa-angle-double-up")

    def `fa-angle-double-up`(m: => CustomReactiveElement*) = build("fa-angle-double-up", m)

    def `fa-angle-double-down` = add("fa-angle-double-down")

    def `fa-angle-double-down`(m: => CustomReactiveElement*) = build("fa-angle-double-down", m)

    def `fa-angle-left` = add("fa-angle-left")

    def `fa-angle-left`(m: => CustomReactiveElement*) = build("fa-angle-left", m)

    def `fa-angle-right` = add("fa-angle-right")

    def `fa-angle-right`(m: => CustomReactiveElement*) = build("fa-angle-right", m)

    def `fa-angle-up` = add("fa-angle-up")

    def `fa-angle-up`(m: => CustomReactiveElement*) = build("fa-angle-up", m)

    def `fa-angle-down` = add("fa-angle-down")

    def `fa-angle-down`(m: => CustomReactiveElement*) = build("fa-angle-down", m)

    def `fa-desktop` = add("fa-desktop")

    def `fa-desktop`(m: => CustomReactiveElement*) = build("fa-desktop", m)

    def `fa-laptop` = add("fa-laptop")

    def `fa-laptop`(m: => CustomReactiveElement*) = build("fa-laptop", m)

    def `fa-tablet` = add("fa-tablet")

    def `fa-tablet`(m: => CustomReactiveElement*) = build("fa-tablet", m)

    def `fa-mobile-phone` = add("fa-mobile-phone")

    def `fa-mobile-phone`(m: => CustomReactiveElement*) = build("fa-mobile-phone", m)

    def `fa-mobile` = add("fa-mobile")

    def `fa-mobile`(m: => CustomReactiveElement*) = build("fa-mobile", m)

    def `fa-circle-o` = add("fa-circle-o")

    def `fa-circle-o`(m: => CustomReactiveElement*) = build("fa-circle-o", m)

    def `fa-quote-left` = add("fa-quote-left")

    def `fa-quote-left`(m: => CustomReactiveElement*) = build("fa-quote-left", m)

    def `fa-quote-right` = add("fa-quote-right")

    def `fa-quote-right`(m: => CustomReactiveElement*) = build("fa-quote-right", m)

    def `fa-spinner` = add("fa-spinner")

    def `fa-spinner`(m: => CustomReactiveElement*) = build("fa-spinner", m)

    def `fa-circle` = add("fa-circle")

    def `fa-circle`(m: => CustomReactiveElement*) = build("fa-circle", m)

    def `fa-mail-reply` = add("fa-mail-reply")

    def `fa-mail-reply`(m: => CustomReactiveElement*) = build("fa-mail-reply", m)

    def `fa-reply` = add("fa-reply")

    def `fa-reply`(m: => CustomReactiveElement*) = build("fa-reply", m)

    def `fa-github-alt` = add("fa-github-alt")

    def `fa-github-alt`(m: => CustomReactiveElement*) = build("fa-github-alt", m)

    def `fa-folder-o` = add("fa-folder-o")

    def `fa-folder-o`(m: => CustomReactiveElement*) = build("fa-folder-o", m)

    def `fa-folder-open-o` = add("fa-folder-open-o")

    def `fa-folder-open-o`(m: => CustomReactiveElement*) = build("fa-folder-open-o", m)

    def `fa-smile-o` = add("fa-smile-o")

    def `fa-smile-o`(m: => CustomReactiveElement*) = build("fa-smile-o", m)

    def `fa-frown-o` = add("fa-frown-o")

    def `fa-frown-o`(m: => CustomReactiveElement*) = build("fa-frown-o", m)

    def `fa-meh-o` = add("fa-meh-o")

    def `fa-meh-o`(m: => CustomReactiveElement*) = build("fa-meh-o", m)

    def `fa-gamepad` = add("fa-gamepad")

    def `fa-gamepad`(m: => CustomReactiveElement*) = build("fa-gamepad", m)

    def `fa-keyboard-o` = add("fa-keyboard-o")

    def `fa-keyboard-o`(m: => CustomReactiveElement*) = build("fa-keyboard-o", m)

    def `fa-flag-o` = add("fa-flag-o")

    def `fa-flag-o`(m: => CustomReactiveElement*) = build("fa-flag-o", m)

    def `fa-flag-checkered` = add("fa-flag-checkered")

    def `fa-flag-checkered`(m: => CustomReactiveElement*) = build("fa-flag-checkered", m)

    def `fa-terminal` = add("fa-terminal")

    def `fa-terminal`(m: => CustomReactiveElement*) = build("fa-terminal", m)

    def `fa-code` = add("fa-code")

    def `fa-code`(m: => CustomReactiveElement*) = build("fa-code", m)

    def `fa-mail-reply-all` = add("fa-mail-reply-all")

    def `fa-mail-reply-all`(m: => CustomReactiveElement*) = build("fa-mail-reply-all", m)

    def `fa-reply-all` = add("fa-reply-all")

    def `fa-reply-all`(m: => CustomReactiveElement*) = build("fa-reply-all", m)

    def `fa-star-half-empty` = add("fa-star-half-empty")

    def `fa-star-half-empty`(m: => CustomReactiveElement*) = build("fa-star-half-empty", m)

    def `fa-star-half-full` = add("fa-star-half-full")

    def `fa-star-half-full`(m: => CustomReactiveElement*) = build("fa-star-half-full", m)

    def `fa-star-half-o` = add("fa-star-half-o")

    def `fa-star-half-o`(m: => CustomReactiveElement*) = build("fa-star-half-o", m)

    def `fa-location-arrow` = add("fa-location-arrow")

    def `fa-location-arrow`(m: => CustomReactiveElement*) = build("fa-location-arrow", m)

    def `fa-crop` = add("fa-crop")

    def `fa-crop`(m: => CustomReactiveElement*) = build("fa-crop", m)

    def `fa-code-fork` = add("fa-code-fork")

    def `fa-code-fork`(m: => CustomReactiveElement*) = build("fa-code-fork", m)

    def `fa-unlink` = add("fa-unlink")

    def `fa-unlink`(m: => CustomReactiveElement*) = build("fa-unlink", m)

    def `fa-chain-broken` = add("fa-chain-broken")

    def `fa-chain-broken`(m: => CustomReactiveElement*) = build("fa-chain-broken", m)

    def `fa-question` = add("fa-question")

    def `fa-question`(m: => CustomReactiveElement*) = build("fa-question", m)

    def `fa-info` = add("fa-info")

    def `fa-info`(m: => CustomReactiveElement*) = build("fa-info", m)

    def `fa-exclamation` = add("fa-exclamation")

    def `fa-exclamation`(m: => CustomReactiveElement*) = build("fa-exclamation", m)

    def `fa-superscript` = add("fa-superscript")

    def `fa-superscript`(m: => CustomReactiveElement*) = build("fa-superscript", m)

    def `fa-subscript` = add("fa-subscript")

    def `fa-subscript`(m: => CustomReactiveElement*) = build("fa-subscript", m)

    def `fa-eraser` = add("fa-eraser")

    def `fa-eraser`(m: => CustomReactiveElement*) = build("fa-eraser", m)

    def `fa-puzzle-piece` = add("fa-puzzle-piece")

    def `fa-puzzle-piece`(m: => CustomReactiveElement*) = build("fa-puzzle-piece", m)

    def `fa-microphone` = add("fa-microphone")

    def `fa-microphone`(m: => CustomReactiveElement*) = build("fa-microphone", m)

    def `fa-microphone-slash` = add("fa-microphone-slash")

    def `fa-microphone-slash`(m: => CustomReactiveElement*) = build("fa-microphone-slash", m)

    def `fa-shield` = add("fa-shield")

    def `fa-shield`(m: => CustomReactiveElement*) = build("fa-shield", m)

    def `fa-calendar-o` = add("fa-calendar-o")

    def `fa-calendar-o`(m: => CustomReactiveElement*) = build("fa-calendar-o", m)

    def `fa-fire-extinguisher` = add("fa-fire-extinguisher")

    def `fa-fire-extinguisher`(m: => CustomReactiveElement*) = build("fa-fire-extinguisher", m)

    def `fa-rocket` = add("fa-rocket")

    def `fa-rocket`(m: => CustomReactiveElement*) = build("fa-rocket", m)

    def `fa-maxcdn` = add("fa-maxcdn")

    def `fa-maxcdn`(m: => CustomReactiveElement*) = build("fa-maxcdn", m)

    def `fa-chevron-circle-left` = add("fa-chevron-circle-left")

    def `fa-chevron-circle-left`(m: => CustomReactiveElement*) = build("fa-chevron-circle-left", m)

    def `fa-chevron-circle-right` = add("fa-chevron-circle-right")

    def `fa-chevron-circle-right`(m: => CustomReactiveElement*) = build("fa-chevron-circle-right", m)

    def `fa-chevron-circle-up` = add("fa-chevron-circle-up")

    def `fa-chevron-circle-up`(m: => CustomReactiveElement*) = build("fa-chevron-circle-up", m)

    def `fa-chevron-circle-down` = add("fa-chevron-circle-down")

    def `fa-chevron-circle-down`(m: => CustomReactiveElement*) = build("fa-chevron-circle-down", m)

    def `fa-html5` = add("fa-html5")

    def `fa-html5`(m: => CustomReactiveElement*) = build("fa-html5", m)

    def `fa-css3` = add("fa-css3")

    def `fa-css3`(m: => CustomReactiveElement*) = build("fa-css3", m)

    def `fa-anchor` = add("fa-anchor")

    def `fa-anchor`(m: => CustomReactiveElement*) = build("fa-anchor", m)

    def `fa-unlock-alt` = add("fa-unlock-alt")

    def `fa-unlock-alt`(m: => CustomReactiveElement*) = build("fa-unlock-alt", m)

    def `fa-bullseye` = add("fa-bullseye")

    def `fa-bullseye`(m: => CustomReactiveElement*) = build("fa-bullseye", m)

    def `fa-ellipsis-h` = add("fa-ellipsis-h")

    def `fa-ellipsis-h`(m: => CustomReactiveElement*) = build("fa-ellipsis-h", m)

    def `fa-ellipsis-v` = add("fa-ellipsis-v")

    def `fa-ellipsis-v`(m: => CustomReactiveElement*) = build("fa-ellipsis-v", m)

    def `fa-rss-square` = add("fa-rss-square")

    def `fa-rss-square`(m: => CustomReactiveElement*) = build("fa-rss-square", m)

    def `fa-play-circle` = add("fa-play-circle")

    def `fa-play-circle`(m: => CustomReactiveElement*) = build("fa-play-circle", m)

    def `fa-ticket` = add("fa-ticket")

    def `fa-ticket`(m: => CustomReactiveElement*) = build("fa-ticket", m)

    def `fa-minus-square` = add("fa-minus-square")

    def `fa-minus-square`(m: => CustomReactiveElement*) = build("fa-minus-square", m)

    def `fa-minus-square-o` = add("fa-minus-square-o")

    def `fa-minus-square-o`(m: => CustomReactiveElement*) = build("fa-minus-square-o", m)

    def `fa-level-up` = add("fa-level-up")

    def `fa-level-up`(m: => CustomReactiveElement*) = build("fa-level-up", m)

    def `fa-level-down` = add("fa-level-down")

    def `fa-level-down`(m: => CustomReactiveElement*) = build("fa-level-down", m)

    def `fa-check-square` = add("fa-check-square")

    def `fa-check-square`(m: => CustomReactiveElement*) = build("fa-check-square", m)

    def `fa-pencil-square` = add("fa-pencil-square")

    def `fa-pencil-square`(m: => CustomReactiveElement*) = build("fa-pencil-square", m)

    def `fa-external-link-square` = add("fa-external-link-square")

    def `fa-external-link-square`(m: => CustomReactiveElement*) = build("fa-external-link-square", m)

    def `fa-share-square` = add("fa-share-square")

    def `fa-share-square`(m: => CustomReactiveElement*) = build("fa-share-square", m)

    def `fa-compass` = add("fa-compass")

    def `fa-compass`(m: => CustomReactiveElement*) = build("fa-compass", m)

    def `fa-toggle-down` = add("fa-toggle-down")

    def `fa-toggle-down`(m: => CustomReactiveElement*) = build("fa-toggle-down", m)

    def `fa-caret-square-o-down` = add("fa-caret-square-o-down")

    def `fa-caret-square-o-down`(m: => CustomReactiveElement*) = build("fa-caret-square-o-down", m)

    def `fa-toggle-up` = add("fa-toggle-up")

    def `fa-toggle-up`(m: => CustomReactiveElement*) = build("fa-toggle-up", m)

    def `fa-caret-square-o-up` = add("fa-caret-square-o-up")

    def `fa-caret-square-o-up`(m: => CustomReactiveElement*) = build("fa-caret-square-o-up", m)

    def `fa-toggle-right` = add("fa-toggle-right")

    def `fa-toggle-right`(m: => CustomReactiveElement*) = build("fa-toggle-right", m)

    def `fa-caret-square-o-right` = add("fa-caret-square-o-right")

    def `fa-caret-square-o-right`(m: => CustomReactiveElement*) = build("fa-caret-square-o-right", m)

    def `fa-euro` = add("fa-euro")

    def `fa-euro`(m: => CustomReactiveElement*) = build("fa-euro", m)

    def `fa-eur` = add("fa-eur")

    def `fa-eur`(m: => CustomReactiveElement*) = build("fa-eur", m)

    def `fa-gbp` = add("fa-gbp")

    def `fa-gbp`(m: => CustomReactiveElement*) = build("fa-gbp", m)

    def `fa-dollar` = add("fa-dollar")

    def `fa-dollar`(m: => CustomReactiveElement*) = build("fa-dollar", m)

    def `fa-usd` = add("fa-usd")

    def `fa-usd`(m: => CustomReactiveElement*) = build("fa-usd", m)

    def `fa-rupee` = add("fa-rupee")

    def `fa-rupee`(m: => CustomReactiveElement*) = build("fa-rupee", m)

    def `fa-inr` = add("fa-inr")

    def `fa-inr`(m: => CustomReactiveElement*) = build("fa-inr", m)

    def `fa-cny` = add("fa-cny")

    def `fa-cny`(m: => CustomReactiveElement*) = build("fa-cny", m)

    def `fa-rmb` = add("fa-rmb")

    def `fa-rmb`(m: => CustomReactiveElement*) = build("fa-rmb", m)

    def `fa-yen` = add("fa-yen")

    def `fa-yen`(m: => CustomReactiveElement*) = build("fa-yen", m)

    def `fa-jpy` = add("fa-jpy")

    def `fa-jpy`(m: => CustomReactiveElement*) = build("fa-jpy", m)

    def `fa-ruble` = add("fa-ruble")

    def `fa-ruble`(m: => CustomReactiveElement*) = build("fa-ruble", m)

    def `fa-rouble` = add("fa-rouble")

    def `fa-rouble`(m: => CustomReactiveElement*) = build("fa-rouble", m)

    def `fa-rub` = add("fa-rub")

    def `fa-rub`(m: => CustomReactiveElement*) = build("fa-rub", m)

    def `fa-won` = add("fa-won")

    def `fa-won`(m: => CustomReactiveElement*) = build("fa-won", m)

    def `fa-krw` = add("fa-krw")

    def `fa-krw`(m: => CustomReactiveElement*) = build("fa-krw", m)

    def `fa-bitcoin` = add("fa-bitcoin")

    def `fa-bitcoin`(m: => CustomReactiveElement*) = build("fa-bitcoin", m)

    def `fa-btc` = add("fa-btc")

    def `fa-btc`(m: => CustomReactiveElement*) = build("fa-btc", m)

    def `fa-file` = add("fa-file")

    def `fa-file`(m: => CustomReactiveElement*) = build("fa-file", m)

    def `fa-file-text` = add("fa-file-text")

    def `fa-file-text`(m: => CustomReactiveElement*) = build("fa-file-text", m)

    def `fa-sort-alpha-asc` = add("fa-sort-alpha-asc")

    def `fa-sort-alpha-asc`(m: => CustomReactiveElement*) = build("fa-sort-alpha-asc", m)

    def `fa-sort-alpha-desc` = add("fa-sort-alpha-desc")

    def `fa-sort-alpha-desc`(m: => CustomReactiveElement*) = build("fa-sort-alpha-desc", m)

    def `fa-sort-amount-asc` = add("fa-sort-amount-asc")

    def `fa-sort-amount-asc`(m: => CustomReactiveElement*) = build("fa-sort-amount-asc", m)

    def `fa-sort-amount-desc` = add("fa-sort-amount-desc")

    def `fa-sort-amount-desc`(m: => CustomReactiveElement*) = build("fa-sort-amount-desc", m)

    def `fa-sort-numeric-asc` = add("fa-sort-numeric-asc")

    def `fa-sort-numeric-asc`(m: => CustomReactiveElement*) = build("fa-sort-numeric-asc", m)

    def `fa-sort-numeric-desc` = add("fa-sort-numeric-desc")

    def `fa-sort-numeric-desc`(m: => CustomReactiveElement*) = build("fa-sort-numeric-desc", m)

    def `fa-thumbs-up` = add("fa-thumbs-up")

    def `fa-thumbs-up`(m: => CustomReactiveElement*) = build("fa-thumbs-up", m)

    def `fa-thumbs-down` = add("fa-thumbs-down")

    def `fa-thumbs-down`(m: => CustomReactiveElement*) = build("fa-thumbs-down", m)

    def `fa-youtube-square` = add("fa-youtube-square")

    def `fa-youtube-square`(m: => CustomReactiveElement*) = build("fa-youtube-square", m)

    def `fa-youtube` = add("fa-youtube")

    def `fa-youtube`(m: => CustomReactiveElement*) = build("fa-youtube", m)

    def `fa-xing` = add("fa-xing")

    def `fa-xing`(m: => CustomReactiveElement*) = build("fa-xing", m)

    def `fa-xing-square` = add("fa-xing-square")

    def `fa-xing-square`(m: => CustomReactiveElement*) = build("fa-xing-square", m)

    def `fa-youtube-play` = add("fa-youtube-play")

    def `fa-youtube-play`(m: => CustomReactiveElement*) = build("fa-youtube-play", m)

    def `fa-dropbox` = add("fa-dropbox")

    def `fa-dropbox`(m: => CustomReactiveElement*) = build("fa-dropbox", m)

    def `fa-stack-overflow` = add("fa-stack-overflow")

    def `fa-stack-overflow`(m: => CustomReactiveElement*) = build("fa-stack-overflow", m)

    def `fa-instagram` = add("fa-instagram")

    def `fa-instagram`(m: => CustomReactiveElement*) = build("fa-instagram", m)

    def `fa-flickr` = add("fa-flickr")

    def `fa-flickr`(m: => CustomReactiveElement*) = build("fa-flickr", m)

    def `fa-adn` = add("fa-adn")

    def `fa-adn`(m: => CustomReactiveElement*) = build("fa-adn", m)

    def `fa-bitbucket` = add("fa-bitbucket")

    def `fa-bitbucket`(m: => CustomReactiveElement*) = build("fa-bitbucket", m)

    def `fa-bitbucket-square` = add("fa-bitbucket-square")

    def `fa-bitbucket-square`(m: => CustomReactiveElement*) = build("fa-bitbucket-square", m)

    def `fa-tumblr` = add("fa-tumblr")

    def `fa-tumblr`(m: => CustomReactiveElement*) = build("fa-tumblr", m)

    def `fa-tumblr-square` = add("fa-tumblr-square")

    def `fa-tumblr-square`(m: => CustomReactiveElement*) = build("fa-tumblr-square", m)

    def `fa-long-arrow-down` = add("fa-long-arrow-down")

    def `fa-long-arrow-down`(m: => CustomReactiveElement*) = build("fa-long-arrow-down", m)

    def `fa-long-arrow-up` = add("fa-long-arrow-up")

    def `fa-long-arrow-up`(m: => CustomReactiveElement*) = build("fa-long-arrow-up", m)

    def `fa-long-arrow-left` = add("fa-long-arrow-left")

    def `fa-long-arrow-left`(m: => CustomReactiveElement*) = build("fa-long-arrow-left", m)

    def `fa-long-arrow-right` = add("fa-long-arrow-right")

    def `fa-long-arrow-right`(m: => CustomReactiveElement*) = build("fa-long-arrow-right", m)

    def `fa-apple` = add("fa-apple")

    def `fa-apple`(m: => CustomReactiveElement*) = build("fa-apple", m)

    def `fa-windows` = add("fa-windows")

    def `fa-windows`(m: => CustomReactiveElement*) = build("fa-windows", m)

    def `fa-android` = add("fa-android")

    def `fa-android`(m: => CustomReactiveElement*) = build("fa-android", m)

    def `fa-linux` = add("fa-linux")

    def `fa-linux`(m: => CustomReactiveElement*) = build("fa-linux", m)

    def `fa-dribbble` = add("fa-dribbble")

    def `fa-dribbble`(m: => CustomReactiveElement*) = build("fa-dribbble", m)

    def `fa-skype` = add("fa-skype")

    def `fa-skype`(m: => CustomReactiveElement*) = build("fa-skype", m)

    def `fa-foursquare` = add("fa-foursquare")

    def `fa-foursquare`(m: => CustomReactiveElement*) = build("fa-foursquare", m)

    def `fa-trello` = add("fa-trello")

    def `fa-trello`(m: => CustomReactiveElement*) = build("fa-trello", m)

    def `fa-female` = add("fa-female")

    def `fa-female`(m: => CustomReactiveElement*) = build("fa-female", m)

    def `fa-male` = add("fa-male")

    def `fa-male`(m: => CustomReactiveElement*) = build("fa-male", m)

    def `fa-gittip` = add("fa-gittip")

    def `fa-gittip`(m: => CustomReactiveElement*) = build("fa-gittip", m)

    def `fa-gratipay` = add("fa-gratipay")

    def `fa-gratipay`(m: => CustomReactiveElement*) = build("fa-gratipay", m)

    def `fa-sun-o` = add("fa-sun-o")

    def `fa-sun-o`(m: => CustomReactiveElement*) = build("fa-sun-o", m)

    def `fa-moon-o` = add("fa-moon-o")

    def `fa-moon-o`(m: => CustomReactiveElement*) = build("fa-moon-o", m)

    def `fa-archive` = add("fa-archive")

    def `fa-archive`(m: => CustomReactiveElement*) = build("fa-archive", m)

    def `fa-bug` = add("fa-bug")

    def `fa-bug`(m: => CustomReactiveElement*) = build("fa-bug", m)

    def `fa-vk` = add("fa-vk")

    def `fa-vk`(m: => CustomReactiveElement*) = build("fa-vk", m)

    def `fa-weibo` = add("fa-weibo")

    def `fa-weibo`(m: => CustomReactiveElement*) = build("fa-weibo", m)

    def `fa-renren` = add("fa-renren")

    def `fa-renren`(m: => CustomReactiveElement*) = build("fa-renren", m)

    def `fa-pagelines` = add("fa-pagelines")

    def `fa-pagelines`(m: => CustomReactiveElement*) = build("fa-pagelines", m)

    def `fa-stack-exchange` = add("fa-stack-exchange")

    def `fa-stack-exchange`(m: => CustomReactiveElement*) = build("fa-stack-exchange", m)

    def `fa-arrow-circle-o-right` = add("fa-arrow-circle-o-right")

    def `fa-arrow-circle-o-right`(m: => CustomReactiveElement*) = build("fa-arrow-circle-o-right", m)

    def `fa-arrow-circle-o-left` = add("fa-arrow-circle-o-left")

    def `fa-arrow-circle-o-left`(m: => CustomReactiveElement*) = build("fa-arrow-circle-o-left", m)

    def `fa-toggle-left` = add("fa-toggle-left")

    def `fa-toggle-left`(m: => CustomReactiveElement*) = build("fa-toggle-left", m)

    def `fa-caret-square-o-left` = add("fa-caret-square-o-left")

    def `fa-caret-square-o-left`(m: => CustomReactiveElement*) = build("fa-caret-square-o-left", m)

    def `fa-dot-circle-o` = add("fa-dot-circle-o")

    def `fa-dot-circle-o`(m: => CustomReactiveElement*) = build("fa-dot-circle-o", m)

    def `fa-wheelchair` = add("fa-wheelchair")

    def `fa-wheelchair`(m: => CustomReactiveElement*) = build("fa-wheelchair", m)

    def `fa-vimeo-square` = add("fa-vimeo-square")

    def `fa-vimeo-square`(m: => CustomReactiveElement*) = build("fa-vimeo-square", m)

    def `fa-turkish-lira` = add("fa-turkish-lira")

    def `fa-turkish-lira`(m: => CustomReactiveElement*) = build("fa-turkish-lira", m)

    def `fa-try` = add("fa-try")

    def `fa-try`(m: => CustomReactiveElement*) = build("fa-try", m)

    def `fa-plus-square-o` = add("fa-plus-square-o")

    def `fa-plus-square-o`(m: => CustomReactiveElement*) = build("fa-plus-square-o", m)

    def `fa-space-shuttle` = add("fa-space-shuttle")

    def `fa-space-shuttle`(m: => CustomReactiveElement*) = build("fa-space-shuttle", m)

    def `fa-slack` = add("fa-slack")

    def `fa-slack`(m: => CustomReactiveElement*) = build("fa-slack", m)

    def `fa-envelope-square` = add("fa-envelope-square")

    def `fa-envelope-square`(m: => CustomReactiveElement*) = build("fa-envelope-square", m)

    def `fa-wordpress` = add("fa-wordpress")

    def `fa-wordpress`(m: => CustomReactiveElement*) = build("fa-wordpress", m)

    def `fa-openid` = add("fa-openid")

    def `fa-openid`(m: => CustomReactiveElement*) = build("fa-openid", m)

    def `fa-institution` = add("fa-institution")

    def `fa-institution`(m: => CustomReactiveElement*) = build("fa-institution", m)

    def `fa-bank` = add("fa-bank")

    def `fa-bank`(m: => CustomReactiveElement*) = build("fa-bank", m)

    def `fa-university` = add("fa-university")

    def `fa-university`(m: => CustomReactiveElement*) = build("fa-university", m)

    def `fa-mortar-board` = add("fa-mortar-board")

    def `fa-mortar-board`(m: => CustomReactiveElement*) = build("fa-mortar-board", m)

    def `fa-graduation-cap` = add("fa-graduation-cap")

    def `fa-graduation-cap`(m: => CustomReactiveElement*) = build("fa-graduation-cap", m)

    def `fa-yahoo` = add("fa-yahoo")

    def `fa-yahoo`(m: => CustomReactiveElement*) = build("fa-yahoo", m)

    def `fa-google` = add("fa-google")

    def `fa-google`(m: => CustomReactiveElement*) = build("fa-google", m)

    def `fa-reddit` = add("fa-reddit")

    def `fa-reddit`(m: => CustomReactiveElement*) = build("fa-reddit", m)

    def `fa-reddit-square` = add("fa-reddit-square")

    def `fa-reddit-square`(m: => CustomReactiveElement*) = build("fa-reddit-square", m)

    def `fa-stumbleupon-circle` = add("fa-stumbleupon-circle")

    def `fa-stumbleupon-circle`(m: => CustomReactiveElement*) = build("fa-stumbleupon-circle", m)

    def `fa-stumbleupon` = add("fa-stumbleupon")

    def `fa-stumbleupon`(m: => CustomReactiveElement*) = build("fa-stumbleupon", m)

    def `fa-delicious` = add("fa-delicious")

    def `fa-delicious`(m: => CustomReactiveElement*) = build("fa-delicious", m)

    def `fa-digg` = add("fa-digg")

    def `fa-digg`(m: => CustomReactiveElement*) = build("fa-digg", m)

    def `fa-pied-piper-pp` = add("fa-pied-piper-pp")

    def `fa-pied-piper-pp`(m: => CustomReactiveElement*) = build("fa-pied-piper-pp", m)

    def `fa-pied-piper-alt` = add("fa-pied-piper-alt")

    def `fa-pied-piper-alt`(m: => CustomReactiveElement*) = build("fa-pied-piper-alt", m)

    def `fa-drupal` = add("fa-drupal")

    def `fa-drupal`(m: => CustomReactiveElement*) = build("fa-drupal", m)

    def `fa-joomla` = add("fa-joomla")

    def `fa-joomla`(m: => CustomReactiveElement*) = build("fa-joomla", m)

    def `fa-language` = add("fa-language")

    def `fa-language`(m: => CustomReactiveElement*) = build("fa-language", m)

    def `fa-fax` = add("fa-fax")

    def `fa-fax`(m: => CustomReactiveElement*) = build("fa-fax", m)

    def `fa-building` = add("fa-building")

    def `fa-building`(m: => CustomReactiveElement*) = build("fa-building", m)

    def `fa-child` = add("fa-child")

    def `fa-child`(m: => CustomReactiveElement*) = build("fa-child", m)

    def `fa-paw` = add("fa-paw")

    def `fa-paw`(m: => CustomReactiveElement*) = build("fa-paw", m)

    def `fa-spoon` = add("fa-spoon")

    def `fa-spoon`(m: => CustomReactiveElement*) = build("fa-spoon", m)

    def `fa-cube` = add("fa-cube")

    def `fa-cube`(m: => CustomReactiveElement*) = build("fa-cube", m)

    def `fa-cubes` = add("fa-cubes")

    def `fa-cubes`(m: => CustomReactiveElement*) = build("fa-cubes", m)

    def `fa-behance` = add("fa-behance")

    def `fa-behance`(m: => CustomReactiveElement*) = build("fa-behance", m)

    def `fa-behance-square` = add("fa-behance-square")

    def `fa-behance-square`(m: => CustomReactiveElement*) = build("fa-behance-square", m)

    def `fa-steam` = add("fa-steam")

    def `fa-steam`(m: => CustomReactiveElement*) = build("fa-steam", m)

    def `fa-steam-square` = add("fa-steam-square")

    def `fa-steam-square`(m: => CustomReactiveElement*) = build("fa-steam-square", m)

    def `fa-recycle` = add("fa-recycle")

    def `fa-recycle`(m: => CustomReactiveElement*) = build("fa-recycle", m)

    def `fa-automobile` = add("fa-automobile")

    def `fa-automobile`(m: => CustomReactiveElement*) = build("fa-automobile", m)

    def `fa-car` = add("fa-car")

    def `fa-car`(m: => CustomReactiveElement*) = build("fa-car", m)

    def `fa-cab` = add("fa-cab")

    def `fa-cab`(m: => CustomReactiveElement*) = build("fa-cab", m)

    def `fa-taxi` = add("fa-taxi")

    def `fa-taxi`(m: => CustomReactiveElement*) = build("fa-taxi", m)

    def `fa-tree` = add("fa-tree")

    def `fa-tree`(m: => CustomReactiveElement*) = build("fa-tree", m)

    def `fa-spotify` = add("fa-spotify")

    def `fa-spotify`(m: => CustomReactiveElement*) = build("fa-spotify", m)

    def `fa-deviantart` = add("fa-deviantart")

    def `fa-deviantart`(m: => CustomReactiveElement*) = build("fa-deviantart", m)

    def `fa-soundcloud` = add("fa-soundcloud")

    def `fa-soundcloud`(m: => CustomReactiveElement*) = build("fa-soundcloud", m)

    def `fa-database` = add("fa-database")

    def `fa-database`(m: => CustomReactiveElement*) = build("fa-database", m)

    def `fa-file-pdf-o` = add("fa-file-pdf-o")

    def `fa-file-pdf-o`(m: => CustomReactiveElement*) = build("fa-file-pdf-o", m)

    def `fa-file-word-o` = add("fa-file-word-o")

    def `fa-file-word-o`(m: => CustomReactiveElement*) = build("fa-file-word-o", m)

    def `fa-file-excel-o` = add("fa-file-excel-o")

    def `fa-file-excel-o`(m: => CustomReactiveElement*) = build("fa-file-excel-o", m)

    def `fa-file-powerpoint-o` = add("fa-file-powerpoint-o")

    def `fa-file-powerpoint-o`(m: => CustomReactiveElement*) = build("fa-file-powerpoint-o", m)

    def `fa-file-photo-o` = add("fa-file-photo-o")

    def `fa-file-photo-o`(m: => CustomReactiveElement*) = build("fa-file-photo-o", m)

    def `fa-file-picture-o` = add("fa-file-picture-o")

    def `fa-file-picture-o`(m: => CustomReactiveElement*) = build("fa-file-picture-o", m)

    def `fa-file-image-o` = add("fa-file-image-o")

    def `fa-file-image-o`(m: => CustomReactiveElement*) = build("fa-file-image-o", m)

    def `fa-file-zip-o` = add("fa-file-zip-o")

    def `fa-file-zip-o`(m: => CustomReactiveElement*) = build("fa-file-zip-o", m)

    def `fa-file-archive-o` = add("fa-file-archive-o")

    def `fa-file-archive-o`(m: => CustomReactiveElement*) = build("fa-file-archive-o", m)

    def `fa-file-sound-o` = add("fa-file-sound-o")

    def `fa-file-sound-o`(m: => CustomReactiveElement*) = build("fa-file-sound-o", m)

    def `fa-file-audio-o` = add("fa-file-audio-o")

    def `fa-file-audio-o`(m: => CustomReactiveElement*) = build("fa-file-audio-o", m)

    def `fa-file-movie-o` = add("fa-file-movie-o")

    def `fa-file-movie-o`(m: => CustomReactiveElement*) = build("fa-file-movie-o", m)

    def `fa-file-video-o` = add("fa-file-video-o")

    def `fa-file-video-o`(m: => CustomReactiveElement*) = build("fa-file-video-o", m)

    def `fa-file-code-o` = add("fa-file-code-o")

    def `fa-file-code-o`(m: => CustomReactiveElement*) = build("fa-file-code-o", m)

    def `fa-vine` = add("fa-vine")

    def `fa-vine`(m: => CustomReactiveElement*) = build("fa-vine", m)

    def `fa-codepen` = add("fa-codepen")

    def `fa-codepen`(m: => CustomReactiveElement*) = build("fa-codepen", m)

    def `fa-jsfiddle` = add("fa-jsfiddle")

    def `fa-jsfiddle`(m: => CustomReactiveElement*) = build("fa-jsfiddle", m)

    def `fa-life-bouy` = add("fa-life-bouy")

    def `fa-life-bouy`(m: => CustomReactiveElement*) = build("fa-life-bouy", m)

    def `fa-life-buoy` = add("fa-life-buoy")

    def `fa-life-buoy`(m: => CustomReactiveElement*) = build("fa-life-buoy", m)

    def `fa-life-saver` = add("fa-life-saver")

    def `fa-life-saver`(m: => CustomReactiveElement*) = build("fa-life-saver", m)

    def `fa-support` = add("fa-support")

    def `fa-support`(m: => CustomReactiveElement*) = build("fa-support", m)

    def `fa-life-ring` = add("fa-life-ring")

    def `fa-life-ring`(m: => CustomReactiveElement*) = build("fa-life-ring", m)

    def `fa-circle-o-notch` = add("fa-circle-o-notch")

    def `fa-circle-o-notch`(m: => CustomReactiveElement*) = build("fa-circle-o-notch", m)

    def `fa-ra` = add("fa-ra")

    def `fa-ra`(m: => CustomReactiveElement*) = build("fa-ra", m)

    def `fa-resistance` = add("fa-resistance")

    def `fa-resistance`(m: => CustomReactiveElement*) = build("fa-resistance", m)

    def `fa-rebel` = add("fa-rebel")

    def `fa-rebel`(m: => CustomReactiveElement*) = build("fa-rebel", m)

    def `fa-ge` = add("fa-ge")

    def `fa-ge`(m: => CustomReactiveElement*) = build("fa-ge", m)

    def `fa-empire` = add("fa-empire")

    def `fa-empire`(m: => CustomReactiveElement*) = build("fa-empire", m)

    def `fa-git-square` = add("fa-git-square")

    def `fa-git-square`(m: => CustomReactiveElement*) = build("fa-git-square", m)

    def `fa-git` = add("fa-git")

    def `fa-git`(m: => CustomReactiveElement*) = build("fa-git", m)

    def `fa-y-combinator-square` = add("fa-y-combinator-square")

    def `fa-y-combinator-square`(m: => CustomReactiveElement*) = build("fa-y-combinator-square", m)

    def `fa-yc-square` = add("fa-yc-square")

    def `fa-yc-square`(m: => CustomReactiveElement*) = build("fa-yc-square", m)

    def `fa-hacker-news` = add("fa-hacker-news")

    def `fa-hacker-news`(m: => CustomReactiveElement*) = build("fa-hacker-news", m)

    def `fa-tencent-weibo` = add("fa-tencent-weibo")

    def `fa-tencent-weibo`(m: => CustomReactiveElement*) = build("fa-tencent-weibo", m)

    def `fa-qq` = add("fa-qq")

    def `fa-qq`(m: => CustomReactiveElement*) = build("fa-qq", m)

    def `fa-wechat` = add("fa-wechat")

    def `fa-wechat`(m: => CustomReactiveElement*) = build("fa-wechat", m)

    def `fa-weixin` = add("fa-weixin")

    def `fa-weixin`(m: => CustomReactiveElement*) = build("fa-weixin", m)

    def `fa-send` = add("fa-send")

    def `fa-send`(m: => CustomReactiveElement*) = build("fa-send", m)

    def `fa-paper-plane` = add("fa-paper-plane")

    def `fa-paper-plane`(m: => CustomReactiveElement*) = build("fa-paper-plane", m)

    def `fa-send-o` = add("fa-send-o")

    def `fa-send-o`(m: => CustomReactiveElement*) = build("fa-send-o", m)

    def `fa-paper-plane-o` = add("fa-paper-plane-o")

    def `fa-paper-plane-o`(m: => CustomReactiveElement*) = build("fa-paper-plane-o", m)

    def `fa-history` = add("fa-history")

    def `fa-history`(m: => CustomReactiveElement*) = build("fa-history", m)

    def `fa-circle-thin` = add("fa-circle-thin")

    def `fa-circle-thin`(m: => CustomReactiveElement*) = build("fa-circle-thin", m)

    def `fa-header` = add("fa-header")

    def `fa-header`(m: => CustomReactiveElement*) = build("fa-header", m)

    def `fa-paragraph` = add("fa-paragraph")

    def `fa-paragraph`(m: => CustomReactiveElement*) = build("fa-paragraph", m)

    def `fa-sliders` = add("fa-sliders")

    def `fa-sliders`(m: => CustomReactiveElement*) = build("fa-sliders", m)

    def `fa-share-alt` = add("fa-share-alt")

    def `fa-share-alt`(m: => CustomReactiveElement*) = build("fa-share-alt", m)

    def `fa-share-alt-square` = add("fa-share-alt-square")

    def `fa-share-alt-square`(m: => CustomReactiveElement*) = build("fa-share-alt-square", m)

    def `fa-bomb` = add("fa-bomb")

    def `fa-bomb`(m: => CustomReactiveElement*) = build("fa-bomb", m)

    def `fa-soccer-ball-o` = add("fa-soccer-ball-o")

    def `fa-soccer-ball-o`(m: => CustomReactiveElement*) = build("fa-soccer-ball-o", m)

    def `fa-futbol-o` = add("fa-futbol-o")

    def `fa-futbol-o`(m: => CustomReactiveElement*) = build("fa-futbol-o", m)

    def `fa-tty` = add("fa-tty")

    def `fa-tty`(m: => CustomReactiveElement*) = build("fa-tty", m)

    def `fa-binoculars` = add("fa-binoculars")

    def `fa-binoculars`(m: => CustomReactiveElement*) = build("fa-binoculars", m)

    def `fa-plug` = add("fa-plug")

    def `fa-plug`(m: => CustomReactiveElement*) = build("fa-plug", m)

    def `fa-slideshare` = add("fa-slideshare")

    def `fa-slideshare`(m: => CustomReactiveElement*) = build("fa-slideshare", m)

    def `fa-twitch` = add("fa-twitch")

    def `fa-twitch`(m: => CustomReactiveElement*) = build("fa-twitch", m)

    def `fa-yelp` = add("fa-yelp")

    def `fa-yelp`(m: => CustomReactiveElement*) = build("fa-yelp", m)

    def `fa-newspaper-o` = add("fa-newspaper-o")

    def `fa-newspaper-o`(m: => CustomReactiveElement*) = build("fa-newspaper-o", m)

    def `fa-wifi` = add("fa-wifi")

    def `fa-wifi`(m: => CustomReactiveElement*) = build("fa-wifi", m)

    def `fa-calculator` = add("fa-calculator")

    def `fa-calculator`(m: => CustomReactiveElement*) = build("fa-calculator", m)

    def `fa-paypal` = add("fa-paypal")

    def `fa-paypal`(m: => CustomReactiveElement*) = build("fa-paypal", m)

    def `fa-google-wallet` = add("fa-google-wallet")

    def `fa-google-wallet`(m: => CustomReactiveElement*) = build("fa-google-wallet", m)

    def `fa-cc-visa` = add("fa-cc-visa")

    def `fa-cc-visa`(m: => CustomReactiveElement*) = build("fa-cc-visa", m)

    def `fa-cc-mastercard` = add("fa-cc-mastercard")

    def `fa-cc-mastercard`(m: => CustomReactiveElement*) = build("fa-cc-mastercard", m)

    def `fa-cc-discover` = add("fa-cc-discover")

    def `fa-cc-discover`(m: => CustomReactiveElement*) = build("fa-cc-discover", m)

    def `fa-cc-amex` = add("fa-cc-amex")

    def `fa-cc-amex`(m: => CustomReactiveElement*) = build("fa-cc-amex", m)

    def `fa-cc-paypal` = add("fa-cc-paypal")

    def `fa-cc-paypal`(m: => CustomReactiveElement*) = build("fa-cc-paypal", m)

    def `fa-cc-stripe` = add("fa-cc-stripe")

    def `fa-cc-stripe`(m: => CustomReactiveElement*) = build("fa-cc-stripe", m)

    def `fa-bell-slash` = add("fa-bell-slash")

    def `fa-bell-slash`(m: => CustomReactiveElement*) = build("fa-bell-slash", m)

    def `fa-bell-slash-o` = add("fa-bell-slash-o")

    def `fa-bell-slash-o`(m: => CustomReactiveElement*) = build("fa-bell-slash-o", m)

    def `fa-trash` = add("fa-trash")

    def `fa-trash`(m: => CustomReactiveElement*) = build("fa-trash", m)

    def `fa-copyright` = add("fa-copyright")

    def `fa-copyright`(m: => CustomReactiveElement*) = build("fa-copyright", m)

    def `fa-at` = add("fa-at")

    def `fa-at`(m: => CustomReactiveElement*) = build("fa-at", m)

    def `fa-eyedropper` = add("fa-eyedropper")

    def `fa-eyedropper`(m: => CustomReactiveElement*) = build("fa-eyedropper", m)

    def `fa-paint-brush` = add("fa-paint-brush")

    def `fa-paint-brush`(m: => CustomReactiveElement*) = build("fa-paint-brush", m)

    def `fa-birthday-cake` = add("fa-birthday-cake")

    def `fa-birthday-cake`(m: => CustomReactiveElement*) = build("fa-birthday-cake", m)

    def `fa-area-chart` = add("fa-area-chart")

    def `fa-area-chart`(m: => CustomReactiveElement*) = build("fa-area-chart", m)

    def `fa-pie-chart` = add("fa-pie-chart")

    def `fa-pie-chart`(m: => CustomReactiveElement*) = build("fa-pie-chart", m)

    def `fa-line-chart` = add("fa-line-chart")

    def `fa-line-chart`(m: => CustomReactiveElement*) = build("fa-line-chart", m)

    def `fa-lastfm` = add("fa-lastfm")

    def `fa-lastfm`(m: => CustomReactiveElement*) = build("fa-lastfm", m)

    def `fa-lastfm-square` = add("fa-lastfm-square")

    def `fa-lastfm-square`(m: => CustomReactiveElement*) = build("fa-lastfm-square", m)

    def `fa-toggle-off` = add("fa-toggle-off")

    def `fa-toggle-off`(m: => CustomReactiveElement*) = build("fa-toggle-off", m)

    def `fa-toggle-on` = add("fa-toggle-on")

    def `fa-toggle-on`(m: => CustomReactiveElement*) = build("fa-toggle-on", m)

    def `fa-bicycle` = add("fa-bicycle")

    def `fa-bicycle`(m: => CustomReactiveElement*) = build("fa-bicycle", m)

    def `fa-bus` = add("fa-bus")

    def `fa-bus`(m: => CustomReactiveElement*) = build("fa-bus", m)

    def `fa-ioxhost` = add("fa-ioxhost")

    def `fa-ioxhost`(m: => CustomReactiveElement*) = build("fa-ioxhost", m)

    def `fa-angellist` = add("fa-angellist")

    def `fa-angellist`(m: => CustomReactiveElement*) = build("fa-angellist", m)

    def `fa-cc` = add("fa-cc")

    def `fa-cc`(m: => CustomReactiveElement*) = build("fa-cc", m)

    def `fa-shekel` = add("fa-shekel")

    def `fa-shekel`(m: => CustomReactiveElement*) = build("fa-shekel", m)

    def `fa-sheqel` = add("fa-sheqel")

    def `fa-sheqel`(m: => CustomReactiveElement*) = build("fa-sheqel", m)

    def `fa-ils` = add("fa-ils")

    def `fa-ils`(m: => CustomReactiveElement*) = build("fa-ils", m)

    def `fa-meanpath` = add("fa-meanpath")

    def `fa-meanpath`(m: => CustomReactiveElement*) = build("fa-meanpath", m)

    def `fa-buysellads` = add("fa-buysellads")

    def `fa-buysellads`(m: => CustomReactiveElement*) = build("fa-buysellads", m)

    def `fa-connectdevelop` = add("fa-connectdevelop")

    def `fa-connectdevelop`(m: => CustomReactiveElement*) = build("fa-connectdevelop", m)

    def `fa-dashcube` = add("fa-dashcube")

    def `fa-dashcube`(m: => CustomReactiveElement*) = build("fa-dashcube", m)

    def `fa-forumbee` = add("fa-forumbee")

    def `fa-forumbee`(m: => CustomReactiveElement*) = build("fa-forumbee", m)

    def `fa-leanpub` = add("fa-leanpub")

    def `fa-leanpub`(m: => CustomReactiveElement*) = build("fa-leanpub", m)

    def `fa-sellsy` = add("fa-sellsy")

    def `fa-sellsy`(m: => CustomReactiveElement*) = build("fa-sellsy", m)

    def `fa-shirtsinbulk` = add("fa-shirtsinbulk")

    def `fa-shirtsinbulk`(m: => CustomReactiveElement*) = build("fa-shirtsinbulk", m)

    def `fa-simplybuilt` = add("fa-simplybuilt")

    def `fa-simplybuilt`(m: => CustomReactiveElement*) = build("fa-simplybuilt", m)

    def `fa-skyatlas` = add("fa-skyatlas")

    def `fa-skyatlas`(m: => CustomReactiveElement*) = build("fa-skyatlas", m)

    def `fa-cart-plus` = add("fa-cart-plus")

    def `fa-cart-plus`(m: => CustomReactiveElement*) = build("fa-cart-plus", m)

    def `fa-cart-arrow-down` = add("fa-cart-arrow-down")

    def `fa-cart-arrow-down`(m: => CustomReactiveElement*) = build("fa-cart-arrow-down", m)

    def `fa-diamond` = add("fa-diamond")

    def `fa-diamond`(m: => CustomReactiveElement*) = build("fa-diamond", m)

    def `fa-ship` = add("fa-ship")

    def `fa-ship`(m: => CustomReactiveElement*) = build("fa-ship", m)

    def `fa-user-secret` = add("fa-user-secret")

    def `fa-user-secret`(m: => CustomReactiveElement*) = build("fa-user-secret", m)

    def `fa-motorcycle` = add("fa-motorcycle")

    def `fa-motorcycle`(m: => CustomReactiveElement*) = build("fa-motorcycle", m)

    def `fa-street-view` = add("fa-street-view")

    def `fa-street-view`(m: => CustomReactiveElement*) = build("fa-street-view", m)

    def `fa-heartbeat` = add("fa-heartbeat")

    def `fa-heartbeat`(m: => CustomReactiveElement*) = build("fa-heartbeat", m)

    def `fa-venus` = add("fa-venus")

    def `fa-venus`(m: => CustomReactiveElement*) = build("fa-venus", m)

    def `fa-mars` = add("fa-mars")

    def `fa-mars`(m: => CustomReactiveElement*) = build("fa-mars", m)

    def `fa-mercury` = add("fa-mercury")

    def `fa-mercury`(m: => CustomReactiveElement*) = build("fa-mercury", m)

    def `fa-intersex` = add("fa-intersex")

    def `fa-intersex`(m: => CustomReactiveElement*) = build("fa-intersex", m)

    def `fa-transgender` = add("fa-transgender")

    def `fa-transgender`(m: => CustomReactiveElement*) = build("fa-transgender", m)

    def `fa-transgender-alt` = add("fa-transgender-alt")

    def `fa-transgender-alt`(m: => CustomReactiveElement*) = build("fa-transgender-alt", m)

    def `fa-venus-double` = add("fa-venus-double")

    def `fa-venus-double`(m: => CustomReactiveElement*) = build("fa-venus-double", m)

    def `fa-mars-double` = add("fa-mars-double")

    def `fa-mars-double`(m: => CustomReactiveElement*) = build("fa-mars-double", m)

    def `fa-venus-mars` = add("fa-venus-mars")

    def `fa-venus-mars`(m: => CustomReactiveElement*) = build("fa-venus-mars", m)

    def `fa-mars-stroke` = add("fa-mars-stroke")

    def `fa-mars-stroke`(m: => CustomReactiveElement*) = build("fa-mars-stroke", m)

    def `fa-mars-stroke-v` = add("fa-mars-stroke-v")

    def `fa-mars-stroke-v`(m: => CustomReactiveElement*) = build("fa-mars-stroke-v", m)

    def `fa-mars-stroke-h` = add("fa-mars-stroke-h")

    def `fa-mars-stroke-h`(m: => CustomReactiveElement*) = build("fa-mars-stroke-h", m)

    def `fa-neuter` = add("fa-neuter")

    def `fa-neuter`(m: => CustomReactiveElement*) = build("fa-neuter", m)

    def `fa-genderless` = add("fa-genderless")

    def `fa-genderless`(m: => CustomReactiveElement*) = build("fa-genderless", m)

    def `fa-facebook-official` = add("fa-facebook-official")

    def `fa-facebook-official`(m: => CustomReactiveElement*) = build("fa-facebook-official", m)

    def `fa-pinterest-p` = add("fa-pinterest-p")

    def `fa-pinterest-p`(m: => CustomReactiveElement*) = build("fa-pinterest-p", m)

    def `fa-whatsapp` = add("fa-whatsapp")

    def `fa-whatsapp`(m: => CustomReactiveElement*) = build("fa-whatsapp", m)

    def `fa-server` = add("fa-server")

    def `fa-server`(m: => CustomReactiveElement*) = build("fa-server", m)

    def `fa-user-plus` = add("fa-user-plus")

    def `fa-user-plus`(m: => CustomReactiveElement*) = build("fa-user-plus", m)

    def `fa-user-times` = add("fa-user-times")

    def `fa-user-times`(m: => CustomReactiveElement*) = build("fa-user-times", m)

    def `fa-hotel` = add("fa-hotel")

    def `fa-hotel`(m: => CustomReactiveElement*) = build("fa-hotel", m)

    def `fa-bed` = add("fa-bed")

    def `fa-bed`(m: => CustomReactiveElement*) = build("fa-bed", m)

    def `fa-viacoin` = add("fa-viacoin")

    def `fa-viacoin`(m: => CustomReactiveElement*) = build("fa-viacoin", m)

    def `fa-train` = add("fa-train")

    def `fa-train`(m: => CustomReactiveElement*) = build("fa-train", m)

    def `fa-subway` = add("fa-subway")

    def `fa-subway`(m: => CustomReactiveElement*) = build("fa-subway", m)

    def `fa-medium` = add("fa-medium")

    def `fa-medium`(m: => CustomReactiveElement*) = build("fa-medium", m)

    def `fa-yc` = add("fa-yc")

    def `fa-yc`(m: => CustomReactiveElement*) = build("fa-yc", m)

    def `fa-y-combinator` = add("fa-y-combinator")

    def `fa-y-combinator`(m: => CustomReactiveElement*) = build("fa-y-combinator", m)

    def `fa-optin-monster` = add("fa-optin-monster")

    def `fa-optin-monster`(m: => CustomReactiveElement*) = build("fa-optin-monster", m)

    def `fa-opencart` = add("fa-opencart")

    def `fa-opencart`(m: => CustomReactiveElement*) = build("fa-opencart", m)

    def `fa-expeditedssl` = add("fa-expeditedssl")

    def `fa-expeditedssl`(m: => CustomReactiveElement*) = build("fa-expeditedssl", m)

    def `fa-battery-4` = add("fa-battery-4")

    def `fa-battery-4`(m: => CustomReactiveElement*) = build("fa-battery-4", m)

    def `fa-battery` = add("fa-battery")

    def `fa-battery`(m: => CustomReactiveElement*) = build("fa-battery", m)

    def `fa-battery-full` = add("fa-battery-full")

    def `fa-battery-full`(m: => CustomReactiveElement*) = build("fa-battery-full", m)

    def `fa-battery-3` = add("fa-battery-3")

    def `fa-battery-3`(m: => CustomReactiveElement*) = build("fa-battery-3", m)

    def `fa-battery-three-quarters` = add("fa-battery-three-quarters")

    def `fa-battery-three-quarters`(m: => CustomReactiveElement*) = build("fa-battery-three-quarters", m)

    def `fa-battery-2` = add("fa-battery-2")

    def `fa-battery-2`(m: => CustomReactiveElement*) = build("fa-battery-2", m)

    def `fa-battery-half` = add("fa-battery-half")

    def `fa-battery-half`(m: => CustomReactiveElement*) = build("fa-battery-half", m)

    def `fa-battery-1` = add("fa-battery-1")

    def `fa-battery-1`(m: => CustomReactiveElement*) = build("fa-battery-1", m)

    def `fa-battery-quarter` = add("fa-battery-quarter")

    def `fa-battery-quarter`(m: => CustomReactiveElement*) = build("fa-battery-quarter", m)

    def `fa-battery-0` = add("fa-battery-0")

    def `fa-battery-0`(m: => CustomReactiveElement*) = build("fa-battery-0", m)

    def `fa-battery-empty` = add("fa-battery-empty")

    def `fa-battery-empty`(m: => CustomReactiveElement*) = build("fa-battery-empty", m)

    def `fa-mouse-pointer` = add("fa-mouse-pointer")

    def `fa-mouse-pointer`(m: => CustomReactiveElement*) = build("fa-mouse-pointer", m)

    def `fa-i-cursor` = add("fa-i-cursor")

    def `fa-i-cursor`(m: => CustomReactiveElement*) = build("fa-i-cursor", m)

    def `fa-object-group` = add("fa-object-group")

    def `fa-object-group`(m: => CustomReactiveElement*) = build("fa-object-group", m)

    def `fa-object-ungroup` = add("fa-object-ungroup")

    def `fa-object-ungroup`(m: => CustomReactiveElement*) = build("fa-object-ungroup", m)

    def `fa-sticky-note` = add("fa-sticky-note")

    def `fa-sticky-note`(m: => CustomReactiveElement*) = build("fa-sticky-note", m)

    def `fa-sticky-note-o` = add("fa-sticky-note-o")

    def `fa-sticky-note-o`(m: => CustomReactiveElement*) = build("fa-sticky-note-o", m)

    def `fa-cc-jcb` = add("fa-cc-jcb")

    def `fa-cc-jcb`(m: => CustomReactiveElement*) = build("fa-cc-jcb", m)

    def `fa-cc-diners-club` = add("fa-cc-diners-club")

    def `fa-cc-diners-club`(m: => CustomReactiveElement*) = build("fa-cc-diners-club", m)

    def `fa-clone` = add("fa-clone")

    def `fa-clone`(m: => CustomReactiveElement*) = build("fa-clone", m)

    def `fa-balance-scale` = add("fa-balance-scale")

    def `fa-balance-scale`(m: => CustomReactiveElement*) = build("fa-balance-scale", m)

    def `fa-hourglass-o` = add("fa-hourglass-o")

    def `fa-hourglass-o`(m: => CustomReactiveElement*) = build("fa-hourglass-o", m)

    def `fa-hourglass-1` = add("fa-hourglass-1")

    def `fa-hourglass-1`(m: => CustomReactiveElement*) = build("fa-hourglass-1", m)

    def `fa-hourglass-start` = add("fa-hourglass-start")

    def `fa-hourglass-start`(m: => CustomReactiveElement*) = build("fa-hourglass-start", m)

    def `fa-hourglass-2` = add("fa-hourglass-2")

    def `fa-hourglass-2`(m: => CustomReactiveElement*) = build("fa-hourglass-2", m)

    def `fa-hourglass-half` = add("fa-hourglass-half")

    def `fa-hourglass-half`(m: => CustomReactiveElement*) = build("fa-hourglass-half", m)

    def `fa-hourglass-3` = add("fa-hourglass-3")

    def `fa-hourglass-3`(m: => CustomReactiveElement*) = build("fa-hourglass-3", m)

    def `fa-hourglass-end` = add("fa-hourglass-end")

    def `fa-hourglass-end`(m: => CustomReactiveElement*) = build("fa-hourglass-end", m)

    def `fa-hourglass` = add("fa-hourglass")

    def `fa-hourglass`(m: => CustomReactiveElement*) = build("fa-hourglass", m)

    def `fa-hand-grab-o` = add("fa-hand-grab-o")

    def `fa-hand-grab-o`(m: => CustomReactiveElement*) = build("fa-hand-grab-o", m)

    def `fa-hand-rock-o` = add("fa-hand-rock-o")

    def `fa-hand-rock-o`(m: => CustomReactiveElement*) = build("fa-hand-rock-o", m)

    def `fa-hand-stop-o` = add("fa-hand-stop-o")

    def `fa-hand-stop-o`(m: => CustomReactiveElement*) = build("fa-hand-stop-o", m)

    def `fa-hand-paper-o` = add("fa-hand-paper-o")

    def `fa-hand-paper-o`(m: => CustomReactiveElement*) = build("fa-hand-paper-o", m)

    def `fa-hand-scissors-o` = add("fa-hand-scissors-o")

    def `fa-hand-scissors-o`(m: => CustomReactiveElement*) = build("fa-hand-scissors-o", m)

    def `fa-hand-lizard-o` = add("fa-hand-lizard-o")

    def `fa-hand-lizard-o`(m: => CustomReactiveElement*) = build("fa-hand-lizard-o", m)

    def `fa-hand-spock-o` = add("fa-hand-spock-o")

    def `fa-hand-spock-o`(m: => CustomReactiveElement*) = build("fa-hand-spock-o", m)

    def `fa-hand-pointer-o` = add("fa-hand-pointer-o")

    def `fa-hand-pointer-o`(m: => CustomReactiveElement*) = build("fa-hand-pointer-o", m)

    def `fa-hand-peace-o` = add("fa-hand-peace-o")

    def `fa-hand-peace-o`(m: => CustomReactiveElement*) = build("fa-hand-peace-o", m)

    def `fa-trademark` = add("fa-trademark")

    def `fa-trademark`(m: => CustomReactiveElement*) = build("fa-trademark", m)

    def `fa-registered` = add("fa-registered")

    def `fa-registered`(m: => CustomReactiveElement*) = build("fa-registered", m)

    def `fa-creative-commons` = add("fa-creative-commons")

    def `fa-creative-commons`(m: => CustomReactiveElement*) = build("fa-creative-commons", m)

    def `fa-gg` = add("fa-gg")

    def `fa-gg`(m: => CustomReactiveElement*) = build("fa-gg", m)

    def `fa-gg-circle` = add("fa-gg-circle")

    def `fa-gg-circle`(m: => CustomReactiveElement*) = build("fa-gg-circle", m)

    def `fa-tripadvisor` = add("fa-tripadvisor")

    def `fa-tripadvisor`(m: => CustomReactiveElement*) = build("fa-tripadvisor", m)

    def `fa-odnoklassniki` = add("fa-odnoklassniki")

    def `fa-odnoklassniki`(m: => CustomReactiveElement*) = build("fa-odnoklassniki", m)

    def `fa-odnoklassniki-square` = add("fa-odnoklassniki-square")

    def `fa-odnoklassniki-square`(m: => CustomReactiveElement*) = build("fa-odnoklassniki-square", m)

    def `fa-get-pocket` = add("fa-get-pocket")

    def `fa-get-pocket`(m: => CustomReactiveElement*) = build("fa-get-pocket", m)

    def `fa-wikipedia-w` = add("fa-wikipedia-w")

    def `fa-wikipedia-w`(m: => CustomReactiveElement*) = build("fa-wikipedia-w", m)

    def `fa-safari` = add("fa-safari")

    def `fa-safari`(m: => CustomReactiveElement*) = build("fa-safari", m)

    def `fa-chrome` = add("fa-chrome")

    def `fa-chrome`(m: => CustomReactiveElement*) = build("fa-chrome", m)

    def `fa-firefox` = add("fa-firefox")

    def `fa-firefox`(m: => CustomReactiveElement*) = build("fa-firefox", m)

    def `fa-opera` = add("fa-opera")

    def `fa-opera`(m: => CustomReactiveElement*) = build("fa-opera", m)

    def `fa-internet-explorer` = add("fa-internet-explorer")

    def `fa-internet-explorer`(m: => CustomReactiveElement*) = build("fa-internet-explorer", m)

    def `fa-tv` = add("fa-tv")

    def `fa-tv`(m: => CustomReactiveElement*) = build("fa-tv", m)

    def `fa-television` = add("fa-television")

    def `fa-television`(m: => CustomReactiveElement*) = build("fa-television", m)

    def `fa-contao` = add("fa-contao")

    def `fa-contao`(m: => CustomReactiveElement*) = build("fa-contao", m)

    def `fa-500px` = add("fa-500px")

    def `fa-500px`(m: => CustomReactiveElement*) = build("fa-500px", m)

    def `fa-amazon` = add("fa-amazon")

    def `fa-amazon`(m: => CustomReactiveElement*) = build("fa-amazon", m)

    def `fa-calendar-plus-o` = add("fa-calendar-plus-o")

    def `fa-calendar-plus-o`(m: => CustomReactiveElement*) = build("fa-calendar-plus-o", m)

    def `fa-calendar-minus-o` = add("fa-calendar-minus-o")

    def `fa-calendar-minus-o`(m: => CustomReactiveElement*) = build("fa-calendar-minus-o", m)

    def `fa-calendar-times-o` = add("fa-calendar-times-o")

    def `fa-calendar-times-o`(m: => CustomReactiveElement*) = build("fa-calendar-times-o", m)

    def `fa-calendar-check-o` = add("fa-calendar-check-o")

    def `fa-calendar-check-o`(m: => CustomReactiveElement*) = build("fa-calendar-check-o", m)

    def `fa-industry` = add("fa-industry")

    def `fa-industry`(m: => CustomReactiveElement*) = build("fa-industry", m)

    def `fa-map-pin` = add("fa-map-pin")

    def `fa-map-pin`(m: => CustomReactiveElement*) = build("fa-map-pin", m)

    def `fa-map-signs` = add("fa-map-signs")

    def `fa-map-signs`(m: => CustomReactiveElement*) = build("fa-map-signs", m)

    def `fa-map-o` = add("fa-map-o")

    def `fa-map-o`(m: => CustomReactiveElement*) = build("fa-map-o", m)

    def `fa-map` = add("fa-map")

    def `fa-map`(m: => CustomReactiveElement*) = build("fa-map", m)

    def `fa-commenting` = add("fa-commenting")

    def `fa-commenting`(m: => CustomReactiveElement*) = build("fa-commenting", m)

    def `fa-commenting-o` = add("fa-commenting-o")

    def `fa-commenting-o`(m: => CustomReactiveElement*) = build("fa-commenting-o", m)

    def `fa-houzz` = add("fa-houzz")

    def `fa-houzz`(m: => CustomReactiveElement*) = build("fa-houzz", m)

    def `fa-vimeo` = add("fa-vimeo")

    def `fa-vimeo`(m: => CustomReactiveElement*) = build("fa-vimeo", m)

    def `fa-black-tie` = add("fa-black-tie")

    def `fa-black-tie`(m: => CustomReactiveElement*) = build("fa-black-tie", m)

    def `fa-fonticons` = add("fa-fonticons")

    def `fa-fonticons`(m: => CustomReactiveElement*) = build("fa-fonticons", m)

    def `fa-reddit-alien` = add("fa-reddit-alien")

    def `fa-reddit-alien`(m: => CustomReactiveElement*) = build("fa-reddit-alien", m)

    def `fa-edge` = add("fa-edge")

    def `fa-edge`(m: => CustomReactiveElement*) = build("fa-edge", m)

    def `fa-credit-card-alt` = add("fa-credit-card-alt")

    def `fa-credit-card-alt`(m: => CustomReactiveElement*) = build("fa-credit-card-alt", m)

    def `fa-codiepie` = add("fa-codiepie")

    def `fa-codiepie`(m: => CustomReactiveElement*) = build("fa-codiepie", m)

    def `fa-modx` = add("fa-modx")

    def `fa-modx`(m: => CustomReactiveElement*) = build("fa-modx", m)

    def `fa-fort-awesome` = add("fa-fort-awesome")

    def `fa-fort-awesome`(m: => CustomReactiveElement*) = build("fa-fort-awesome", m)

    def `fa-usb` = add("fa-usb")

    def `fa-usb`(m: => CustomReactiveElement*) = build("fa-usb", m)

    def `fa-product-hunt` = add("fa-product-hunt")

    def `fa-product-hunt`(m: => CustomReactiveElement*) = build("fa-product-hunt", m)

    def `fa-mixcloud` = add("fa-mixcloud")

    def `fa-mixcloud`(m: => CustomReactiveElement*) = build("fa-mixcloud", m)

    def `fa-scribd` = add("fa-scribd")

    def `fa-scribd`(m: => CustomReactiveElement*) = build("fa-scribd", m)

    def `fa-pause-circle` = add("fa-pause-circle")

    def `fa-pause-circle`(m: => CustomReactiveElement*) = build("fa-pause-circle", m)

    def `fa-pause-circle-o` = add("fa-pause-circle-o")

    def `fa-pause-circle-o`(m: => CustomReactiveElement*) = build("fa-pause-circle-o", m)

    def `fa-stop-circle` = add("fa-stop-circle")

    def `fa-stop-circle`(m: => CustomReactiveElement*) = build("fa-stop-circle", m)

    def `fa-stop-circle-o` = add("fa-stop-circle-o")

    def `fa-stop-circle-o`(m: => CustomReactiveElement*) = build("fa-stop-circle-o", m)

    def `fa-shopping-bag` = add("fa-shopping-bag")

    def `fa-shopping-bag`(m: => CustomReactiveElement*) = build("fa-shopping-bag", m)

    def `fa-shopping-basket` = add("fa-shopping-basket")

    def `fa-shopping-basket`(m: => CustomReactiveElement*) = build("fa-shopping-basket", m)

    def `fa-hashtag` = add("fa-hashtag")

    def `fa-hashtag`(m: => CustomReactiveElement*) = build("fa-hashtag", m)

    def `fa-bluetooth` = add("fa-bluetooth")

    def `fa-bluetooth`(m: => CustomReactiveElement*) = build("fa-bluetooth", m)

    def `fa-bluetooth-b` = add("fa-bluetooth-b")

    def `fa-bluetooth-b`(m: => CustomReactiveElement*) = build("fa-bluetooth-b", m)

    def `fa-percent` = add("fa-percent")

    def `fa-percent`(m: => CustomReactiveElement*) = build("fa-percent", m)

    def `fa-gitlab` = add("fa-gitlab")

    def `fa-gitlab`(m: => CustomReactiveElement*) = build("fa-gitlab", m)

    def `fa-wpbeginner` = add("fa-wpbeginner")

    def `fa-wpbeginner`(m: => CustomReactiveElement*) = build("fa-wpbeginner", m)

    def `fa-wpforms` = add("fa-wpforms")

    def `fa-wpforms`(m: => CustomReactiveElement*) = build("fa-wpforms", m)

    def `fa-envira` = add("fa-envira")

    def `fa-envira`(m: => CustomReactiveElement*) = build("fa-envira", m)

    def `fa-universal-access` = add("fa-universal-access")

    def `fa-universal-access`(m: => CustomReactiveElement*) = build("fa-universal-access", m)

    def `fa-wheelchair-alt` = add("fa-wheelchair-alt")

    def `fa-wheelchair-alt`(m: => CustomReactiveElement*) = build("fa-wheelchair-alt", m)

    def `fa-question-circle-o` = add("fa-question-circle-o")

    def `fa-question-circle-o`(m: => CustomReactiveElement*) = build("fa-question-circle-o", m)

    def `fa-blind` = add("fa-blind")

    def `fa-blind`(m: => CustomReactiveElement*) = build("fa-blind", m)

    def `fa-audio-description` = add("fa-audio-description")

    def `fa-audio-description`(m: => CustomReactiveElement*) = build("fa-audio-description", m)

    def `fa-volume-control-phone` = add("fa-volume-control-phone")

    def `fa-volume-control-phone`(m: => CustomReactiveElement*) = build("fa-volume-control-phone", m)

    def `fa-braille` = add("fa-braille")

    def `fa-braille`(m: => CustomReactiveElement*) = build("fa-braille", m)

    def `fa-assistive-listening-systems` = add("fa-assistive-listening-systems")

    def `fa-assistive-listening-systems`(m: => CustomReactiveElement*) = build("fa-assistive-listening-systems", m)

    def `fa-asl-interpreting` = add("fa-asl-interpreting")

    def `fa-asl-interpreting`(m: => CustomReactiveElement*) = build("fa-asl-interpreting", m)

    def `fa-american-sign-language-interpreting` = add("fa-american-sign-language-interpreting")

    def `fa-american-sign-language-interpreting`(m: => CustomReactiveElement*) = build("fa-american-sign-language-interpreting", m)

    def `fa-deafness` = add("fa-deafness")

    def `fa-deafness`(m: => CustomReactiveElement*) = build("fa-deafness", m)

    def `fa-hard-of-hearing` = add("fa-hard-of-hearing")

    def `fa-hard-of-hearing`(m: => CustomReactiveElement*) = build("fa-hard-of-hearing", m)

    def `fa-deaf` = add("fa-deaf")

    def `fa-deaf`(m: => CustomReactiveElement*) = build("fa-deaf", m)

    def `fa-glide` = add("fa-glide")

    def `fa-glide`(m: => CustomReactiveElement*) = build("fa-glide", m)

    def `fa-glide-g` = add("fa-glide-g")

    def `fa-glide-g`(m: => CustomReactiveElement*) = build("fa-glide-g", m)

    def `fa-signing` = add("fa-signing")

    def `fa-signing`(m: => CustomReactiveElement*) = build("fa-signing", m)

    def `fa-sign-language` = add("fa-sign-language")

    def `fa-sign-language`(m: => CustomReactiveElement*) = build("fa-sign-language", m)

    def `fa-low-vision` = add("fa-low-vision")

    def `fa-low-vision`(m: => CustomReactiveElement*) = build("fa-low-vision", m)

    def `fa-viadeo` = add("fa-viadeo")

    def `fa-viadeo`(m: => CustomReactiveElement*) = build("fa-viadeo", m)

    def `fa-viadeo-square` = add("fa-viadeo-square")

    def `fa-viadeo-square`(m: => CustomReactiveElement*) = build("fa-viadeo-square", m)

    def `fa-snapchat` = add("fa-snapchat")

    def `fa-snapchat`(m: => CustomReactiveElement*) = build("fa-snapchat", m)

    def `fa-snapchat-ghost` = add("fa-snapchat-ghost")

    def `fa-snapchat-ghost`(m: => CustomReactiveElement*) = build("fa-snapchat-ghost", m)

    def `fa-snapchat-square` = add("fa-snapchat-square")

    def `fa-snapchat-square`(m: => CustomReactiveElement*) = build("fa-snapchat-square", m)

    def `fa-pied-piper` = add("fa-pied-piper")

    def `fa-pied-piper`(m: => CustomReactiveElement*) = build("fa-pied-piper", m)

    def `fa-first-order` = add("fa-first-order")

    def `fa-first-order`(m: => CustomReactiveElement*) = build("fa-first-order", m)

    def `fa-yoast` = add("fa-yoast")

    def `fa-yoast`(m: => CustomReactiveElement*) = build("fa-yoast", m)

    def `fa-themeisle` = add("fa-themeisle")

    def `fa-themeisle`(m: => CustomReactiveElement*) = build("fa-themeisle", m)

    def `fa-google-plus-circle` = add("fa-google-plus-circle")

    def `fa-google-plus-circle`(m: => CustomReactiveElement*) = build("fa-google-plus-circle", m)

    def `fa-google-plus-official` = add("fa-google-plus-official")

    def `fa-google-plus-official`(m: => CustomReactiveElement*) = build("fa-google-plus-official", m)

    def `fa-fa` = add("fa-fa")

    def `fa-fa`(m: => CustomReactiveElement*) = build("fa-fa", m)

    def `fa-font-awesome` = add("fa-font-awesome")

    def `fa-font-awesome`(m: => CustomReactiveElement*) = build("fa-font-awesome", m)

    def `fa-handshake-o` = add("fa-handshake-o")

    def `fa-handshake-o`(m: => CustomReactiveElement*) = build("fa-handshake-o", m)

    def `fa-envelope-open` = add("fa-envelope-open")

    def `fa-envelope-open`(m: => CustomReactiveElement*) = build("fa-envelope-open", m)

    def `fa-envelope-open-o` = add("fa-envelope-open-o")

    def `fa-envelope-open-o`(m: => CustomReactiveElement*) = build("fa-envelope-open-o", m)

    def `fa-linode` = add("fa-linode")

    def `fa-linode`(m: => CustomReactiveElement*) = build("fa-linode", m)

    def `fa-address-book` = add("fa-address-book")

    def `fa-address-book`(m: => CustomReactiveElement*) = build("fa-address-book", m)

    def `fa-address-book-o` = add("fa-address-book-o")

    def `fa-address-book-o`(m: => CustomReactiveElement*) = build("fa-address-book-o", m)

    def `fa-vcard` = add("fa-vcard")

    def `fa-vcard`(m: => CustomReactiveElement*) = build("fa-vcard", m)

    def `fa-address-card` = add("fa-address-card")

    def `fa-address-card`(m: => CustomReactiveElement*) = build("fa-address-card", m)

    def `fa-vcard-o` = add("fa-vcard-o")

    def `fa-vcard-o`(m: => CustomReactiveElement*) = build("fa-vcard-o", m)

    def `fa-address-card-o` = add("fa-address-card-o")

    def `fa-address-card-o`(m: => CustomReactiveElement*) = build("fa-address-card-o", m)

    def `fa-user-circle` = add("fa-user-circle")

    def `fa-user-circle`(m: => CustomReactiveElement*) = build("fa-user-circle", m)

    def `fa-user-circle-o` = add("fa-user-circle-o")

    def `fa-user-circle-o`(m: => CustomReactiveElement*) = build("fa-user-circle-o", m)

    def `fa-user-o` = add("fa-user-o")

    def `fa-user-o`(m: => CustomReactiveElement*) = build("fa-user-o", m)

    def `fa-id-badge` = add("fa-id-badge")

    def `fa-id-badge`(m: => CustomReactiveElement*) = build("fa-id-badge", m)

    def `fa-drivers-license` = add("fa-drivers-license")

    def `fa-drivers-license`(m: => CustomReactiveElement*) = build("fa-drivers-license", m)

    def `fa-id-card` = add("fa-id-card")

    def `fa-id-card`(m: => CustomReactiveElement*) = build("fa-id-card", m)

    def `fa-drivers-license-o` = add("fa-drivers-license-o")

    def `fa-drivers-license-o`(m: => CustomReactiveElement*) = build("fa-drivers-license-o", m)

    def `fa-id-card-o` = add("fa-id-card-o")

    def `fa-id-card-o`(m: => CustomReactiveElement*) = build("fa-id-card-o", m)

    def `fa-quora` = add("fa-quora")

    def `fa-quora`(m: => CustomReactiveElement*) = build("fa-quora", m)

    def `fa-free-code-camp` = add("fa-free-code-camp")

    def `fa-free-code-camp`(m: => CustomReactiveElement*) = build("fa-free-code-camp", m)

    def `fa-telegram` = add("fa-telegram")

    def `fa-telegram`(m: => CustomReactiveElement*) = build("fa-telegram", m)

    def `fa-thermometer-4` = add("fa-thermometer-4")

    def `fa-thermometer-4`(m: => CustomReactiveElement*) = build("fa-thermometer-4", m)

    def `fa-thermometer` = add("fa-thermometer")

    def `fa-thermometer`(m: => CustomReactiveElement*) = build("fa-thermometer", m)

    def `fa-thermometer-full` = add("fa-thermometer-full")

    def `fa-thermometer-full`(m: => CustomReactiveElement*) = build("fa-thermometer-full", m)

    def `fa-thermometer-3` = add("fa-thermometer-3")

    def `fa-thermometer-3`(m: => CustomReactiveElement*) = build("fa-thermometer-3", m)

    def `fa-thermometer-three-quarters` = add("fa-thermometer-three-quarters")

    def `fa-thermometer-three-quarters`(m: => CustomReactiveElement*) = build("fa-thermometer-three-quarters", m)

    def `fa-thermometer-2` = add("fa-thermometer-2")

    def `fa-thermometer-2`(m: => CustomReactiveElement*) = build("fa-thermometer-2", m)

    def `fa-thermometer-half` = add("fa-thermometer-half")

    def `fa-thermometer-half`(m: => CustomReactiveElement*) = build("fa-thermometer-half", m)

    def `fa-thermometer-1` = add("fa-thermometer-1")

    def `fa-thermometer-1`(m: => CustomReactiveElement*) = build("fa-thermometer-1", m)

    def `fa-thermometer-quarter` = add("fa-thermometer-quarter")

    def `fa-thermometer-quarter`(m: => CustomReactiveElement*) = build("fa-thermometer-quarter", m)

    def `fa-thermometer-0` = add("fa-thermometer-0")

    def `fa-thermometer-0`(m: => CustomReactiveElement*) = build("fa-thermometer-0", m)

    def `fa-thermometer-empty` = add("fa-thermometer-empty")

    def `fa-thermometer-empty`(m: => CustomReactiveElement*) = build("fa-thermometer-empty", m)

    def `fa-shower` = add("fa-shower")

    def `fa-shower`(m: => CustomReactiveElement*) = build("fa-shower", m)

    def `fa-bathtub` = add("fa-bathtub")

    def `fa-bathtub`(m: => CustomReactiveElement*) = build("fa-bathtub", m)

    def `fa-s15` = add("fa-s15")

    def `fa-s15`(m: => CustomReactiveElement*) = build("fa-s15", m)

    def `fa-bath` = add("fa-bath")

    def `fa-bath`(m: => CustomReactiveElement*) = build("fa-bath", m)

    def `fa-podcast` = add("fa-podcast")

    def `fa-podcast`(m: => CustomReactiveElement*) = build("fa-podcast", m)

    def `fa-window-maximize` = add("fa-window-maximize")

    def `fa-window-maximize`(m: => CustomReactiveElement*) = build("fa-window-maximize", m)

    def `fa-window-minimize` = add("fa-window-minimize")

    def `fa-window-minimize`(m: => CustomReactiveElement*) = build("fa-window-minimize", m)

    def `fa-window-restore` = add("fa-window-restore")

    def `fa-window-restore`(m: => CustomReactiveElement*) = build("fa-window-restore", m)

    def `fa-times-rectangle` = add("fa-times-rectangle")

    def `fa-times-rectangle`(m: => CustomReactiveElement*) = build("fa-times-rectangle", m)

    def `fa-window-close` = add("fa-window-close")

    def `fa-window-close`(m: => CustomReactiveElement*) = build("fa-window-close", m)

    def `fa-times-rectangle-o` = add("fa-times-rectangle-o")

    def `fa-times-rectangle-o`(m: => CustomReactiveElement*) = build("fa-times-rectangle-o", m)

    def `fa-window-close-o` = add("fa-window-close-o")

    def `fa-window-close-o`(m: => CustomReactiveElement*) = build("fa-window-close-o", m)

    def `fa-bandcamp` = add("fa-bandcamp")

    def `fa-bandcamp`(m: => CustomReactiveElement*) = build("fa-bandcamp", m)

    def `fa-grav` = add("fa-grav")

    def `fa-grav`(m: => CustomReactiveElement*) = build("fa-grav", m)

    def `fa-etsy` = add("fa-etsy")

    def `fa-etsy`(m: => CustomReactiveElement*) = build("fa-etsy", m)

    def `fa-imdb` = add("fa-imdb")

    def `fa-imdb`(m: => CustomReactiveElement*) = build("fa-imdb", m)

    def `fa-ravelry` = add("fa-ravelry")

    def `fa-ravelry`(m: => CustomReactiveElement*) = build("fa-ravelry", m)

    def `fa-eercast` = add("fa-eercast")

    def `fa-eercast`(m: => CustomReactiveElement*) = build("fa-eercast", m)

    def `fa-microchip` = add("fa-microchip")

    def `fa-microchip`(m: => CustomReactiveElement*) = build("fa-microchip", m)

    def `fa-snowflake-o` = add("fa-snowflake-o")

    def `fa-snowflake-o`(m: => CustomReactiveElement*) = build("fa-snowflake-o", m)

    def `fa-superpowers` = add("fa-superpowers")

    def `fa-superpowers`(m: => CustomReactiveElement*) = build("fa-superpowers", m)

    def `fa-wpexplorer` = add("fa-wpexplorer")

    def `fa-wpexplorer`(m: => CustomReactiveElement*) = build("fa-wpexplorer", m)

    def `fa-meetup` = add("fa-meetup")

    def `fa-meetup`(m: => CustomReactiveElement*) = build("fa-meetup", m)

    def `sr-only` = add("sr-only")

    def `sr-only`(m: => CustomReactiveElement*) = build("sr-only", m)

    def `sr-only-focusable` = add("sr-only-focusable")

    def `sr-only-focusable`(m: => CustomReactiveElement*) = build("sr-only-focusable", m)


