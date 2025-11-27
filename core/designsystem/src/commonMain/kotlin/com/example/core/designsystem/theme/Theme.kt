package com.example.core.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalExtendedColors = staticCompositionLocalOf { LightExtendedColors }

val ColorScheme.extended: ExtendedColors
	@ReadOnlyComposable
	@Composable
	get() = LocalExtendedColors.current

@Immutable
data class ExtendedColors(
	// Button states
	val primaryHover: Color,
	val destructiveHover: Color,
	val destructiveSecondaryOutline: Color,
	val disabledOutline: Color,
	val disabledFill: Color,
	val successOutline: Color,
	val success: Color,
	val onSuccess: Color,
	val secondaryFill: Color,

	// Text variants
	val textPrimary: Color,
	val textTertiary: Color,
	val textSecondary: Color,
	val textPlaceholder: Color,
	val textDisabled: Color,

	// Surface variants
	val surfaceLower: Color,
	val surfaceHigher: Color,
	val surfaceOutline: Color,
	val overlay: Color,

	// Accent colors
	val accentBlue: Color,
	val accentPurple: Color,
	val accentViolet: Color,
	val accentPink: Color,
	val accentOrange: Color,
	val accentYellow: Color,
	val accentGreen: Color,
	val accentTeal: Color,
	val accentLightBlue: Color,
	val accentGrey: Color,

	// Cake colors for chat bubbles
	val cakeViolet: Color,
	val cakeGreen: Color,
	val cakeBlue: Color,
	val cakePink: Color,
	val cakeOrange: Color,
	val cakeYellow: Color,
	val cakeTeal: Color,
	val cakePurple: Color,
	val cakeRed: Color,
	val cakeMint: Color,
)

val LightExtendedColors = ExtendedColors(
	primaryHover = NzHikeBrand600,
	destructiveHover = NzHikeRed600,
	destructiveSecondaryOutline = NzHikeRed200,
	disabledOutline = NzHikeBase200,
	disabledFill = NzHikeBase150,
	successOutline = NzHikeBrand100,
	success = NzHikeBrand600,
	onSuccess = NzHikeBase0,
	secondaryFill = NzHikeBase100,

	textPrimary = NzHikeBase1000,
	textTertiary = NzHikeBase800,
	textSecondary = NzHikeBase900,
	textPlaceholder = NzHikeBase700,
	textDisabled = NzHikeBase400,

	surfaceLower = NzHikeBase100,
	surfaceHigher = NzHikeBase100,
	surfaceOutline = NzHikeBase1000Alpha14,
	overlay = NzHikeBase1000Alpha80,

	accentBlue = NzHikeBlue,
	accentPurple = NzHikePurple,
	accentViolet = NzHikeViolet,
	accentPink = NzHikePink,
	accentOrange = NzHikeOrange,
	accentYellow = NzHikeYellow,
	accentGreen = NzHikeGreen,
	accentTeal = NzHikeTeal,
	accentLightBlue = NzHikeLightBlue,
	accentGrey = NzHikeGrey,

	cakeViolet = NzHikeCakeLightViolet,
	cakeGreen = NzHikeCakeLightGreen,
	cakeBlue = NzHikeCakeLightBlue,
	cakePink = NzHikeCakeLightPink,
	cakeOrange = NzHikeCakeLightOrange,
	cakeYellow = NzHikeCakeLightYellow,
	cakeTeal = NzHikeCakeLightTeal,
	cakePurple = NzHikeCakeLightPurple,
	cakeRed = NzHikeCakeLightRed,
	cakeMint = NzHikeCakeLightMint,
)

val DarkExtendedColors = ExtendedColors(
	primaryHover = NzHikeBrand600,
	destructiveHover = NzHikeRed600,
	destructiveSecondaryOutline = NzHikeRed200,
	disabledOutline = NzHikeBase900,
	disabledFill = NzHikeBase1000,
	successOutline = NzHikeBrand500Alpha40,
	success = NzHikeBrand500,
	onSuccess = NzHikeBase1000,
	secondaryFill = NzHikeBase900,

	textPrimary = NzHikeBase0,
	textTertiary = NzHikeBase200,
	textSecondary = NzHikeBase150,
	textPlaceholder = NzHikeBase400,
	textDisabled = NzHikeBase500,

	surfaceLower = NzHikeBase1000,
	surfaceHigher = NzHikeBase900,
	surfaceOutline = NzHikeBase100Alpha10Alt,
	overlay = NzHikeBase1000Alpha80,

	accentBlue = NzHikeBlue,
	accentPurple = NzHikePurple,
	accentViolet = NzHikeViolet,
	accentPink = NzHikePink,
	accentOrange = NzHikeOrange,
	accentYellow = NzHikeYellow,
	accentGreen = NzHikeGreen,
	accentTeal = NzHikeTeal,
	accentLightBlue = NzHikeLightBlue,
	accentGrey = NzHikeGrey,

	cakeViolet = NzHikeCakeDarkViolet,
	cakeGreen = NzHikeCakeDarkGreen,
	cakeBlue = NzHikeCakeDarkBlue,
	cakePink = NzHikeCakeDarkPink,
	cakeOrange = NzHikeCakeDarkOrange,
	cakeYellow = NzHikeCakeDarkYellow,
	cakeTeal = NzHikeCakeDarkTeal,
	cakePurple = NzHikeCakeDarkPurple,
	cakeRed = NzHikeCakeDarkRed,
	cakeMint = NzHikeCakeDarkMint,
)

val LightColorScheme = lightColorScheme(
	primary = NzHikeBrand500,
	onPrimary = NzHikeBrand1000,
	primaryContainer = NzHikeBrand100,
	onPrimaryContainer = NzHikeBrand900,

	secondary = NzHikeBase700,
	onSecondary = NzHikeBase0,
	secondaryContainer = NzHikeBase100,
	onSecondaryContainer = NzHikeBase900,

	tertiary = NzHikeBrand900,
	onTertiary = NzHikeBase0,
	tertiaryContainer = NzHikeBrand100,
	onTertiaryContainer = NzHikeBrand1000,

	error = NzHikeRed500,
	onError = NzHikeBase0,
	errorContainer = NzHikeRed200,
	onErrorContainer = NzHikeRed600,

	background = NzHikeBrand1000,
	onBackground = NzHikeBase0,
	surface = NzHikeBase0,
	onSurface = NzHikeBase1000,
	surfaceVariant = NzHikeBase100,
	onSurfaceVariant = NzHikeBase900,

	outline = NzHikeBase1000Alpha8,
	outlineVariant = NzHikeBase200,
)

val DarkColorScheme = darkColorScheme(
	primary = NzHikeBrand500,
	onPrimary = NzHikeBrand1000,
	primaryContainer = NzHikeBrand900,
	onPrimaryContainer = NzHikeBrand500,

	secondary = NzHikeBase400,
	onSecondary = NzHikeBase1000,
	secondaryContainer = NzHikeBase900,
	onSecondaryContainer = NzHikeBase150,

	tertiary = NzHikeBrand500,
	onTertiary = NzHikeBase1000,
	tertiaryContainer = NzHikeBrand900,
	onTertiaryContainer = NzHikeBrand500,

	error = NzHikeRed500,
	onError = NzHikeBase0,
	errorContainer = NzHikeRed600,
	onErrorContainer = NzHikeRed200,

	background = NzHikeBase1000,
	onBackground = NzHikeBase0,
	surface = NzHikeBase950,
	onSurface = NzHikeBase0,
	surfaceVariant = NzHikeBase900,
	onSurfaceVariant = NzHikeBase150,

	outline = NzHikeBase100Alpha10,
	outlineVariant = NzHikeBase800,
)