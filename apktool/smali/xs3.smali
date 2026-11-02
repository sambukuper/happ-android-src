.class public final Lxs3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ljava/util/LinkedHashSet;

.field public static final b:Ljava/util/LinkedHashSet;

.field public static final c:Ljava/util/LinkedHashSet;

.field public static final d:Ljava/util/LinkedHashSet;

.field public static final e:Ljava/util/LinkedHashSet;

.field public static final f:Ljava/util/LinkedHashSet;

.field public static final g:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 52

    .line 1
    const-string v0, "toArray()[Ljava/lang/Object;"

    .line 2
    .line 3
    const-string v1, "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Collection"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lq57;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lxs3;->a:Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    sget-object v0, Lut3;->g0:Lut3;

    .line 24
    .line 25
    sget-object v2, Lut3;->h0:Lut3;

    .line 26
    .line 27
    filled-new-array {v0, v2}, [Lut3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lut3;

    .line 55
    .line 56
    iget-object v4, v3, Lut3;->f0:Lfk2;

    .line 57
    .line 58
    iget-object v4, v4, Lfk2;->a:Lgk2;

    .line 59
    .line 60
    invoke-virtual {v4}, Lgk2;->g()Lv15;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v4}, Lv15;->b()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    iget-object v6, v3, Lut3;->Y:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v6, "Value()"

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v3, v3, Lut3;->Z:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    filled-new-array {v3}, [Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v5, "java/lang/"

    .line 97
    .line 98
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    const/4 v5, 0x1

    .line 103
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    check-cast v3, [Ljava/lang/String;

    .line 108
    .line 109
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 110
    .line 111
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 112
    .line 113
    .line 114
    array-length v6, v3

    .line 115
    const/4 v7, 0x0

    .line 116
    :goto_1
    if-ge v7, v6, :cond_0

    .line 117
    .line 118
    aget-object v8, v3, v7

    .line 119
    .line 120
    new-instance v9, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const/16 v10, 0x2e

    .line 126
    .line 127
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    add-int/lit8 v7, v7, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_0
    invoke-static {v2, v5}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_1
    const-string v0, "sort(Ljava/util/Comparator;)V"

    .line 148
    .line 149
    const-string v3, "reversed()Ljava/util/List;"

    .line 150
    .line 151
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const-string v3, "List"

    .line 156
    .line 157
    invoke-static {v3, v0}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v2, v0}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const-string v50, "lines()Ljava/util/stream/Stream;"

    .line 166
    .line 167
    const-string v51, "repeat(I)Ljava/lang/String;"

    .line 168
    .line 169
    const-string v4, "codePointAt(I)I"

    .line 170
    .line 171
    const-string v5, "codePointBefore(I)I"

    .line 172
    .line 173
    const-string v6, "codePointCount(II)I"

    .line 174
    .line 175
    const-string v7, "compareToIgnoreCase(Ljava/lang/String;)I"

    .line 176
    .line 177
    const-string v8, "concat(Ljava/lang/String;)Ljava/lang/String;"

    .line 178
    .line 179
    const-string v9, "contains(Ljava/lang/CharSequence;)Z"

    .line 180
    .line 181
    const-string v10, "contentEquals(Ljava/lang/CharSequence;)Z"

    .line 182
    .line 183
    const-string v11, "contentEquals(Ljava/lang/StringBuffer;)Z"

    .line 184
    .line 185
    const-string v12, "endsWith(Ljava/lang/String;)Z"

    .line 186
    .line 187
    const-string v13, "equalsIgnoreCase(Ljava/lang/String;)Z"

    .line 188
    .line 189
    const-string v14, "getBytes()[B"

    .line 190
    .line 191
    const-string v15, "getBytes(II[BI)V"

    .line 192
    .line 193
    const-string v16, "getBytes(Ljava/lang/String;)[B"

    .line 194
    .line 195
    const-string v17, "getBytes(Ljava/nio/charset/Charset;)[B"

    .line 196
    .line 197
    const-string v18, "getChars(II[CI)V"

    .line 198
    .line 199
    const-string v19, "indexOf(I)I"

    .line 200
    .line 201
    const-string v20, "indexOf(II)I"

    .line 202
    .line 203
    const-string v21, "indexOf(Ljava/lang/String;)I"

    .line 204
    .line 205
    const-string v22, "indexOf(Ljava/lang/String;I)I"

    .line 206
    .line 207
    const-string v23, "intern()Ljava/lang/String;"

    .line 208
    .line 209
    const-string v24, "isEmpty()Z"

    .line 210
    .line 211
    const-string v25, "lastIndexOf(I)I"

    .line 212
    .line 213
    const-string v26, "lastIndexOf(II)I"

    .line 214
    .line 215
    const-string v27, "lastIndexOf(Ljava/lang/String;)I"

    .line 216
    .line 217
    const-string v28, "lastIndexOf(Ljava/lang/String;I)I"

    .line 218
    .line 219
    const-string v29, "matches(Ljava/lang/String;)Z"

    .line 220
    .line 221
    const-string v30, "offsetByCodePoints(II)I"

    .line 222
    .line 223
    const-string v31, "regionMatches(ILjava/lang/String;II)Z"

    .line 224
    .line 225
    const-string v32, "regionMatches(ZILjava/lang/String;II)Z"

    .line 226
    .line 227
    const-string v33, "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"

    .line 228
    .line 229
    const-string v34, "replace(CC)Ljava/lang/String;"

    .line 230
    .line 231
    const-string v35, "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"

    .line 232
    .line 233
    const-string v36, "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;"

    .line 234
    .line 235
    const-string v37, "split(Ljava/lang/String;I)[Ljava/lang/String;"

    .line 236
    .line 237
    const-string v38, "split(Ljava/lang/String;)[Ljava/lang/String;"

    .line 238
    .line 239
    const-string v39, "startsWith(Ljava/lang/String;I)Z"

    .line 240
    .line 241
    const-string v40, "startsWith(Ljava/lang/String;)Z"

    .line 242
    .line 243
    const-string v41, "substring(II)Ljava/lang/String;"

    .line 244
    .line 245
    const-string v42, "substring(I)Ljava/lang/String;"

    .line 246
    .line 247
    const-string v43, "toCharArray()[C"

    .line 248
    .line 249
    const-string v44, "toLowerCase()Ljava/lang/String;"

    .line 250
    .line 251
    const-string v45, "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;"

    .line 252
    .line 253
    const-string v46, "toUpperCase()Ljava/lang/String;"

    .line 254
    .line 255
    const-string v47, "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;"

    .line 256
    .line 257
    const-string v48, "trim()Ljava/lang/String;"

    .line 258
    .line 259
    const-string v49, "isBlank()Z"

    .line 260
    .line 261
    filled-new-array/range {v4 .. v51}, [Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    const-string v4, "String"

    .line 266
    .line 267
    invoke-static {v4, v2}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const-string v2, "Double"

    .line 276
    .line 277
    const-string v5, "isInfinite()Z"

    .line 278
    .line 279
    const-string v6, "isNaN()Z"

    .line 280
    .line 281
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    invoke-static {v2, v7}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const-string v5, "Float"

    .line 298
    .line 299
    invoke-static {v5, v2}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    const-string v2, "getDeclaringClass()Ljava/lang/Class;"

    .line 308
    .line 309
    const-string v6, "finalize()V"

    .line 310
    .line 311
    filled-new-array {v2, v6}, [Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    const-string v6, "Enum"

    .line 316
    .line 317
    invoke-static {v6, v2}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    const-string v2, "isEmpty()Z"

    .line 326
    .line 327
    filled-new-array {v2}, [Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    const-string v6, "CharSequence"

    .line 332
    .line 333
    invoke-static {v6, v2}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    sput-object v0, Lxs3;->b:Ljava/util/LinkedHashSet;

    .line 342
    .line 343
    const-string v0, "getFirst()Ljava/lang/Object;"

    .line 344
    .line 345
    const-string v2, "getLast()Ljava/lang/Object;"

    .line 346
    .line 347
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v3, v0}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    sput-object v0, Lxs3;->c:Ljava/util/LinkedHashSet;

    .line 356
    .line 357
    const-string v0, "codePoints()Ljava/util/stream/IntStream;"

    .line 358
    .line 359
    const-string v2, "chars()Ljava/util/stream/IntStream;"

    .line 360
    .line 361
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v6, v0}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    const-string v2, "forEachRemaining(Ljava/util/function/Consumer;)V"

    .line 370
    .line 371
    filled-new-array {v2}, [Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const-string v6, "Iterator"

    .line 376
    .line 377
    invoke-static {v6, v2}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    const-string v2, "forEach(Ljava/util/function/Consumer;)V"

    .line 386
    .line 387
    const-string v6, "spliterator()Ljava/util/Spliterator;"

    .line 388
    .line 389
    filled-new-array {v2, v6}, [Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    const-string v7, "Iterable"

    .line 394
    .line 395
    invoke-static {v7, v2}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    const-string v15, "getSuppressed()[Ljava/lang/Throwable;"

    .line 404
    .line 405
    const-string v16, "addSuppressed(Ljava/lang/Throwable;)V"

    .line 406
    .line 407
    const-string v7, "setStackTrace([Ljava/lang/StackTraceElement;)V"

    .line 408
    .line 409
    const-string v8, "fillInStackTrace()Ljava/lang/Throwable;"

    .line 410
    .line 411
    const-string v9, "getLocalizedMessage()Ljava/lang/String;"

    .line 412
    .line 413
    const-string v10, "printStackTrace()V"

    .line 414
    .line 415
    const-string v11, "printStackTrace(Ljava/io/PrintStream;)V"

    .line 416
    .line 417
    const-string v12, "printStackTrace(Ljava/io/PrintWriter;)V"

    .line 418
    .line 419
    const-string v13, "getStackTrace()[Ljava/lang/StackTraceElement;"

    .line 420
    .line 421
    const-string v14, "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;"

    .line 422
    .line 423
    filled-new-array/range {v7 .. v16}, [Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    const-string v7, "Throwable"

    .line 428
    .line 429
    invoke-static {v7, v2}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    const-string v2, "parallelStream()Ljava/util/stream/Stream;"

    .line 438
    .line 439
    const-string v8, "stream()Ljava/util/stream/Stream;"

    .line 440
    .line 441
    const-string v9, "removeIf(Ljava/util/function/Predicate;)Z"

    .line 442
    .line 443
    filled-new-array {v6, v2, v8, v9}, [Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-static {v1, v2}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    const-string v2, "removeFirst()Ljava/lang/Object;"

    .line 456
    .line 457
    const-string v6, "removeLast()Ljava/lang/Object;"

    .line 458
    .line 459
    const-string v8, "replaceAll(Ljava/util/function/UnaryOperator;)V"

    .line 460
    .line 461
    const-string v10, "addFirst(Ljava/lang/Object;)V"

    .line 462
    .line 463
    const-string v11, "addLast(Ljava/lang/Object;)V"

    .line 464
    .line 465
    filled-new-array {v8, v10, v11, v2, v6}, [Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    invoke-static {v3, v2}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    const-string v18, "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;"

    .line 478
    .line 479
    const-string v19, "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"

    .line 480
    .line 481
    const-string v10, "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 482
    .line 483
    const-string v11, "forEach(Ljava/util/function/BiConsumer;)V"

    .line 484
    .line 485
    const-string v12, "replaceAll(Ljava/util/function/BiFunction;)V"

    .line 486
    .line 487
    const-string v13, "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"

    .line 488
    .line 489
    const-string v14, "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"

    .line 490
    .line 491
    const-string v15, "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 492
    .line 493
    const-string v16, "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"

    .line 494
    .line 495
    const-string v17, "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 496
    .line 497
    filled-new-array/range {v10 .. v19}, [Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    const-string v6, "Map"

    .line 502
    .line 503
    invoke-static {v6, v2}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    invoke-static {v0, v2}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    sput-object v0, Lxs3;->d:Ljava/util/LinkedHashSet;

    .line 512
    .line 513
    filled-new-array {v9}, [Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static {v1, v0}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    const-string v12, "removeFirst()Ljava/lang/Object;"

    .line 522
    .line 523
    const-string v13, "removeLast()Ljava/lang/Object;"

    .line 524
    .line 525
    const-string v8, "replaceAll(Ljava/util/function/UnaryOperator;)V"

    .line 526
    .line 527
    const-string v9, "sort(Ljava/util/Comparator;)V"

    .line 528
    .line 529
    const-string v10, "addFirst(Ljava/lang/Object;)V"

    .line 530
    .line 531
    const-string v11, "addLast(Ljava/lang/Object;)V"

    .line 532
    .line 533
    filled-new-array/range {v8 .. v13}, [Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    invoke-static {v3, v1}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-static {v0, v1}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    const-string v15, "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 546
    .line 547
    const-string v16, "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"

    .line 548
    .line 549
    const-string v8, "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;"

    .line 550
    .line 551
    const-string v9, "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"

    .line 552
    .line 553
    const-string v10, "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"

    .line 554
    .line 555
    const-string v11, "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"

    .line 556
    .line 557
    const-string v12, "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 558
    .line 559
    const-string v13, "remove(Ljava/lang/Object;Ljava/lang/Object;)Z"

    .line 560
    .line 561
    const-string v14, "replaceAll(Ljava/util/function/BiFunction;)V"

    .line 562
    .line 563
    filled-new-array/range {v8 .. v16}, [Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-static {v6, v1}, Lqe4;->r0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    invoke-static {v0, v1}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    sput-object v0, Lxs3;->e:Ljava/util/LinkedHashSet;

    .line 576
    .line 577
    sget-object v8, Lut3;->g0:Lut3;

    .line 578
    .line 579
    sget-object v9, Lut3;->i0:Lut3;

    .line 580
    .line 581
    sget-object v10, Lut3;->n0:Lut3;

    .line 582
    .line 583
    sget-object v11, Lut3;->l0:Lut3;

    .line 584
    .line 585
    sget-object v13, Lut3;->k0:Lut3;

    .line 586
    .line 587
    sget-object v14, Lut3;->m0:Lut3;

    .line 588
    .line 589
    sget-object v15, Lut3;->j0:Lut3;

    .line 590
    .line 591
    move-object v12, v9

    .line 592
    filled-new-array/range {v8 .. v15}, [Lut3;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 601
    .line 602
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 603
    .line 604
    .line 605
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    if-eqz v2, :cond_2

    .line 614
    .line 615
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    check-cast v2, Lut3;

    .line 620
    .line 621
    iget-object v2, v2, Lut3;->f0:Lfk2;

    .line 622
    .line 623
    iget-object v2, v2, Lfk2;->a:Lgk2;

    .line 624
    .line 625
    invoke-virtual {v2}, Lgk2;->g()Lv15;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    invoke-virtual {v2}, Lv15;->b()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    const-string v3, "Ljava/lang/String;"

    .line 637
    .line 638
    filled-new-array {v3}, [Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    invoke-static {v3}, Lqe4;->U([Ljava/lang/String;)[Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    array-length v6, v3

    .line 647
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    check-cast v3, [Ljava/lang/String;

    .line 652
    .line 653
    invoke-static {v2, v3}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-static {v1, v2}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 658
    .line 659
    .line 660
    goto :goto_2

    .line 661
    :cond_2
    const-string v0, "D"

    .line 662
    .line 663
    filled-new-array {v0}, [Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v0}, Lqe4;->U([Ljava/lang/String;)[Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    array-length v2, v0

    .line 672
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    check-cast v0, [Ljava/lang/String;

    .line 677
    .line 678
    invoke-static {v5, v0}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-static {v1, v0}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    const-string v17, "Ljava/lang/StringBuffer;"

    .line 687
    .line 688
    const-string v18, "Ljava/lang/StringBuilder;"

    .line 689
    .line 690
    const-string v8, "[C"

    .line 691
    .line 692
    const-string v9, "[CII"

    .line 693
    .line 694
    const-string v10, "[III"

    .line 695
    .line 696
    const-string v11, "[BIILjava/lang/String;"

    .line 697
    .line 698
    const-string v12, "[BIILjava/nio/charset/Charset;"

    .line 699
    .line 700
    const-string v13, "[BLjava/lang/String;"

    .line 701
    .line 702
    const-string v14, "[BLjava/nio/charset/Charset;"

    .line 703
    .line 704
    const-string v15, "[BII"

    .line 705
    .line 706
    const-string v16, "[B"

    .line 707
    .line 708
    filled-new-array/range {v8 .. v18}, [Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    invoke-static {v1}, Lqe4;->U([Ljava/lang/String;)[Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    array-length v2, v1

    .line 717
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    check-cast v1, [Ljava/lang/String;

    .line 722
    .line 723
    invoke-static {v4, v1}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    invoke-static {v0, v1}, Lq57;->Z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    sput-object v0, Lxs3;->f:Ljava/util/LinkedHashSet;

    .line 732
    .line 733
    const-string v0, "Ljava/lang/String;Ljava/lang/Throwable;ZZ"

    .line 734
    .line 735
    filled-new-array {v0}, [Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-static {v0}, Lqe4;->U([Ljava/lang/String;)[Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    array-length v1, v0

    .line 744
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    check-cast v0, [Ljava/lang/String;

    .line 749
    .line 750
    invoke-static {v7, v0}, Lqe4;->m0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    sput-object v0, Lxs3;->g:Ljava/util/LinkedHashSet;

    .line 755
    .line 756
    return-void
.end method
