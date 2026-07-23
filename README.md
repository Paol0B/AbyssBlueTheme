# Abyss Blue

> A deep, minimal dark theme for IntelliJ IDEA and all JetBrains IDEs — a cool blue-slate palette with a reasoned, cross-language syntax scheme.

![Abyss Blue](https://img.shields.io/badge/theme-Abyss%20Blue-11151C?style=for-the-badge&labelColor=0D1015)
![JetBrains Plugin](https://img.shields.io/badge/JetBrains-Plugin-3871E1?style=for-the-badge&logo=jetbrains&logoColor=white)

---

## Screenshots


<!-- ![Editor](screenshots/editor.png) -->
<!-- ![Tool Windows](screenshots/toolwindows.png) -->

## Features

- **Island UI** — Dark islands (`#11151C`) floating on a near-black canvas (`#0D1015`) for a clean, focused look
- **Reasoned syntax palette** — One color per role, identical across C, C++, Rust, Go, Java/Kotlin, C#, Python and more — no duplicate or clashing roles
- **Built for readability** — Bold default text and a cool blue-slate surface scale; every syntax color meets WCAG AA contrast (≥ 4.5:1) on the editor background
- **Complete coverage** — Every UI surface is themed: popups, tool windows, tabs, notifications, VCS, debugger, breadcrumbs, and more
- **Semantic color system** — Built on a layered token architecture for consistent contrast across all components

## Color Palette

### Surfaces

| Surface | Swatch | Hex |
|---------|--------|-----|
| Canvas (main background) | ![](https://img.shields.io/badge/-0D1015-0D1015?style=flat-square) | `#0D1015` |
| Islands (editor, tool windows) | ![](https://img.shields.io/badge/-11151C-11151C?style=flat-square) | `#11151C` |
| Popups & menus | ![](https://img.shields.io/badge/-11151B-11151B?style=flat-square) | `#11151B` |
| Borders & separators | ![](https://img.shields.io/badge/-21262F-21262F?style=flat-square) | `#21262F` |

The full neutral scale is tuned to a single cool blue-slate undertone (hue ≈ 218°), so every surface, border and control sits on one coherent gradient of depth.

### Syntax

Moderate-semantic highlighting: **one hue per role, consistent across every language, and no two roles share a color.**

| Role | Swatch | Hex | Style |
|------|--------|-----|-------|
| Keywords | ![](https://img.shields.io/badge/-B69CF7-B69CF7?style=flat-square) | `#B69CF7` | bold |
| Types / classes | ![](https://img.shields.io/badge/-54BEC4-54BEC4?style=flat-square) | `#54BEC4` | |
| Functions / methods | ![](https://img.shields.io/badge/-6FA6FF-6FA6FF?style=flat-square) | `#6FA6FF` | |
| Strings | ![](https://img.shields.io/badge/-7FC08D-7FC08D?style=flat-square) | `#7FC08D` | |
| Numbers & constants | ![](https://img.shields.io/badge/-E0946E-E0946E?style=flat-square) | `#E0946E` | |
| Annotations / attributes | ![](https://img.shields.io/badge/-E3B55C-E3B55C?style=flat-square) | `#E3B55C` | italic |
| Comments | ![](https://img.shields.io/badge/-7E8A98-7E8A98?style=flat-square) | `#7E8A98` | italic |
| Default (variables, operators) | ![](https://img.shields.io/badge/-C4C6CC-C4C6CC?style=flat-square) | `#C4C6CC` | bold |

Reserved signals stay outside the palette — errors use a red wavy underline, warnings a gold one — so they never compete with syntax hues.

## Installation

### From JetBrains Marketplace

1. Open **Settings** → **Plugins** → **Marketplace**
2. Search for **Abyss Blue**
3. Click **Install** and restart the IDE
4. Go to **Settings** → **Appearance & Behavior** → **Appearance** → Select **Abyss Blue**

### Manual Installation

1. Download the latest release from [Releases](https://github.com/paol0b/AbyssBlueTheme/releases)
2. Open **Settings** → **Plugins** → **⚙️** → **Install Plugin from Disk...**
3. Select the downloaded `.zip` file
4. Restart the IDE

### Build from Source

```bash
git clone https://github.com/paol0b/AbyssBlueTheme.git
cd AbyssBlueTheme
./gradlew buildPlugin
```

The plugin zip will be in `build/distributions/`.

## Compatibility

- IntelliJ IDEA 2024.3+ (build `243`)
- All JetBrains IDEs (WebStorm, PyCharm, CLion, Rider, GoLand, etc.)
- No upper build bound — compatible with current and future releases

## Architecture

The theme uses a layered token system:

```
Canvas (#0D1015)             ← Main window background
  └─ Layer 0 (#11151C)      ← Islands: editor, tool windows
      └─ Layer 1 (#11151B)  ← Popups, menus, dropdowns
          └─ Layer 2 (#21262F) ← Tooltips, floating toolbars
```

All UI components reference semantic tokens rather than hardcoded hex values, ensuring consistency across the entire IDE.

## Known Issues

- **Performance Monitor background** — The monitoring tool window may show a slightly different background due to a [known JetBrains bug](https://youtrack.jetbrains.com/issue/RIDER-128702). The charts themselves are themed correctly.

## Contributing

Contributions are welcome! If you notice any UI component that doesn't look right:

1. Fork this repository
2. Create a branch (`git checkout -b fix/component-name`)
3. Make your changes
4. Submit a Pull Request

### Useful Resources

- [IntelliJ Theme Colors Reference](https://plugins.jetbrains.com/docs/intellij/platform-theme-colors.html)
- [Theme Metadata JSON](https://github.com/JetBrains/intellij-community/blob/master/platform/platform-resources/src/themes/metadata/IntelliJPlatform.themeMetadata.json)
- [Official expUI Dark Theme](https://github.com/JetBrains/intellij-community/blob/master/platform/platform-resources/src/themes/expUI/expUI_dark.theme.json)
---

<p align="center">
  <i>Designed for developers who want a clean, minimal look with the full power of IntelliJ IDEA.</i>
</p>
