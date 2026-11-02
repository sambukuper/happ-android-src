.class public abstract Lbs5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lql3;

.field public static final b:Lql3;

.field public static final c:Lql3;

.field public static final d:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lql3;

    .line 2
    .line 3
    sget-object v1, Lh75;->Y:Lh75;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lql3;-><init>(Lh75;Z)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lbs5;->a:Lql3;

    .line 10
    .line 11
    new-instance v0, Lql3;

    .line 12
    .line 13
    sget-object v1, Lh75;->Z:Lh75;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lql3;-><init>(Lh75;Z)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lbs5;->b:Lql3;

    .line 19
    .line 20
    new-instance v0, Lql3;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-direct {v0, v1, v3}, Lql3;-><init>(Lh75;Z)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lbs5;->c:Lql3;

    .line 27
    .line 28
    new-instance v0, Lfj4;

    .line 29
    .line 30
    invoke-direct {v0, v3}, Lfj4;-><init>(B)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lxd6;

    .line 34
    .line 35
    const/16 v4, 0x8

    .line 36
    .line 37
    const-string v5, "java/util/Iterator"

    .line 38
    .line 39
    invoke-direct {v1, v4, v0, v5, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 40
    .line 41
    .line 42
    new-instance v5, Lve7;

    .line 43
    .line 44
    const/16 v6, 0x12

    .line 45
    .line 46
    invoke-direct {v5, v6}, Lve7;-><init>(B)V

    .line 47
    .line 48
    .line 49
    const-string v7, "forEachRemaining"

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-virtual {v1, v7, v8, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lxd6;

    .line 56
    .line 57
    const-string v5, "java/lang/Iterable"

    .line 58
    .line 59
    invoke-direct {v1, v4, v0, v5, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 60
    .line 61
    .line 62
    new-instance v5, Lve7;

    .line 63
    .line 64
    const/16 v7, 0x1d

    .line 65
    .line 66
    invoke-direct {v5, v7}, Lve7;-><init>(B)V

    .line 67
    .line 68
    .line 69
    const-string v9, "spliterator"

    .line 70
    .line 71
    invoke-virtual {v1, v9, v8, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Lxd6;

    .line 75
    .line 76
    const-string v5, "java/util/Collection"

    .line 77
    .line 78
    invoke-direct {v1, v4, v0, v5, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 79
    .line 80
    .line 81
    new-instance v5, Lzr5;

    .line 82
    .line 83
    const/16 v9, 0xa

    .line 84
    .line 85
    invoke-direct {v5, v9}, Lzr5;-><init>(B)V

    .line 86
    .line 87
    .line 88
    const-string v9, "removeIf"

    .line 89
    .line 90
    invoke-virtual {v1, v9, v8, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 91
    .line 92
    .line 93
    new-instance v5, Lzr5;

    .line 94
    .line 95
    const/16 v9, 0x15

    .line 96
    .line 97
    invoke-direct {v5, v9}, Lzr5;-><init>(B)V

    .line 98
    .line 99
    .line 100
    const-string v10, "stream"

    .line 101
    .line 102
    invoke-virtual {v1, v10, v8, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 103
    .line 104
    .line 105
    new-instance v5, Lzr5;

    .line 106
    .line 107
    const/16 v10, 0x1a

    .line 108
    .line 109
    invoke-direct {v5, v10}, Lzr5;-><init>(B)V

    .line 110
    .line 111
    .line 112
    const-string v11, "parallelStream"

    .line 113
    .line 114
    invoke-virtual {v1, v11, v8, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Lxd6;

    .line 118
    .line 119
    const-string v5, "java/util/List"

    .line 120
    .line 121
    invoke-direct {v1, v4, v0, v5, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 122
    .line 123
    .line 124
    new-instance v5, Lzr5;

    .line 125
    .line 126
    const/16 v11, 0x1b

    .line 127
    .line 128
    invoke-direct {v5, v11}, Lzr5;-><init>(B)V

    .line 129
    .line 130
    .line 131
    const-string v12, "replaceAll"

    .line 132
    .line 133
    invoke-virtual {v1, v12, v8, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 134
    .line 135
    .line 136
    new-instance v5, Lzr5;

    .line 137
    .line 138
    const/16 v13, 0x1c

    .line 139
    .line 140
    invoke-direct {v5, v13}, Lzr5;-><init>(B)V

    .line 141
    .line 142
    .line 143
    const-string v14, "addFirst"

    .line 144
    .line 145
    const-string v15, "2.1"

    .line 146
    .line 147
    invoke-virtual {v1, v14, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 148
    .line 149
    .line 150
    new-instance v5, Lzr5;

    .line 151
    .line 152
    invoke-direct {v5, v7}, Lzr5;-><init>(B)V

    .line 153
    .line 154
    .line 155
    const-string v7, "addLast"

    .line 156
    .line 157
    invoke-virtual {v1, v7, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 158
    .line 159
    .line 160
    new-instance v5, Las5;

    .line 161
    .line 162
    invoke-direct {v5, v2}, Las5;-><init>(B)V

    .line 163
    .line 164
    .line 165
    const-string v6, "removeFirst"

    .line 166
    .line 167
    invoke-virtual {v1, v6, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 168
    .line 169
    .line 170
    new-instance v5, Las5;

    .line 171
    .line 172
    invoke-direct {v5, v3}, Las5;-><init>(B)V

    .line 173
    .line 174
    .line 175
    const-string v3, "removeLast"

    .line 176
    .line 177
    invoke-virtual {v1, v3, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Lxd6;

    .line 181
    .line 182
    const-string v5, "java/util/LinkedList"

    .line 183
    .line 184
    invoke-direct {v1, v4, v0, v5, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 185
    .line 186
    .line 187
    new-instance v5, Lve7;

    .line 188
    .line 189
    const/16 v8, 0x13

    .line 190
    .line 191
    invoke-direct {v5, v8}, Lve7;-><init>(B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v14, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 195
    .line 196
    .line 197
    new-instance v5, Lve7;

    .line 198
    .line 199
    const/16 v8, 0x14

    .line 200
    .line 201
    invoke-direct {v5, v8}, Lve7;-><init>(B)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v7, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 205
    .line 206
    .line 207
    new-instance v5, Lve7;

    .line 208
    .line 209
    invoke-direct {v5, v9}, Lve7;-><init>(B)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v6, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 213
    .line 214
    .line 215
    new-instance v5, Lve7;

    .line 216
    .line 217
    const/16 v9, 0x16

    .line 218
    .line 219
    invoke-direct {v5, v9}, Lve7;-><init>(B)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v3, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 223
    .line 224
    .line 225
    new-instance v1, Lxd6;

    .line 226
    .line 227
    const-string v5, "java/util/LinkedHashSet"

    .line 228
    .line 229
    invoke-direct {v1, v4, v0, v5, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 230
    .line 231
    .line 232
    new-instance v5, Lve7;

    .line 233
    .line 234
    const/16 v15, 0x17

    .line 235
    .line 236
    invoke-direct {v5, v15}, Lve7;-><init>(B)V

    .line 237
    .line 238
    .line 239
    const-string v15, "2.2"

    .line 240
    .line 241
    invoke-virtual {v1, v14, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 242
    .line 243
    .line 244
    new-instance v5, Lve7;

    .line 245
    .line 246
    const/16 v14, 0x18

    .line 247
    .line 248
    invoke-direct {v5, v14}, Lve7;-><init>(B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v7, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 252
    .line 253
    .line 254
    new-instance v5, Lve7;

    .line 255
    .line 256
    const/16 v7, 0x19

    .line 257
    .line 258
    invoke-direct {v5, v7}, Lve7;-><init>(B)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v6, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 262
    .line 263
    .line 264
    new-instance v5, Lve7;

    .line 265
    .line 266
    invoke-direct {v5, v10}, Lve7;-><init>(B)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v3, v15, v5}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 270
    .line 271
    .line 272
    new-instance v3, Lve7;

    .line 273
    .line 274
    invoke-direct {v3, v11}, Lve7;-><init>(B)V

    .line 275
    .line 276
    .line 277
    const-string v5, "getFirst"

    .line 278
    .line 279
    invoke-virtual {v1, v5, v15, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 280
    .line 281
    .line 282
    new-instance v3, Lve7;

    .line 283
    .line 284
    invoke-direct {v3, v13}, Lve7;-><init>(B)V

    .line 285
    .line 286
    .line 287
    const-string v5, "getLast"

    .line 288
    .line 289
    invoke-virtual {v1, v5, v15, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 290
    .line 291
    .line 292
    new-instance v1, Lxd6;

    .line 293
    .line 294
    const-string v3, "java/util/Map"

    .line 295
    .line 296
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 297
    .line 298
    .line 299
    new-instance v3, Lzr5;

    .line 300
    .line 301
    invoke-direct {v3, v2}, Lzr5;-><init>(B)V

    .line 302
    .line 303
    .line 304
    const-string v5, "forEach"

    .line 305
    .line 306
    const/4 v6, 0x0

    .line 307
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 308
    .line 309
    .line 310
    new-instance v3, Lzr5;

    .line 311
    .line 312
    const/4 v5, 0x1

    .line 313
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 314
    .line 315
    .line 316
    const-string v5, "putIfAbsent"

    .line 317
    .line 318
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 319
    .line 320
    .line 321
    new-instance v3, Lzr5;

    .line 322
    .line 323
    const/4 v5, 0x2

    .line 324
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 325
    .line 326
    .line 327
    const-string v5, "replace"

    .line 328
    .line 329
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 330
    .line 331
    .line 332
    new-instance v3, Lzr5;

    .line 333
    .line 334
    const/4 v10, 0x3

    .line 335
    invoke-direct {v3, v10}, Lzr5;-><init>(B)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 339
    .line 340
    .line 341
    new-instance v3, Lzr5;

    .line 342
    .line 343
    const/4 v5, 0x4

    .line 344
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v12, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 348
    .line 349
    .line 350
    new-instance v3, Lzr5;

    .line 351
    .line 352
    const/4 v5, 0x5

    .line 353
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 354
    .line 355
    .line 356
    const-string v5, "compute"

    .line 357
    .line 358
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 359
    .line 360
    .line 361
    new-instance v3, Lzr5;

    .line 362
    .line 363
    const/4 v5, 0x6

    .line 364
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 365
    .line 366
    .line 367
    const-string v5, "computeIfAbsent"

    .line 368
    .line 369
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 370
    .line 371
    .line 372
    new-instance v3, Lzr5;

    .line 373
    .line 374
    const/4 v5, 0x7

    .line 375
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 376
    .line 377
    .line 378
    const-string v5, "computeIfPresent"

    .line 379
    .line 380
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 381
    .line 382
    .line 383
    new-instance v3, Lzr5;

    .line 384
    .line 385
    invoke-direct {v3, v4}, Lzr5;-><init>(B)V

    .line 386
    .line 387
    .line 388
    const-string v5, "merge"

    .line 389
    .line 390
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 391
    .line 392
    .line 393
    new-instance v1, Lxd6;

    .line 394
    .line 395
    const-string v3, "java/util/LinkedHashMap"

    .line 396
    .line 397
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 398
    .line 399
    .line 400
    new-instance v3, Lzr5;

    .line 401
    .line 402
    const/16 v5, 0x9

    .line 403
    .line 404
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 405
    .line 406
    .line 407
    const-string v5, "putFirst"

    .line 408
    .line 409
    invoke-virtual {v1, v5, v15, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 410
    .line 411
    .line 412
    new-instance v3, Lzr5;

    .line 413
    .line 414
    const/16 v5, 0xb

    .line 415
    .line 416
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 417
    .line 418
    .line 419
    const-string v5, "putLast"

    .line 420
    .line 421
    invoke-virtual {v1, v5, v15, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 422
    .line 423
    .line 424
    new-instance v1, Lxd6;

    .line 425
    .line 426
    const-string v3, "java/util/Optional"

    .line 427
    .line 428
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 429
    .line 430
    .line 431
    new-instance v3, Lzr5;

    .line 432
    .line 433
    const/16 v5, 0xc

    .line 434
    .line 435
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 436
    .line 437
    .line 438
    const-string v5, "empty"

    .line 439
    .line 440
    const/4 v6, 0x0

    .line 441
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 442
    .line 443
    .line 444
    new-instance v3, Lzr5;

    .line 445
    .line 446
    const/16 v5, 0xd

    .line 447
    .line 448
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 449
    .line 450
    .line 451
    const-string v5, "of"

    .line 452
    .line 453
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 454
    .line 455
    .line 456
    new-instance v3, Lzr5;

    .line 457
    .line 458
    const/16 v5, 0xe

    .line 459
    .line 460
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 461
    .line 462
    .line 463
    const-string v5, "ofNullable"

    .line 464
    .line 465
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 466
    .line 467
    .line 468
    new-instance v3, Lzr5;

    .line 469
    .line 470
    const/16 v5, 0xf

    .line 471
    .line 472
    invoke-direct {v3, v5}, Lzr5;-><init>(B)V

    .line 473
    .line 474
    .line 475
    const-string v5, "get"

    .line 476
    .line 477
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 478
    .line 479
    .line 480
    new-instance v3, Lzr5;

    .line 481
    .line 482
    const/16 v10, 0x10

    .line 483
    .line 484
    invoke-direct {v3, v10}, Lzr5;-><init>(B)V

    .line 485
    .line 486
    .line 487
    const-string v10, "ifPresent"

    .line 488
    .line 489
    invoke-virtual {v1, v10, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 490
    .line 491
    .line 492
    new-instance v1, Lxd6;

    .line 493
    .line 494
    const-string v3, "java/lang/ref/Reference"

    .line 495
    .line 496
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 497
    .line 498
    .line 499
    new-instance v3, Lzr5;

    .line 500
    .line 501
    const/16 v10, 0x11

    .line 502
    .line 503
    invoke-direct {v3, v10}, Lzr5;-><init>(B)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1, v5, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 507
    .line 508
    .line 509
    new-instance v1, Lxd6;

    .line 510
    .line 511
    const-string v3, "java/util/function/Predicate"

    .line 512
    .line 513
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 514
    .line 515
    .line 516
    new-instance v3, Lzr5;

    .line 517
    .line 518
    const/16 v10, 0x12

    .line 519
    .line 520
    invoke-direct {v3, v10}, Lzr5;-><init>(B)V

    .line 521
    .line 522
    .line 523
    const-string v10, "test"

    .line 524
    .line 525
    invoke-virtual {v1, v10, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 526
    .line 527
    .line 528
    new-instance v1, Lxd6;

    .line 529
    .line 530
    const-string v3, "java/util/function/BiPredicate"

    .line 531
    .line 532
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 533
    .line 534
    .line 535
    new-instance v3, Lzr5;

    .line 536
    .line 537
    const/16 v11, 0x13

    .line 538
    .line 539
    invoke-direct {v3, v11}, Lzr5;-><init>(B)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1, v10, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 543
    .line 544
    .line 545
    new-instance v1, Lxd6;

    .line 546
    .line 547
    const-string v3, "java/util/function/Consumer"

    .line 548
    .line 549
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 550
    .line 551
    .line 552
    new-instance v3, Lzr5;

    .line 553
    .line 554
    invoke-direct {v3, v8}, Lzr5;-><init>(B)V

    .line 555
    .line 556
    .line 557
    const-string v8, "accept"

    .line 558
    .line 559
    invoke-virtual {v1, v8, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 560
    .line 561
    .line 562
    new-instance v1, Lxd6;

    .line 563
    .line 564
    const-string v3, "java/util/function/BiConsumer"

    .line 565
    .line 566
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 567
    .line 568
    .line 569
    new-instance v3, Lzr5;

    .line 570
    .line 571
    invoke-direct {v3, v9}, Lzr5;-><init>(B)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1, v8, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 575
    .line 576
    .line 577
    new-instance v1, Lxd6;

    .line 578
    .line 579
    const-string v3, "java/util/function/Function"

    .line 580
    .line 581
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 582
    .line 583
    .line 584
    new-instance v3, Lzr5;

    .line 585
    .line 586
    const/16 v8, 0x17

    .line 587
    .line 588
    invoke-direct {v3, v8}, Lzr5;-><init>(B)V

    .line 589
    .line 590
    .line 591
    const-string v8, "apply"

    .line 592
    .line 593
    invoke-virtual {v1, v8, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 594
    .line 595
    .line 596
    new-instance v1, Lxd6;

    .line 597
    .line 598
    const-string v3, "java/util/function/BiFunction"

    .line 599
    .line 600
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 601
    .line 602
    .line 603
    new-instance v3, Lzr5;

    .line 604
    .line 605
    invoke-direct {v3, v14}, Lzr5;-><init>(B)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v8, v6, v3}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 609
    .line 610
    .line 611
    new-instance v1, Lxd6;

    .line 612
    .line 613
    const-string v3, "java/util/function/Supplier"

    .line 614
    .line 615
    invoke-direct {v1, v4, v0, v3, v2}, Lxd6;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 616
    .line 617
    .line 618
    new-instance v2, Lzr5;

    .line 619
    .line 620
    invoke-direct {v2, v7}, Lzr5;-><init>(B)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v1, v5, v6, v2}, Lxd6;->o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V

    .line 624
    .line 625
    .line 626
    iget-object v0, v0, Lfj4;->a:Ljava/util/LinkedHashMap;

    .line 627
    .line 628
    sput-object v0, Lbs5;->d:Ljava/util/LinkedHashMap;

    .line 629
    .line 630
    return-void
.end method
