.class public final Lzr5;
.super Ljava/lang/Object;

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lzr5;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte p0, p0, Lzr5;->X:B

    .line 2
    .line 3
    const-string v0, "java/util/stream/Stream"

    .line 4
    .line 5
    const-string v1, "java/util/Optional"

    .line 6
    .line 7
    const-string v2, "java/util/function/BiFunction"

    .line 8
    .line 9
    const-string v3, "java/lang/Object"

    .line 10
    .line 11
    sget-object v4, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    check-cast p1, Ld97;

    .line 14
    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lbs5;->b:Lql3;

    .line 22
    .line 23
    filled-new-array {p0}, [Lql3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 28
    .line 29
    .line 30
    return-object v4

    .line 31
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lbs5;->b:Lql3;

    .line 35
    .line 36
    filled-new-array {p0}, [Lql3;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 41
    .line 42
    .line 43
    return-object v4

    .line 44
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget-object p0, Lbs5;->b:Lql3;

    .line 48
    .line 49
    filled-new-array {p0, p0}, [Lql3;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v0, "java/util/function/UnaryOperator"

    .line 54
    .line 55
    invoke-virtual {p1, v0, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object p0, Lbs5;->b:Lql3;

    .line 63
    .line 64
    filled-new-array {p0, p0}, [Lql3;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p1, v0, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 69
    .line 70
    .line 71
    return-object v4

    .line 72
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object p0, Lbs5;->b:Lql3;

    .line 76
    .line 77
    filled-new-array {p0}, [Lql3;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 82
    .line 83
    .line 84
    return-object v4

    .line 85
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object p0, Lbs5;->b:Lql3;

    .line 89
    .line 90
    filled-new-array {p0}, [Lql3;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 95
    .line 96
    .line 97
    filled-new-array {p0}, [Lql3;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 102
    .line 103
    .line 104
    filled-new-array {p0}, [Lql3;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 109
    .line 110
    .line 111
    return-object v4

    .line 112
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object p0, Lbs5;->b:Lql3;

    .line 116
    .line 117
    filled-new-array {p0}, [Lql3;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 122
    .line 123
    .line 124
    filled-new-array {p0}, [Lql3;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 129
    .line 130
    .line 131
    return-object v4

    .line 132
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    sget-object p0, Lbs5;->b:Lql3;

    .line 136
    .line 137
    filled-new-array {p0}, [Lql3;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 142
    .line 143
    .line 144
    filled-new-array {p0}, [Lql3;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 149
    .line 150
    .line 151
    return-object v4

    .line 152
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    sget-object p0, Lbs5;->b:Lql3;

    .line 156
    .line 157
    filled-new-array {p0, p0}, [Lql3;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p1, v0, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 162
    .line 163
    .line 164
    return-object v4

    .line 165
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    sget-object p0, Lbs5;->b:Lql3;

    .line 169
    .line 170
    filled-new-array {p0}, [Lql3;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 175
    .line 176
    .line 177
    return-object v4

    .line 178
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    sget-object p0, Lbs5;->b:Lql3;

    .line 182
    .line 183
    filled-new-array {p0}, [Lql3;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 188
    .line 189
    .line 190
    filled-new-array {p0}, [Lql3;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 195
    .line 196
    .line 197
    sget-object p0, Lut3;->g0:Lut3;

    .line 198
    .line 199
    invoke-virtual {p1, p0}, Ld97;->b(Lut3;)V

    .line 200
    .line 201
    .line 202
    return-object v4

    .line 203
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    sget-object p0, Lbs5;->b:Lql3;

    .line 207
    .line 208
    filled-new-array {p0}, [Lql3;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 213
    .line 214
    .line 215
    sget-object p0, Lut3;->g0:Lut3;

    .line 216
    .line 217
    invoke-virtual {p1, p0}, Ld97;->b(Lut3;)V

    .line 218
    .line 219
    .line 220
    return-object v4

    .line 221
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    sget-object p0, Lbs5;->a:Lql3;

    .line 225
    .line 226
    filled-new-array {p0}, [Lql3;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 231
    .line 232
    .line 233
    return-object v4

    .line 234
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    sget-object p0, Lbs5;->b:Lql3;

    .line 238
    .line 239
    sget-object v0, Lbs5;->c:Lql3;

    .line 240
    .line 241
    filled-new-array {p0, v0}, [Lql3;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    const-string v0, "java/util/function/Consumer"

    .line 246
    .line 247
    invoke-virtual {p1, v0, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 248
    .line 249
    .line 250
    return-object v4

    .line 251
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    sget-object p0, Lbs5;->c:Lql3;

    .line 255
    .line 256
    filled-new-array {p0}, [Lql3;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 261
    .line 262
    .line 263
    return-object v4

    .line 264
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    sget-object p0, Lbs5;->a:Lql3;

    .line 268
    .line 269
    filled-new-array {p0}, [Lql3;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 274
    .line 275
    .line 276
    sget-object p0, Lbs5;->b:Lql3;

    .line 277
    .line 278
    sget-object v0, Lbs5;->c:Lql3;

    .line 279
    .line 280
    filled-new-array {p0, v0}, [Lql3;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-virtual {p1, v1, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 285
    .line 286
    .line 287
    return-object v4

    .line 288
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    sget-object p0, Lbs5;->c:Lql3;

    .line 292
    .line 293
    filled-new-array {p0}, [Lql3;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 298
    .line 299
    .line 300
    sget-object v0, Lbs5;->b:Lql3;

    .line 301
    .line 302
    filled-new-array {v0, p0}, [Lql3;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p1, v1, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 307
    .line 308
    .line 309
    return-object v4

    .line 310
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    sget-object p0, Lbs5;->b:Lql3;

    .line 314
    .line 315
    sget-object v0, Lbs5;->c:Lql3;

    .line 316
    .line 317
    filled-new-array {p0, v0}, [Lql3;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-virtual {p1, v1, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 322
    .line 323
    .line 324
    return-object v4

    .line 325
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    sget-object p0, Lbs5;->b:Lql3;

    .line 329
    .line 330
    filled-new-array {p0}, [Lql3;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 335
    .line 336
    .line 337
    filled-new-array {p0}, [Lql3;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 342
    .line 343
    .line 344
    sget-object p0, Lbs5;->a:Lql3;

    .line 345
    .line 346
    filled-new-array {p0}, [Lql3;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 351
    .line 352
    .line 353
    return-object v4

    .line 354
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    sget-object p0, Lbs5;->b:Lql3;

    .line 358
    .line 359
    filled-new-array {p0, p0}, [Lql3;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    const-string v0, "java/util/function/Predicate"

    .line 364
    .line 365
    invoke-virtual {p1, v0, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 366
    .line 367
    .line 368
    sget-object p0, Lut3;->g0:Lut3;

    .line 369
    .line 370
    invoke-virtual {p1, p0}, Ld97;->b(Lut3;)V

    .line 371
    .line 372
    .line 373
    return-object v4

    .line 374
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    sget-object p0, Lbs5;->b:Lql3;

    .line 378
    .line 379
    filled-new-array {p0}, [Lql3;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 384
    .line 385
    .line 386
    filled-new-array {p0}, [Lql3;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 391
    .line 392
    .line 393
    sget-object p0, Lbs5;->a:Lql3;

    .line 394
    .line 395
    filled-new-array {p0}, [Lql3;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 400
    .line 401
    .line 402
    return-object v4

    .line 403
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    sget-object p0, Lbs5;->b:Lql3;

    .line 407
    .line 408
    filled-new-array {p0}, [Lql3;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 413
    .line 414
    .line 415
    sget-object v0, Lbs5;->c:Lql3;

    .line 416
    .line 417
    filled-new-array {v0}, [Lql3;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    invoke-virtual {p1, v3, v1}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 422
    .line 423
    .line 424
    sget-object v1, Lbs5;->a:Lql3;

    .line 425
    .line 426
    filled-new-array {p0, v0, v0, v1}, [Lql3;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    invoke-virtual {p1, v2, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 431
    .line 432
    .line 433
    filled-new-array {v1}, [Lql3;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 438
    .line 439
    .line 440
    return-object v4

    .line 441
    :pswitch_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    sget-object p0, Lbs5;->b:Lql3;

    .line 445
    .line 446
    filled-new-array {p0}, [Lql3;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 451
    .line 452
    .line 453
    sget-object v0, Lbs5;->c:Lql3;

    .line 454
    .line 455
    sget-object v1, Lbs5;->a:Lql3;

    .line 456
    .line 457
    filled-new-array {p0, p0, v0, v1}, [Lql3;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    invoke-virtual {p1, v2, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 462
    .line 463
    .line 464
    filled-new-array {v1}, [Lql3;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 469
    .line 470
    .line 471
    return-object v4

    .line 472
    :pswitch_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    sget-object p0, Lbs5;->b:Lql3;

    .line 476
    .line 477
    filled-new-array {p0}, [Lql3;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 482
    .line 483
    .line 484
    filled-new-array {p0, p0, p0}, [Lql3;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    const-string v1, "java/util/function/Function"

    .line 489
    .line 490
    invoke-virtual {p1, v1, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 491
    .line 492
    .line 493
    filled-new-array {p0}, [Lql3;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 498
    .line 499
    .line 500
    return-object v4

    .line 501
    :pswitch_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    sget-object p0, Lbs5;->b:Lql3;

    .line 505
    .line 506
    filled-new-array {p0}, [Lql3;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 511
    .line 512
    .line 513
    sget-object v0, Lbs5;->a:Lql3;

    .line 514
    .line 515
    filled-new-array {p0, p0, v0, v0}, [Lql3;

    .line 516
    .line 517
    .line 518
    move-result-object p0

    .line 519
    invoke-virtual {p1, v2, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 520
    .line 521
    .line 522
    filled-new-array {v0}, [Lql3;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 527
    .line 528
    .line 529
    return-object v4

    .line 530
    :pswitch_18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    sget-object p0, Lbs5;->b:Lql3;

    .line 534
    .line 535
    filled-new-array {p0, p0, p0, p0}, [Lql3;

    .line 536
    .line 537
    .line 538
    move-result-object p0

    .line 539
    invoke-virtual {p1, v2, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 540
    .line 541
    .line 542
    return-object v4

    .line 543
    :pswitch_19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    sget-object p0, Lbs5;->b:Lql3;

    .line 547
    .line 548
    filled-new-array {p0}, [Lql3;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 553
    .line 554
    .line 555
    filled-new-array {p0}, [Lql3;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 560
    .line 561
    .line 562
    filled-new-array {p0}, [Lql3;

    .line 563
    .line 564
    .line 565
    move-result-object p0

    .line 566
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 567
    .line 568
    .line 569
    sget-object p0, Lut3;->g0:Lut3;

    .line 570
    .line 571
    invoke-virtual {p1, p0}, Ld97;->b(Lut3;)V

    .line 572
    .line 573
    .line 574
    return-object v4

    .line 575
    :pswitch_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    sget-object p0, Lbs5;->b:Lql3;

    .line 579
    .line 580
    filled-new-array {p0}, [Lql3;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 585
    .line 586
    .line 587
    filled-new-array {p0}, [Lql3;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 592
    .line 593
    .line 594
    sget-object p0, Lbs5;->a:Lql3;

    .line 595
    .line 596
    filled-new-array {p0}, [Lql3;

    .line 597
    .line 598
    .line 599
    move-result-object p0

    .line 600
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 601
    .line 602
    .line 603
    return-object v4

    .line 604
    :pswitch_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    sget-object p0, Lbs5;->b:Lql3;

    .line 608
    .line 609
    filled-new-array {p0}, [Lql3;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {p1, v3, v0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 614
    .line 615
    .line 616
    filled-new-array {p0}, [Lql3;

    .line 617
    .line 618
    .line 619
    move-result-object p0

    .line 620
    invoke-virtual {p1, v3, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 621
    .line 622
    .line 623
    sget-object p0, Lbs5;->a:Lql3;

    .line 624
    .line 625
    filled-new-array {p0}, [Lql3;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    invoke-virtual {p1, v3, p0}, Ld97;->c(Ljava/lang/String;[Lql3;)V

    .line 630
    .line 631
    .line 632
    return-object v4

    .line 633
    :pswitch_1c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    sget-object p0, Lbs5;->b:Lql3;

    .line 637
    .line 638
    filled-new-array {p0, p0, p0}, [Lql3;

    .line 639
    .line 640
    .line 641
    move-result-object p0

    .line 642
    const-string v0, "java/util/function/BiConsumer"

    .line 643
    .line 644
    invoke-virtual {p1, v0, p0}, Ld97;->a(Ljava/lang/String;[Lql3;)V

    .line 645
    .line 646
    .line 647
    return-object v4

    .line 648
    nop

    .line 649
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
