.class public final synthetic Lpr2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lgn2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lpr2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lpr2;->Y:Lgn2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Lpr2;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lpr2;->Y:Lgn2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lcc1;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Ldn8;->a:Ldn8;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lvt7;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lvt7;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    sget-object p0, Ldn8;->a:Ldn8;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    new-instance v0, Ltt7;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Ltt7;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object p0, Ldn8;->a:Ldn8;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    new-instance v0, Lst7;

    .line 69
    .line 70
    invoke-direct {v0, p1}, Lst7;-><init>(Z)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object p0, Ldn8;->a:Ldn8;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_4
    check-cast p1, Ljava/lang/Float;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    float-to-int p1, p1

    .line 86
    new-instance v0, Lrt7;

    .line 87
    .line 88
    invoke-direct {v0, p1}, Lrt7;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    sget-object p0, Ldn8;->a:Ldn8;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    new-instance v0, Lnt7;

    .line 104
    .line 105
    invoke-direct {v0, p1}, Lnt7;-><init>(Z)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    sget-object p0, Ldn8;->a:Ldn8;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    new-instance v0, Lgt7;

    .line 121
    .line 122
    invoke-direct {v0, p1}, Lgt7;-><init>(Z)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    sget-object p0, Ldn8;->a:Ldn8;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    new-instance v0, Lht7;

    .line 138
    .line 139
    invoke-direct {v0, p1}, Lht7;-><init>(Z)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    sget-object p0, Ldn8;->a:Ldn8;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    new-instance v0, Lqt7;

    .line 155
    .line 156
    invoke-direct {v0, p1}, Lqt7;-><init>(Z)V

    .line 157
    .line 158
    .line 159
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    sget-object p0, Ldn8;->a:Ldn8;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    new-instance v0, Lut7;

    .line 172
    .line 173
    invoke-direct {v0, p1}, Lut7;-><init>(Z)V

    .line 174
    .line 175
    .line 176
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    sget-object p0, Ldn8;->a:Ldn8;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    new-instance v0, Llt7;

    .line 189
    .line 190
    invoke-direct {v0, p1}, Llt7;-><init>(Z)V

    .line 191
    .line 192
    .line 193
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    sget-object p0, Ldn8;->a:Ldn8;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v0, Lot7;

    .line 205
    .line 206
    invoke-direct {v0, p1}, Lot7;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    sget-object p0, Ldn8;->a:Ldn8;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v0, Lkt7;

    .line 221
    .line 222
    invoke-direct {v0, p1}, Lkt7;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    sget-object p0, Ldn8;->a:Ldn8;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    new-instance v0, Ljt7;

    .line 238
    .line 239
    invoke-direct {v0, p1}, Ljt7;-><init>(Z)V

    .line 240
    .line 241
    .line 242
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    sget-object p0, Ldn8;->a:Ldn8;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    new-instance v0, Lku7;

    .line 255
    .line 256
    invoke-direct {v0, p1}, Lku7;-><init>(Z)V

    .line 257
    .line 258
    .line 259
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    sget-object p0, Ldn8;->a:Ldn8;

    .line 263
    .line 264
    return-object p0

    .line 265
    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    new-instance v0, Lju7;

    .line 272
    .line 273
    invoke-direct {v0, p1}, Lju7;-><init>(Z)V

    .line 274
    .line 275
    .line 276
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    sget-object p0, Ldn8;->a:Ldn8;

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    new-instance v0, Lfr7;

    .line 288
    .line 289
    invoke-direct {v0, p1}, Lfr7;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    sget-object p0, Ldn8;->a:Ldn8;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    new-instance v0, Ler7;

    .line 304
    .line 305
    invoke-direct {v0, p1}, Ler7;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    sget-object p0, Ldn8;->a:Ldn8;

    .line 312
    .line 313
    return-object p0

    .line 314
    :pswitch_12
    check-cast p1, Ljava/lang/Boolean;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    new-instance v0, Ldr7;

    .line 321
    .line 322
    invoke-direct {v0, p1}, Ldr7;-><init>(Z)V

    .line 323
    .line 324
    .line 325
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    sget-object p0, Ldn8;->a:Ldn8;

    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_13
    check-cast p1, Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    new-instance v0, Lbr7;

    .line 338
    .line 339
    invoke-direct {v0, p1}, Lbr7;-><init>(Z)V

    .line 340
    .line 341
    .line 342
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    sget-object p0, Ldn8;->a:Ldn8;

    .line 346
    .line 347
    return-object p0

    .line 348
    :pswitch_14
    check-cast p1, Ljava/lang/Boolean;

    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    new-instance v0, Lcr7;

    .line 355
    .line 356
    invoke-direct {v0, p1}, Lcr7;-><init>(Z)V

    .line 357
    .line 358
    .line 359
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    sget-object p0, Ldn8;->a:Ldn8;

    .line 363
    .line 364
    return-object p0

    .line 365
    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    .line 366
    .line 367
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    new-instance v0, Lxo7;

    .line 372
    .line 373
    invoke-direct {v0, p1}, Lxo7;-><init>(Z)V

    .line 374
    .line 375
    .line 376
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    sget-object p0, Ldn8;->a:Ldn8;

    .line 380
    .line 381
    return-object p0

    .line 382
    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    .line 383
    .line 384
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 385
    .line 386
    .line 387
    move-result p1

    .line 388
    new-instance v0, Lwo7;

    .line 389
    .line 390
    invoke-direct {v0, p1}, Lwo7;-><init>(Z)V

    .line 391
    .line 392
    .line 393
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    sget-object p0, Ldn8;->a:Ldn8;

    .line 397
    .line 398
    return-object p0

    .line 399
    :pswitch_17
    check-cast p1, Ljava/lang/Long;

    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    sget-object p0, Ldn8;->a:Ldn8;

    .line 408
    .line 409
    return-object p0

    .line 410
    :pswitch_18
    check-cast p1, Lid7;

    .line 411
    .line 412
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    check-cast p0, Ldd7;

    .line 417
    .line 418
    sget-object p1, Lkd7;->c:Ljava/lang/Object;

    .line 419
    .line 420
    monitor-enter p1

    .line 421
    :try_start_0
    sget-object v0, Lkd7;->d:Lid7;

    .line 422
    .line 423
    invoke-virtual {p0}, Ldd7;->g()J

    .line 424
    .line 425
    .line 426
    move-result-wide v1

    .line 427
    invoke-virtual {v0, v1, v2}, Lid7;->f(J)Lid7;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    sput-object v0, Lkd7;->d:Lid7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 432
    .line 433
    monitor-exit p1

    .line 434
    return-object p0

    .line 435
    :catchall_0
    move-exception p0

    .line 436
    monitor-exit p1

    .line 437
    throw p0

    .line 438
    :pswitch_19
    check-cast p1, Lye8;

    .line 439
    .line 440
    instance-of v0, p1, Lor2;

    .line 441
    .line 442
    if-eqz v0, :cond_0

    .line 443
    .line 444
    check-cast p1, Lor2;

    .line 445
    .line 446
    iget-object p1, p1, Lor2;->q0:Lnr2;

    .line 447
    .line 448
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    check-cast p0, Ljava/lang/Boolean;

    .line 453
    .line 454
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 455
    .line 456
    .line 457
    move-result p0

    .line 458
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    goto :goto_0

    .line 463
    :cond_0
    const-string p0, "Node is not a GestureNode instance"

    .line 464
    .line 465
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    const/4 p0, 0x0

    .line 469
    :goto_0
    return-object p0

    .line 470
    nop

    .line 471
    :pswitch_data_0
    .packed-switch 0x0
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
