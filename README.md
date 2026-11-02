# Happ Android Source Code (Decompiled) / Декомпилированные исходники Happ Android

Full static decompilation of Happ Proxy Utility for Android (`su.happ.proxyutility`), version 4.9.0 (build 1721).

Полная статическая декомпиляция Android-клиента Happ Proxy Utility (`su.happ.proxyutility`), версия 4.9.0 (сборка 1721).

---

## English

### Overview

This repository contains fully decompiled source code, resources, Smali bytecode, and native reverse engineering outputs for Happ Android (`Happ.apk`).

- Package name: `su.happ.proxyutility`
- Version: 4.9.0 (versionCode 1721)
- SDK targets: minSdk 24, targetSdk 37
- Original APK SHA-256: `47aac2a2310553ca85ef390c2ae1674d79d9d70c215ef36a35cdf433f5b8323d`

### Directory Layout

- `src/sources/`: Decompiled Java code generated with JADX (11,412 files). Includes application logic under `su/happ/proxyutility/` and internal runtime helpers in `defpackage/`.
- `src/resources/`: Decoded Android resources, raw assets, configs, and library binaries.
- `apktool/`: Complete Apktool project. Contains decoded resources, `AndroidManifest.xml`, assets, and lossless Smali bytecode across `smali/`, `smali_classes2/`, and `smali_classes3/`.
- `raw/`: Direct byte-for-byte unpacked APK contents (`classes.dex`, `classes2.dex`, `classes3.dex`, `resources.arsc`, `lib/`, `assets/`).
- `ghidra/`: Native analysis for Xray core (`libgojni.so` and `libxray.so`).
  - `ghidra/pclntab.tsv`: Extracted Go symbol table with 37,290 function entries.
  - `ghidra/out/c/`: 124 decompiled C functions covering JNI bridges and Go export bindings.
  - `ghidra/out/functions.tsv`: Address and name index for 12,008 native routines.
  - `ghidra/out/refs.txt`: Call references and cross-references.
  - `ghidra/scripts/`: Headless Ghidra scripts for symbol import and C pseudocode extraction.

### Source Details and Code Recovery

The original app was written in Kotlin, packaged with third-party dependencies (AndroidX, Sentry, OkHttp), and processed with R8.

A standard JADX run omits complex methods when control flow graphs cannot be cleanly resolved, leaving empty stubs with `Method dump skipped`. In this repository, those passes were re-run with `--show-bad-code --comments-level debug` against `classes2.dex`. As a result, all previously omitted methods in `MainActivity`, `SubscriptionUpdater`, `service/b`, `MetaParams`, and over 110 classes in `defpackage` have been recovered.

Because Kotlin coroutines compile down to state machines (`s51`, `Continuation` passes), decompiled Java represents them as switch-case jumps rather than standard async functions.

### How to Rebuild the APK

If you want to modify and reassemble the application, work through the `apktool/` directory:

1. Rebuild the package with Apktool:
   ```bash
   apktool b apktool -o rebuilt.apk
   ```
2. Align the archive:
   ```bash
   zipalign -p -f -v 4 rebuilt.apk aligned.apk
   ```
3. Sign with your test key:
   ```bash
   apksigner sign --ks debug.keystore aligned.apk
   ```

Do not try to build `src/sources/` directly through Gradle or `javac`. JADX output exists for code auditing and understanding logic. Turning decompiled Java back into a fresh buildable Gradle project requires setting up a clean Android Studio project, importing proper dependencies, and manually adapting R8 artifacts. For quick patches and behavior changes, edit Smali files in `apktool/smali*` and run `apktool b`.

---

## Русский

### Общая информация

В репозитории выложены декомпилированные исходники, ресурсы, байткод Smali и нативные артефакты приложения Happ для Android (`Happ.apk`).

- Пакет: `su.happ.proxyutility`
- Версия: 4.9.0 (код версии 1721)
- Версии SDK: minSdk 24, targetSdk 37
- Контрольная сумма APK (SHA-256): `47aac2a2310553ca85ef390c2ae1674d79d9d70c215ef36a35cdf433f5b8323d`

### Структура каталогов

- `src/sources/`: Java-исходники после JADX (11 412 файлов). Собственный код приложения находится в `su/happ/proxyutility/`, вспомогательные классы обфускации лежат в `defpackage/`.
- `src/resources/`: Распакованные ресурсы, манифест, исходные ассеты и библиотеки.
- `apktool/`: Проект Apktool с байткодом Smali (`smali/`, `smali_classes2/`, `smali_classes3/`), ресурсами и `AndroidManifest.xml`.
- `raw/`: Прямое побайтовое содержимое APK без пересборки (`classes*.dex`, `resources.arsc`, `lib/`, `assets/`).
- `ghidra/`: Результаты разбора нативного Go/Xray ядра (`libgojni.so`, `libxray.so`).
  - `ghidra/pclntab.tsv`: Таблица из 37 290 Go-символов.
  - `ghidra/out/c/`: 124 декомпилированные C-функции JNI-моста и cgo-экспортов.
  - `ghidra/out/functions.tsv`: Список 12 008 функций с адресами входа.
  - `ghidra/out/refs.txt`: Перекрёстные вызовы между функциями.
  - `ghidra/scripts/`: Скрипты для Ghidra по импорту имен и экспорту псевдокода.

### Особенности декомпиляции

Приложение написано на Kotlin с активным использованием корутин и сжато через R8.

Стандартный прогон JADX отбрасывает участки со сложным графом переходов, подставляя заглушку `Method dump skipped`. В этой сборке код `classes2.dex` декомпилирован повторно с флагами `--show-bad-code --comments-level debug`. Это позволило полностью восстановить логику всех ранее пропущенных методов в `MainActivity`, `SubscriptionUpdater`, `service/b`, `MetaParams` и 110 классах в `defpackage`.

Корутины Kotlin после декомпиляции выглядят как стейт-машины со `switch-case` переходами и вспомогательными интерфейсами.

### Как пересобрать APK

Если нужно внести правки и собрать рабочий файл обратно, используйте папку `apktool/`:

1. Сборка пакета через Apktool:
   ```bash
   apktool b apktool -o rebuilt.apk
   ```
2. Выравнивание zip-структуры:
   ```bash
   zipalign -p -f -v 4 rebuilt.apk aligned.apk
   ```
3. Подпись тестовым ключом:
   ```bash
   apksigner sign --ks debug.keystore aligned.apk
   ```

Собрать приложение напрямую из папки `src/sources/` через `javac` или Android Studio не выйдет. JADX генерирует код для чтения и аудита архитектуры, а не для прямой компиляции. В коде много синтетических конструкций R8, скомпилированных корутин и внутренних пакетов `defpackage`. Чтобы собрать проект из чистого кода, логику нужно переносить в новый чистый проект Android Studio с подключением официальных библиотек через Gradle. Для быстрых правок надежнее менять Smali в `apktool/smali*` и пересобирать через `apktool b`.
