.class public final Ljy2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfu6;Ljava/lang/Object;Lq51;)V
    .locals 1

    const/16 v0, 0x17

    iput-byte v0, p0, Ljy2;->g0:B

    .line 17
    iput-object p1, p0, Ljy2;->j0:Ljava/lang/Object;

    iput-object p2, p0, Ljy2;->i0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 16
    iput-byte p4, p0, Ljy2;->g0:B

    iput-object p1, p0, Ljy2;->i0:Ljava/lang/Object;

    iput-object p2, p0, Ljy2;->j0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 15
    iput-byte p3, p0, Ljy2;->g0:B

    iput-object p1, p0, Ljy2;->j0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(ZLpx2;Ly05;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Ljy2;->g0:B

    .line 3
    .line 4
    iput-boolean p1, p0, Ljy2;->h0:Z

    .line 5
    .line 6
    iput-object p2, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ljy2;->j0:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Ljy2;->g0:B

    .line 2
    .line 3
    sget-object v1, Lc71;->X:Lc71;

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lb71;

    .line 11
    .line 12
    check-cast p2, Lq51;

    .line 13
    .line 14
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljy2;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Lb71;

    .line 26
    .line 27
    check-cast p2, Lq51;

    .line 28
    .line 29
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljy2;

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Lb71;

    .line 41
    .line 42
    check-cast p2, Lq51;

    .line 43
    .line 44
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljy2;

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_2
    check-cast p1, Lb71;

    .line 56
    .line 57
    check-cast p2, Lq51;

    .line 58
    .line 59
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Ljy2;

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :pswitch_3
    check-cast p1, Lb71;

    .line 70
    .line 71
    check-cast p2, Lq51;

    .line 72
    .line 73
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljy2;

    .line 78
    .line 79
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_4
    check-cast p1, Lb71;

    .line 85
    .line 86
    check-cast p2, Lq51;

    .line 87
    .line 88
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Ljy2;

    .line 93
    .line 94
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_5
    check-cast p1, Lb71;

    .line 100
    .line 101
    check-cast p2, Lq51;

    .line 102
    .line 103
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, Ljy2;

    .line 108
    .line 109
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_6
    check-cast p1, Lkk0;

    .line 115
    .line 116
    check-cast p2, Lq51;

    .line 117
    .line 118
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Ljy2;

    .line 123
    .line 124
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :pswitch_7
    check-cast p1, Lb71;

    .line 130
    .line 131
    check-cast p2, Lq51;

    .line 132
    .line 133
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Ljy2;

    .line 138
    .line 139
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :pswitch_8
    check-cast p1, Lb71;

    .line 145
    .line 146
    check-cast p2, Lq51;

    .line 147
    .line 148
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, Ljy2;

    .line 153
    .line 154
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    return-object v1

    .line 158
    :pswitch_9
    check-cast p1, Lb71;

    .line 159
    .line 160
    check-cast p2, Lq51;

    .line 161
    .line 162
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, Ljy2;

    .line 167
    .line 168
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :pswitch_a
    check-cast p1, Lb71;

    .line 174
    .line 175
    check-cast p2, Lq51;

    .line 176
    .line 177
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Ljy2;

    .line 182
    .line 183
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_b
    check-cast p1, Lj2;

    .line 189
    .line 190
    check-cast p2, Lq51;

    .line 191
    .line 192
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, Ljy2;

    .line 197
    .line 198
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_c
    check-cast p1, Lb71;

    .line 204
    .line 205
    check-cast p2, Lq51;

    .line 206
    .line 207
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    check-cast p0, Ljy2;

    .line 212
    .line 213
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_d
    check-cast p1, Lb71;

    .line 219
    .line 220
    check-cast p2, Lq51;

    .line 221
    .line 222
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    check-cast p0, Ljy2;

    .line 227
    .line 228
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_e
    check-cast p1, Lb71;

    .line 234
    .line 235
    check-cast p2, Lq51;

    .line 236
    .line 237
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    check-cast p0, Ljy2;

    .line 242
    .line 243
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    return-object p0

    .line 248
    :pswitch_f
    check-cast p1, Lw35;

    .line 249
    .line 250
    check-cast p2, Lq51;

    .line 251
    .line 252
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    check-cast p0, Ljy2;

    .line 257
    .line 258
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    return-object p0

    .line 263
    :pswitch_10
    check-cast p1, Lb71;

    .line 264
    .line 265
    check-cast p2, Lq51;

    .line 266
    .line 267
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    check-cast p0, Ljy2;

    .line 272
    .line 273
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    return-object v1

    .line 277
    :pswitch_11
    check-cast p1, Lb71;

    .line 278
    .line 279
    check-cast p2, Lq51;

    .line 280
    .line 281
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Ljy2;

    .line 286
    .line 287
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    :pswitch_12
    check-cast p1, Lb71;

    .line 293
    .line 294
    check-cast p2, Lq51;

    .line 295
    .line 296
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    check-cast p0, Ljy2;

    .line 301
    .line 302
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    return-object p0

    .line 307
    :pswitch_13
    check-cast p1, Lb71;

    .line 308
    .line 309
    check-cast p2, Lq51;

    .line 310
    .line 311
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    check-cast p0, Ljy2;

    .line 316
    .line 317
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    return-object p0

    .line 322
    :pswitch_14
    check-cast p1, Lb71;

    .line 323
    .line 324
    check-cast p2, Lq51;

    .line 325
    .line 326
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    check-cast p0, Ljy2;

    .line 331
    .line 332
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    return-object p0

    .line 337
    :pswitch_15
    check-cast p1, Lb71;

    .line 338
    .line 339
    check-cast p2, Lq51;

    .line 340
    .line 341
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    check-cast p0, Ljy2;

    .line 346
    .line 347
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    return-object p0

    .line 352
    :pswitch_16
    check-cast p1, Lb71;

    .line 353
    .line 354
    check-cast p2, Lq51;

    .line 355
    .line 356
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    check-cast p0, Ljy2;

    .line 361
    .line 362
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    return-object p0

    .line 367
    :pswitch_17
    check-cast p1, Lb71;

    .line 368
    .line 369
    check-cast p2, Lq51;

    .line 370
    .line 371
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    check-cast p0, Ljy2;

    .line 376
    .line 377
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    return-object v1

    .line 381
    :pswitch_18
    check-cast p1, Lb71;

    .line 382
    .line 383
    check-cast p2, Lq51;

    .line 384
    .line 385
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    check-cast p0, Ljy2;

    .line 390
    .line 391
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    return-object p0

    .line 396
    :pswitch_19
    check-cast p1, Lb71;

    .line 397
    .line 398
    check-cast p2, Lq51;

    .line 399
    .line 400
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    check-cast p0, Ljy2;

    .line 405
    .line 406
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    return-object p0

    .line 411
    :pswitch_1a
    check-cast p1, Lb71;

    .line 412
    .line 413
    check-cast p2, Lq51;

    .line 414
    .line 415
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    check-cast p0, Ljy2;

    .line 420
    .line 421
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    return-object p0

    .line 426
    :pswitch_1b
    check-cast p1, Lb71;

    .line 427
    .line 428
    check-cast p2, Lq51;

    .line 429
    .line 430
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    check-cast p0, Ljy2;

    .line 435
    .line 436
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    return-object v2

    .line 440
    :pswitch_1c
    check-cast p1, Lb71;

    .line 441
    .line 442
    check-cast p2, Lq51;

    .line 443
    .line 444
    invoke-virtual {p0, p2, p1}, Ljy2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    check-cast p0, Ljy2;

    .line 449
    .line 450
    invoke-virtual {p0, v2}, Ljy2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    return-object p0

    .line 455
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

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Ljy2;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Ljy2;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Ljy2;

    .line 9
    .line 10
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lhu1;

    .line 13
    .line 14
    check-cast v1, Lmy6;

    .line 15
    .line 16
    const/16 v0, 0x1d

    .line 17
    .line 18
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    new-instance p2, Ljy2;

    .line 23
    .line 24
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Li6;

    .line 27
    .line 28
    check-cast v1, Lsu/happ/proxyutility/ui/ScScannerActivity;

    .line 29
    .line 30
    const/16 v0, 0x1c

    .line 31
    .line 32
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :pswitch_1
    new-instance p2, Ljy2;

    .line 37
    .line 38
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lsq6;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    const/16 v0, 0x1b

    .line 45
    .line 46
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 47
    .line 48
    .line 49
    return-object p2

    .line 50
    :pswitch_2
    new-instance p2, Ljy2;

    .line 51
    .line 52
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lr77;

    .line 55
    .line 56
    check-cast v1, Lgn2;

    .line 57
    .line 58
    const/16 v0, 0x1a

    .line 59
    .line 60
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 61
    .line 62
    .line 63
    return-object p2

    .line 64
    :pswitch_3
    new-instance p2, Ljy2;

    .line 65
    .line 66
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Lep6;

    .line 69
    .line 70
    check-cast v1, Ljava/lang/String;

    .line 71
    .line 72
    const/16 v0, 0x19

    .line 73
    .line 74
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 75
    .line 76
    .line 77
    return-object p2

    .line 78
    :pswitch_4
    new-instance p0, Ljy2;

    .line 79
    .line 80
    check-cast v1, Landroidx/compose/material/ripple/RippleNode;

    .line 81
    .line 82
    const/16 v0, 0x18

    .line 83
    .line 84
    invoke-direct {p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_5
    new-instance p2, Ljy2;

    .line 91
    .line 92
    check-cast v1, Lfu6;

    .line 93
    .line 94
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-direct {p2, v1, p0, p1}, Ljy2;-><init>(Lfu6;Ljava/lang/Object;Lq51;)V

    .line 97
    .line 98
    .line 99
    return-object p2

    .line 100
    :pswitch_6
    new-instance p0, Ljy2;

    .line 101
    .line 102
    check-cast v1, Ls16;

    .line 103
    .line 104
    const/16 v0, 0x16

    .line 105
    .line 106
    invoke-direct {p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 107
    .line 108
    .line 109
    iput-object p2, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_7
    new-instance p2, Ljy2;

    .line 113
    .line 114
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Lgw5;

    .line 117
    .line 118
    check-cast v1, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 119
    .line 120
    const/16 v0, 0x15

    .line 121
    .line 122
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 123
    .line 124
    .line 125
    return-object p2

    .line 126
    :pswitch_8
    new-instance p2, Ljy2;

    .line 127
    .line 128
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Lr77;

    .line 131
    .line 132
    check-cast v1, Ldn2;

    .line 133
    .line 134
    const/16 v0, 0x14

    .line 135
    .line 136
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 137
    .line 138
    .line 139
    return-object p2

    .line 140
    :pswitch_9
    new-instance p2, Ljy2;

    .line 141
    .line 142
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Landroid/view/textclassifier/TextClassifier;

    .line 145
    .line 146
    check-cast v1, Lrn2;

    .line 147
    .line 148
    const/16 v0, 0x13

    .line 149
    .line 150
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 151
    .line 152
    .line 153
    return-object p2

    .line 154
    :pswitch_a
    new-instance p2, Ljy2;

    .line 155
    .line 156
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p0, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 159
    .line 160
    check-cast v1, Lcl5;

    .line 161
    .line 162
    const/16 v0, 0x12

    .line 163
    .line 164
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 165
    .line 166
    .line 167
    return-object p2

    .line 168
    :pswitch_b
    new-instance p0, Ljy2;

    .line 169
    .line 170
    check-cast v1, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 171
    .line 172
    const/16 v0, 0x11

    .line 173
    .line 174
    invoke-direct {p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 175
    .line 176
    .line 177
    iput-object p2, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_c
    new-instance p0, Ljy2;

    .line 181
    .line 182
    check-cast v1, Lx90;

    .line 183
    .line 184
    const/16 v0, 0x10

    .line 185
    .line 186
    invoke-direct {p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 187
    .line 188
    .line 189
    iput-object p2, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_d
    new-instance p2, Ljy2;

    .line 193
    .line 194
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p0, Lw55;

    .line 197
    .line 198
    check-cast v1, Lrn2;

    .line 199
    .line 200
    const/16 v0, 0xf

    .line 201
    .line 202
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 203
    .line 204
    .line 205
    return-object p2

    .line 206
    :pswitch_e
    new-instance p2, Ljy2;

    .line 207
    .line 208
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p0, Lv35;

    .line 211
    .line 212
    check-cast v1, Lkv5;

    .line 213
    .line 214
    const/16 v0, 0xe

    .line 215
    .line 216
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 217
    .line 218
    .line 219
    return-object p2

    .line 220
    :pswitch_f
    new-instance p0, Ljy2;

    .line 221
    .line 222
    check-cast v1, Lo35;

    .line 223
    .line 224
    const/16 v0, 0xd

    .line 225
    .line 226
    invoke-direct {p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 227
    .line 228
    .line 229
    iput-object p2, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_10
    new-instance p2, Ljy2;

    .line 233
    .line 234
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p0, Lmh7;

    .line 237
    .line 238
    check-cast v1, Lfy4;

    .line 239
    .line 240
    const/16 v0, 0xc

    .line 241
    .line 242
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 243
    .line 244
    .line 245
    return-object p2

    .line 246
    :pswitch_11
    new-instance p0, Ljy2;

    .line 247
    .line 248
    check-cast v1, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 249
    .line 250
    const/16 p2, 0xb

    .line 251
    .line 252
    invoke-direct {p0, v1, p1, p2}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 253
    .line 254
    .line 255
    return-object p0

    .line 256
    :pswitch_12
    new-instance p2, Ljy2;

    .line 257
    .line 258
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 261
    .line 262
    check-cast v1, Lk83;

    .line 263
    .line 264
    const/16 v0, 0xa

    .line 265
    .line 266
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 267
    .line 268
    .line 269
    return-object p2

    .line 270
    :pswitch_13
    new-instance p2, Ljy2;

    .line 271
    .line 272
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 275
    .line 276
    check-cast v1, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 277
    .line 278
    const/16 v0, 0x9

    .line 279
    .line 280
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 281
    .line 282
    .line 283
    return-object p2

    .line 284
    :pswitch_14
    new-instance p2, Ljy2;

    .line 285
    .line 286
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast p0, Lci4;

    .line 289
    .line 290
    check-cast v1, Ltg4;

    .line 291
    .line 292
    const/16 v0, 0x8

    .line 293
    .line 294
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 295
    .line 296
    .line 297
    return-object p2

    .line 298
    :pswitch_15
    new-instance p2, Ljy2;

    .line 299
    .line 300
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast p0, Lth4;

    .line 303
    .line 304
    check-cast v1, Llf4;

    .line 305
    .line 306
    const/4 v0, 0x7

    .line 307
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 308
    .line 309
    .line 310
    return-object p2

    .line 311
    :pswitch_16
    new-instance p0, Ljy2;

    .line 312
    .line 313
    check-cast v1, Ly05;

    .line 314
    .line 315
    const/4 p2, 0x6

    .line 316
    invoke-direct {p0, v1, p1, p2}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 317
    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_17
    new-instance p2, Ljy2;

    .line 321
    .line 322
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast p0, Lr77;

    .line 325
    .line 326
    check-cast v1, Landroid/app/Activity;

    .line 327
    .line 328
    const/4 v0, 0x5

    .line 329
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 330
    .line 331
    .line 332
    return-object p2

    .line 333
    :pswitch_18
    new-instance p2, Ljy2;

    .line 334
    .line 335
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast p0, Lak3;

    .line 338
    .line 339
    check-cast v1, Lgn2;

    .line 340
    .line 341
    const/4 v0, 0x4

    .line 342
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 343
    .line 344
    .line 345
    return-object p2

    .line 346
    :pswitch_19
    new-instance p2, Ljy2;

    .line 347
    .line 348
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast p0, Lml2;

    .line 351
    .line 352
    check-cast v1, Luh3;

    .line 353
    .line 354
    const/4 v0, 0x3

    .line 355
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 356
    .line 357
    .line 358
    return-object p2

    .line 359
    :pswitch_1a
    new-instance p2, Ljy2;

    .line 360
    .line 361
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast p0, Lza3;

    .line 364
    .line 365
    check-cast v1, Lzo8;

    .line 366
    .line 367
    const/4 v0, 0x2

    .line 368
    invoke-direct {p2, p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 369
    .line 370
    .line 371
    return-object p2

    .line 372
    :pswitch_1b
    new-instance p2, Ljy2;

    .line 373
    .line 374
    iget-boolean v0, p0, Ljy2;->h0:Z

    .line 375
    .line 376
    iget-object p0, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast p0, Lpx2;

    .line 379
    .line 380
    check-cast v1, Ly05;

    .line 381
    .line 382
    invoke-direct {p2, v0, p0, v1, p1}, Ljy2;-><init>(ZLpx2;Ly05;Lq51;)V

    .line 383
    .line 384
    .line 385
    return-object p2

    .line 386
    :pswitch_1c
    new-instance p0, Ljy2;

    .line 387
    .line 388
    check-cast v1, Lky2;

    .line 389
    .line 390
    const/4 v0, 0x0

    .line 391
    invoke-direct {p0, v1, p1, v0}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 392
    .line 393
    .line 394
    iput-object p2, p0, Ljy2;->i0:Ljava/lang/Object;

    .line 395
    .line 396
    return-object p0

    .line 397
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

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, Ljy2;->g0:B

    .line 4
    .line 5
    iget-object v1, v6, Ls51;->Y:Ls61;

    .line 6
    .line 7
    const/4 v2, 0x7

    .line 8
    const/4 v3, 0x6

    .line 9
    const/4 v4, 0x2

    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    const-string v7, "SharedFlow never completes, this call should never return."

    .line 13
    .line 14
    const/4 v8, 0x3

    .line 15
    const/4 v9, 0x0

    .line 16
    sget-object v10, Ldn8;->a:Ldn8;

    .line 17
    .line 18
    const-string v11, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    sget-object v12, Lc71;->X:Lc71;

    .line 21
    .line 22
    iget-object v13, v6, Ljy2;->j0:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v14, 0x1

    .line 25
    const/4 v15, 0x0

    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    if-ne v0, v14, :cond_0

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    move-object v10, v15

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lhu1;

    .line 50
    .line 51
    iget-boolean v1, v0, Lhu1;->b:Z

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    const/high16 v1, -0x40800000    # -1.0f

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 59
    .line 60
    :goto_0
    check-cast v13, Lmy6;

    .line 61
    .line 62
    iget-object v2, v13, Lmy6;->T0:Lsy6;

    .line 63
    .line 64
    iget-wide v3, v0, Lhu1;->a:J

    .line 65
    .line 66
    invoke-static {v1, v3, v4}, Ltu8;->f(FJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 71
    .line 72
    invoke-virtual {v2, v0, v1, v9, v6}, Lsy6;->c(JZLuy7;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-ne v0, v12, :cond_3

    .line 77
    .line 78
    move-object v10, v12

    .line 79
    :cond_3
    :goto_1
    return-object v10

    .line 80
    :pswitch_0
    check-cast v13, Lsu/happ/proxyutility/ui/ScScannerActivity;

    .line 81
    .line 82
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    if-ne v0, v14, :cond_4

    .line 87
    .line 88
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object/from16 v0, p1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v10, v15

    .line 98
    goto :goto_5

    .line 99
    :cond_5
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lkw2;->a:Lkw2;

    .line 103
    .line 104
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Li6;

    .line 107
    .line 108
    iget-object v0, v0, Li6;->Y:Landroid/content/Intent;

    .line 109
    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    const-string v1, "SCAN_RESULT"

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    goto :goto_2

    .line 119
    :cond_6
    move-object v0, v15

    .line 120
    :goto_2
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 121
    .line 122
    invoke-static {v0, v15, v6, v3}, Lkw2;->e(Ljava/lang/String;Ljava/lang/String;Ls51;I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-ne v0, v12, :cond_7

    .line 127
    .line 128
    move-object v10, v12

    .line 129
    goto :goto_5

    .line 130
    :cond_7
    :goto_3
    check-cast v0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 131
    .line 132
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-lez v0, :cond_8

    .line 137
    .line 138
    sget v0, Ly46;->toast_success:I

    .line 139
    .line 140
    invoke-static {v13, v0}, Lx79;->h(Landroid/content/Context;I)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    sget v0, Ly46;->toast_failure:I

    .line 145
    .line 146
    invoke-static {v13, v0}, Lx79;->h(Landroid/content/Context;I)V

    .line 147
    .line 148
    .line 149
    :goto_4
    new-instance v0, Landroid/content/Intent;

    .line 150
    .line 151
    const-class v1, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 152
    .line 153
    invoke-direct {v0, v13, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v13, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 157
    .line 158
    .line 159
    :goto_5
    return-object v10

    .line 160
    :pswitch_1
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Lsq6;

    .line 163
    .line 164
    iget-boolean v1, v6, Ljy2;->h0:Z

    .line 165
    .line 166
    if-eqz v1, :cond_a

    .line 167
    .line 168
    if-ne v1, v14, :cond_9

    .line 169
    .line 170
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_9
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    move-object v10, v15

    .line 178
    goto :goto_8

    .line 179
    :cond_a
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    check-cast v13, Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    new-instance v1, Llq6;

    .line 188
    .line 189
    invoke-direct {v1, v13}, Llq6;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 193
    .line 194
    iget-object v2, v0, Lsq6;->d:Lu77;

    .line 195
    .line 196
    invoke-virtual {v2, v1, v6}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-ne v1, v12, :cond_b

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_b
    move-object v1, v10

    .line 204
    :goto_6
    if-ne v1, v12, :cond_c

    .line 205
    .line 206
    move-object v10, v12

    .line 207
    goto :goto_8

    .line 208
    :cond_c
    :goto_7
    invoke-virtual {v0}, Lsq6;->e()V

    .line 209
    .line 210
    .line 211
    :goto_8
    return-object v10

    .line 212
    :pswitch_2
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 213
    .line 214
    if-eqz v0, :cond_e

    .line 215
    .line 216
    if-eq v0, v14, :cond_d

    .line 217
    .line 218
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    :goto_9
    move-object v12, v15

    .line 222
    goto :goto_b

    .line 223
    :cond_d
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_a

    .line 227
    :cond_e
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Lr77;

    .line 233
    .line 234
    new-instance v1, Lw81;

    .line 235
    .line 236
    check-cast v13, Lgn2;

    .line 237
    .line 238
    invoke-direct {v1, v13, v15, v8}, Lw81;-><init>(Lgn2;Lq51;B)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 245
    .line 246
    invoke-static {v0, v1, v6}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-ne v0, v12, :cond_f

    .line 251
    .line 252
    goto :goto_b

    .line 253
    :cond_f
    :goto_a
    invoke-static {v7}, Lbt;->i(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    goto :goto_9

    .line 257
    :goto_b
    return-object v12

    .line 258
    :pswitch_3
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 259
    .line 260
    if-eqz v0, :cond_11

    .line 261
    .line 262
    if-ne v0, v14, :cond_10

    .line 263
    .line 264
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto :goto_c

    .line 268
    :cond_10
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    move-object v10, v15

    .line 272
    goto :goto_c

    .line 273
    :cond_11
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, Lep6;

    .line 279
    .line 280
    check-cast v13, Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    new-instance v1, Lao6;

    .line 286
    .line 287
    invoke-direct {v1, v13}, Lao6;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 291
    .line 292
    invoke-virtual {v0, v1, v6}, Lep6;->k(Lco6;Luy7;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    if-ne v0, v12, :cond_12

    .line 297
    .line 298
    move-object v10, v12

    .line 299
    :cond_12
    :goto_c
    return-object v10

    .line 300
    :pswitch_4
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 301
    .line 302
    if-eqz v0, :cond_14

    .line 303
    .line 304
    if-ne v0, v14, :cond_13

    .line 305
    .line 306
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    goto :goto_d

    .line 310
    :cond_13
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    move-object v10, v15

    .line 314
    goto :goto_d

    .line 315
    :cond_14
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Lb71;

    .line 321
    .line 322
    check-cast v13, Landroidx/compose/material/ripple/RippleNode;

    .line 323
    .line 324
    iget-object v1, v13, Landroidx/compose/material/ripple/RippleNode;->q0:Lxz4;

    .line 325
    .line 326
    iget-object v1, v1, Lxz4;->a:Lu77;

    .line 327
    .line 328
    new-instance v2, Lte0;

    .line 329
    .line 330
    invoke-direct {v2, v13, v0, v5}, Lte0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 331
    .line 332
    .line 333
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 334
    .line 335
    invoke-virtual {v1, v2, v6}, Lu77;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-object v10, v12

    .line 339
    :goto_d
    return-object v10

    .line 340
    :pswitch_5
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 341
    .line 342
    iget-boolean v1, v6, Ljy2;->h0:Z

    .line 343
    .line 344
    if-eqz v1, :cond_16

    .line 345
    .line 346
    if-ne v1, v14, :cond_15

    .line 347
    .line 348
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    goto :goto_e

    .line 352
    :cond_15
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    move-object v10, v15

    .line 356
    goto :goto_e

    .line 357
    :cond_16
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    check-cast v13, Lfu6;

    .line 364
    .line 365
    iget-object v1, v13, Lfu6;->f0:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v1, Ljy2;

    .line 368
    .line 369
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 370
    .line 371
    invoke-virtual {v1, v0, v6}, Ljy2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    if-ne v0, v12, :cond_17

    .line 376
    .line 377
    move-object v10, v12

    .line 378
    :cond_17
    :goto_e
    return-object v10

    .line 379
    :pswitch_6
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 380
    .line 381
    if-eqz v0, :cond_19

    .line 382
    .line 383
    if-ne v0, v14, :cond_18

    .line 384
    .line 385
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    goto :goto_11

    .line 389
    :cond_18
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    :goto_f
    move-object v10, v15

    .line 393
    goto :goto_11

    .line 394
    :cond_19
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Lkk0;

    .line 400
    .line 401
    check-cast v13, Ls16;

    .line 402
    .line 403
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 404
    .line 405
    instance-of v1, v0, Lve6;

    .line 406
    .line 407
    if-eqz v1, :cond_1b

    .line 408
    .line 409
    check-cast v0, Lve6;

    .line 410
    .line 411
    invoke-virtual {v13, v0, v6}, Ls16;->g(Lve6;Ls51;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    if-ne v0, v12, :cond_1a

    .line 416
    .line 417
    goto :goto_10

    .line 418
    :cond_1a
    move-object v0, v10

    .line 419
    goto :goto_10

    .line 420
    :cond_1b
    instance-of v1, v0, Loe6;

    .line 421
    .line 422
    if-eqz v1, :cond_1c

    .line 423
    .line 424
    check-cast v0, Loe6;

    .line 425
    .line 426
    invoke-virtual {v13, v0, v6}, Ls16;->d(Loe6;Ls51;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    if-ne v0, v12, :cond_1a

    .line 431
    .line 432
    goto :goto_10

    .line 433
    :cond_1c
    instance-of v1, v0, Lqe6;

    .line 434
    .line 435
    if-eqz v1, :cond_1d

    .line 436
    .line 437
    check-cast v0, Lqe6;

    .line 438
    .line 439
    invoke-virtual {v13, v0, v6}, Ls16;->f(Lqe6;Ls51;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    if-ne v0, v12, :cond_1a

    .line 444
    .line 445
    goto :goto_10

    .line 446
    :cond_1d
    instance-of v1, v0, Lpe6;

    .line 447
    .line 448
    if-eqz v1, :cond_1e

    .line 449
    .line 450
    check-cast v0, Lpe6;

    .line 451
    .line 452
    invoke-virtual {v13, v0, v6}, Ls16;->e(Lpe6;Ls51;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    if-ne v0, v12, :cond_1a

    .line 457
    .line 458
    :goto_10
    if-ne v0, v12, :cond_1f

    .line 459
    .line 460
    move-object v10, v12

    .line 461
    goto :goto_11

    .line 462
    :cond_1e
    invoke-static {}, Lb61;->c()V

    .line 463
    .line 464
    .line 465
    goto :goto_f

    .line 466
    :cond_1f
    :goto_11
    return-object v10

    .line 467
    :pswitch_7
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, Lgw5;

    .line 470
    .line 471
    iget-boolean v1, v6, Ljy2;->h0:Z

    .line 472
    .line 473
    if-eqz v1, :cond_21

    .line 474
    .line 475
    if-ne v1, v14, :cond_20

    .line 476
    .line 477
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    goto :goto_12

    .line 481
    :cond_20
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    move-object v10, v15

    .line 485
    goto :goto_12

    .line 486
    :cond_21
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    iget-object v1, v0, Lgw5;->b:Lvz7;

    .line 490
    .line 491
    iget-object v2, v0, Lgw5;->e:Lh76;

    .line 492
    .line 493
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    check-cast v1, Lmn6;

    .line 498
    .line 499
    check-cast v13, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 500
    .line 501
    iget-object v3, v2, Lh76;->X:Loh7;

    .line 502
    .line 503
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    check-cast v3, Lcw5;

    .line 508
    .line 509
    iget-object v3, v3, Lcw5;->b:Ljava/lang/String;

    .line 510
    .line 511
    iget-object v0, v0, Lgw5;->c:Lfn6;

    .line 512
    .line 513
    invoke-static {v0}, Li21;->M(Ljava/lang/Object;)Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    new-array v4, v9, [Lfn6;

    .line 518
    .line 519
    invoke-interface {v0, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    check-cast v0, [Lfn6;

    .line 524
    .line 525
    array-length v4, v0

    .line 526
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    check-cast v0, [Lfn6;

    .line 531
    .line 532
    iget-object v2, v2, Lh76;->X:Loh7;

    .line 533
    .line 534
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    check-cast v2, Lcw5;

    .line 539
    .line 540
    iget-boolean v5, v2, Lcw5;->d:Z

    .line 541
    .line 542
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 543
    .line 544
    const/4 v4, 0x1

    .line 545
    move-object v2, v3

    .line 546
    move-object v3, v0

    .line 547
    move-object v0, v1

    .line 548
    move-object v1, v13

    .line 549
    invoke-virtual/range {v0 .. v6}, Lmn6;->s(Lsu/happ/proxyutility/dto/ProfileRoutingSettings;Ljava/lang/String;[Lfn6;ZZLs51;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    if-ne v0, v12, :cond_22

    .line 554
    .line 555
    move-object v10, v12

    .line 556
    :cond_22
    :goto_12
    return-object v10

    .line 557
    :pswitch_8
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 558
    .line 559
    if-eqz v0, :cond_24

    .line 560
    .line 561
    if-eq v0, v14, :cond_23

    .line 562
    .line 563
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    :goto_13
    move-object v12, v15

    .line 567
    goto :goto_15

    .line 568
    :cond_23
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    goto :goto_14

    .line 572
    :cond_24
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v0, Lr77;

    .line 578
    .line 579
    new-instance v1, Lpg3;

    .line 580
    .line 581
    check-cast v13, Ldn2;

    .line 582
    .line 583
    invoke-direct {v1, v13, v15, v14}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 590
    .line 591
    invoke-static {v0, v1, v6}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    if-ne v0, v12, :cond_25

    .line 596
    .line 597
    goto :goto_15

    .line 598
    :cond_25
    :goto_14
    invoke-static {v7}, Lbt;->i(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    goto :goto_13

    .line 602
    :goto_15
    return-object v12

    .line 603
    :pswitch_9
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 604
    .line 605
    if-eqz v0, :cond_27

    .line 606
    .line 607
    if-ne v0, v14, :cond_26

    .line 608
    .line 609
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    move-object/from16 v15, p1

    .line 613
    .line 614
    goto :goto_16

    .line 615
    :cond_26
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    goto :goto_16

    .line 619
    :cond_27
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v0, Landroid/view/textclassifier/TextClassifier;

    .line 625
    .line 626
    if-eqz v0, :cond_29

    .line 627
    .line 628
    check-cast v13, Lrn2;

    .line 629
    .line 630
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 631
    .line 632
    invoke-interface {v13, v0, v6}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    if-ne v0, v12, :cond_28

    .line 637
    .line 638
    move-object v15, v12

    .line 639
    goto :goto_16

    .line 640
    :cond_28
    move-object v15, v0

    .line 641
    :cond_29
    :goto_16
    return-object v15

    .line 642
    :pswitch_a
    check-cast v13, Lcl5;

    .line 643
    .line 644
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 645
    .line 646
    if-eqz v0, :cond_2b

    .line 647
    .line 648
    if-ne v0, v14, :cond_2a

    .line 649
    .line 650
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    move-object/from16 v0, p1

    .line 654
    .line 655
    goto :goto_17

    .line 656
    :cond_2a
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    move-object v10, v15

    .line 660
    goto/16 :goto_19

    .line 661
    .line 662
    :cond_2b
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    sget-object v0, Lx06;->a:Lvz7;

    .line 666
    .line 667
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 670
    .line 671
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 672
    .line 673
    sget-object v1, Ltp1;->a:Lnf1;

    .line 674
    .line 675
    sget-object v1, Lye1;->Z:Lye1;

    .line 676
    .line 677
    new-instance v2, Ll40;

    .line 678
    .line 679
    invoke-direct {v2, v0, v15, v5}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 680
    .line 681
    .line 682
    invoke-static {v1, v2, v6}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    if-ne v0, v12, :cond_2c

    .line 687
    .line 688
    move-object v10, v12

    .line 689
    goto :goto_19

    .line 690
    :cond_2c
    :goto_17
    check-cast v0, Ljava/lang/Iterable;

    .line 691
    .line 692
    sget-object v1, Lec7;->Y:Lec7;

    .line 693
    .line 694
    invoke-virtual {v1}, Lec7;->c()Lqm5;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    if-eqz v2, :cond_2d

    .line 707
    .line 708
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    check-cast v2, Lsu/happ/proxyutility/dto/AppInfo;

    .line 713
    .line 714
    iget-object v3, v13, Lcl5;->g:Lh76;

    .line 715
    .line 716
    iget-object v3, v3, Lh76;->X:Loh7;

    .line 717
    .line 718
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v3

    .line 722
    check-cast v3, Llk5;

    .line 723
    .line 724
    iget-object v3, v3, Llk5;->d:Lkm5;

    .line 725
    .line 726
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v4

    .line 730
    iget-object v3, v3, Lkm5;->Z:Lll5;

    .line 731
    .line 732
    invoke-virtual {v3, v4}, Lll5;->containsKey(Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    move-result v3

    .line 736
    invoke-static {v2, v3}, Lsu/happ/proxyutility/dto/AppInfo;->a(Lsu/happ/proxyutility/dto/AppInfo;I)Lsu/happ/proxyutility/dto/AppInfo;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    invoke-virtual {v1, v2}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    goto :goto_18

    .line 744
    :cond_2d
    invoke-virtual {v1}, Lqm5;->c()Lj2;

    .line 745
    .line 746
    .line 747
    move-result-object v17

    .line 748
    iget-object v0, v13, Lcl5;->f:Loh7;

    .line 749
    .line 750
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    :cond_2e
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    move-object v14, v1

    .line 758
    check-cast v14, Llk5;

    .line 759
    .line 760
    const/16 v20, 0x0

    .line 761
    .line 762
    const/16 v21, 0x3b

    .line 763
    .line 764
    const/4 v15, 0x0

    .line 765
    const/16 v16, 0x0

    .line 766
    .line 767
    const/16 v18, 0x0

    .line 768
    .line 769
    const/16 v19, 0x0

    .line 770
    .line 771
    invoke-static/range {v14 .. v21}, Llk5;->a(Llk5;Ljk5;Ljava/lang/String;Lj2;Lkm5;Lj2;ZI)Llk5;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v1

    .line 779
    if-eqz v1, :cond_2e

    .line 780
    .line 781
    :goto_19
    return-object v10

    .line 782
    :pswitch_b
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v0, Lj2;

    .line 785
    .line 786
    iget-boolean v1, v6, Ljy2;->h0:Z

    .line 787
    .line 788
    if-eqz v1, :cond_30

    .line 789
    .line 790
    if-ne v1, v14, :cond_2f

    .line 791
    .line 792
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    goto :goto_1a

    .line 796
    :cond_2f
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    move-object v10, v15

    .line 800
    goto :goto_1a

    .line 801
    :cond_30
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    sget-object v1, Ltp1;->a:Lnf1;

    .line 805
    .line 806
    sget-object v1, Ldm4;->a:Lhv2;

    .line 807
    .line 808
    new-instance v2, Lk;

    .line 809
    .line 810
    check-cast v13, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 811
    .line 812
    const/16 v3, 0x16

    .line 813
    .line 814
    invoke-direct {v2, v13, v0, v15, v3}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 815
    .line 816
    .line 817
    iput-object v15, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 818
    .line 819
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 820
    .line 821
    invoke-static {v1, v2, v6}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    if-ne v0, v12, :cond_31

    .line 826
    .line 827
    move-object v10, v12

    .line 828
    :cond_31
    :goto_1a
    return-object v10

    .line 829
    :pswitch_c
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 830
    .line 831
    if-eqz v0, :cond_33

    .line 832
    .line 833
    if-ne v0, v14, :cond_32

    .line 834
    .line 835
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 836
    .line 837
    move-object v1, v0

    .line 838
    check-cast v1, Lbm3;

    .line 839
    .line 840
    :try_start_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 841
    .line 842
    .line 843
    move-object/from16 v0, p1

    .line 844
    .line 845
    goto :goto_1b

    .line 846
    :catchall_0
    move-exception v0

    .line 847
    goto :goto_1d

    .line 848
    :cond_32
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    move-object v12, v15

    .line 852
    goto :goto_1c

    .line 853
    :cond_33
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast v0, Lb71;

    .line 859
    .line 860
    new-instance v1, Lr5;

    .line 861
    .line 862
    invoke-direct {v1, v4, v15}, Lr5;-><init>(ILq51;)V

    .line 863
    .line 864
    .line 865
    invoke-static {v0, v15, v15, v1, v8}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    :try_start_1
    check-cast v13, Lx90;

    .line 870
    .line 871
    iput-object v1, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 872
    .line 873
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 874
    .line 875
    invoke-virtual {v13, v6}, Lx90;->r(Lq51;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 879
    if-ne v0, v12, :cond_34

    .line 880
    .line 881
    goto :goto_1c

    .line 882
    :cond_34
    :goto_1b
    invoke-interface {v1, v15}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 883
    .line 884
    .line 885
    move-object v12, v0

    .line 886
    :goto_1c
    return-object v12

    .line 887
    :goto_1d
    invoke-interface {v1, v15}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 888
    .line 889
    .line 890
    throw v0

    .line 891
    :pswitch_d
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 892
    .line 893
    if-eqz v0, :cond_36

    .line 894
    .line 895
    if-ne v0, v14, :cond_35

    .line 896
    .line 897
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    goto :goto_1e

    .line 901
    :cond_35
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    move-object v10, v15

    .line 905
    goto :goto_1e

    .line 906
    :cond_36
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast v0, Lw55;

    .line 912
    .line 913
    iget-object v0, v0, Lw55;->a:Lsy6;

    .line 914
    .line 915
    check-cast v13, Lrn2;

    .line 916
    .line 917
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 918
    .line 919
    sget-object v1, Lf15;->Y:Lf15;

    .line 920
    .line 921
    invoke-virtual {v0, v1, v13, v6}, Lsy6;->g(Lf15;Lrn2;Ls51;)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    if-ne v0, v12, :cond_37

    .line 926
    .line 927
    move-object v10, v12

    .line 928
    :cond_37
    :goto_1e
    return-object v10

    .line 929
    :pswitch_e
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 930
    .line 931
    if-eqz v0, :cond_39

    .line 932
    .line 933
    if-ne v0, v14, :cond_38

    .line 934
    .line 935
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 936
    .line 937
    .line 938
    goto :goto_1f

    .line 939
    :cond_38
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    move-object v10, v15

    .line 943
    goto :goto_20

    .line 944
    :cond_39
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 945
    .line 946
    .line 947
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 948
    .line 949
    const-wide/16 v0, 0x3e8

    .line 950
    .line 951
    invoke-static {v0, v1, v6}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    if-ne v0, v12, :cond_3a

    .line 956
    .line 957
    move-object v10, v12

    .line 958
    goto :goto_20

    .line 959
    :cond_3a
    :goto_1f
    invoke-static {}, Llh4;->P0()Llh4;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    sget v1, Lk39;->a:I

    .line 964
    .line 965
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    check-cast v13, Lkv5;

    .line 969
    .line 970
    new-instance v0, Lw31;

    .line 971
    .line 972
    invoke-direct {v0, v2}, Lw31;-><init>(I)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {v13, v0}, Lkv5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    :goto_20
    return-object v10

    .line 979
    :pswitch_f
    check-cast v13, Lo35;

    .line 980
    .line 981
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast v0, Lw35;

    .line 984
    .line 985
    iget-boolean v1, v6, Ljy2;->h0:Z

    .line 986
    .line 987
    if-eqz v1, :cond_3c

    .line 988
    .line 989
    if-ne v1, v14, :cond_3b

    .line 990
    .line 991
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 992
    .line 993
    .line 994
    move-object/from16 v1, p1

    .line 995
    .line 996
    goto :goto_22

    .line 997
    :cond_3b
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 998
    .line 999
    .line 1000
    :goto_21
    move-object v12, v15

    .line 1001
    goto :goto_23

    .line 1002
    :cond_3c
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    iget-object v1, v0, Lw35;->e:Lpe7;

    .line 1006
    .line 1007
    if-eqz v1, :cond_3e

    .line 1008
    .line 1009
    iput-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1010
    .line 1011
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1012
    .line 1013
    invoke-virtual {v13, v1, v6}, Lo35;->h(Lpe7;Ls51;)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    if-ne v1, v12, :cond_3d

    .line 1018
    .line 1019
    goto :goto_23

    .line 1020
    :cond_3d
    :goto_22
    check-cast v1, Ld73;

    .line 1021
    .line 1022
    iget-object v2, v13, Lo35;->a:Ljava/lang/String;

    .line 1023
    .line 1024
    iget-object v0, v0, Lw35;->d:Lq35;

    .line 1025
    .line 1026
    invoke-virtual {v0}, Lq35;->a()Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    invoke-static {v2, v0}, Lo35;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    new-instance v12, Lle7;

    .line 1035
    .line 1036
    sget-object v2, Lma1;->f0:Lma1;

    .line 1037
    .line 1038
    invoke-direct {v12, v1, v0, v2}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_23

    .line 1042
    :cond_3e
    const-string v0, "body == null"

    .line 1043
    .line 1044
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 1045
    .line 1046
    .line 1047
    goto :goto_21

    .line 1048
    :goto_23
    return-object v12

    .line 1049
    :pswitch_10
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 1050
    .line 1051
    if-eqz v0, :cond_40

    .line 1052
    .line 1053
    if-eq v0, v14, :cond_3f

    .line 1054
    .line 1055
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    :goto_24
    move-object v12, v15

    .line 1059
    goto :goto_26

    .line 1060
    :cond_3f
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1061
    .line 1062
    .line 1063
    goto :goto_25

    .line 1064
    :cond_40
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1065
    .line 1066
    .line 1067
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast v0, Lmh7;

    .line 1070
    .line 1071
    new-instance v1, Lmh;

    .line 1072
    .line 1073
    check-cast v13, Lfy4;

    .line 1074
    .line 1075
    const/4 v2, 0x5

    .line 1076
    invoke-direct {v1, v13, v2}, Lmh;-><init>(Ljava/lang/Object;B)V

    .line 1077
    .line 1078
    .line 1079
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1080
    .line 1081
    invoke-interface {v0, v1, v6}, Lxe2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    if-ne v0, v12, :cond_41

    .line 1086
    .line 1087
    goto :goto_26

    .line 1088
    :cond_41
    :goto_25
    invoke-static {}, Lb61;->n()V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_24

    .line 1092
    :goto_26
    return-object v12

    .line 1093
    :pswitch_11
    check-cast v13, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 1094
    .line 1095
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 1096
    .line 1097
    if-eqz v0, :cond_43

    .line 1098
    .line 1099
    if-ne v0, v14, :cond_42

    .line 1100
    .line 1101
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 1104
    .line 1105
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1106
    .line 1107
    .line 1108
    move-object/from16 v1, p1

    .line 1109
    .line 1110
    goto :goto_27

    .line 1111
    :cond_42
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    move-object v10, v15

    .line 1115
    goto :goto_28

    .line 1116
    :cond_43
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v13}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    iget-object v1, v13, Lsu/happ/proxyutility/feature/main/MainActivity;->Z0:Lx90;

    .line 1124
    .line 1125
    iput-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1126
    .line 1127
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1128
    .line 1129
    invoke-virtual {v1, v6}, Lx90;->r(Lq51;)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    if-ne v1, v12, :cond_44

    .line 1134
    .line 1135
    move-object v10, v12

    .line 1136
    goto :goto_28

    .line 1137
    :cond_44
    :goto_27
    check-cast v1, Ljava/lang/String;

    .line 1138
    .line 1139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->S(Ljava/lang/String;)V

    .line 1143
    .line 1144
    .line 1145
    :goto_28
    return-object v10

    .line 1146
    :pswitch_12
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1147
    .line 1148
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 1149
    .line 1150
    iget-boolean v1, v6, Ljy2;->h0:Z

    .line 1151
    .line 1152
    if-eqz v1, :cond_46

    .line 1153
    .line 1154
    if-ne v1, v14, :cond_45

    .line 1155
    .line 1156
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1157
    .line 1158
    .line 1159
    move-object/from16 v1, p1

    .line 1160
    .line 1161
    goto :goto_29

    .line 1162
    :cond_45
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    move-object v10, v15

    .line 1166
    goto/16 :goto_2c

    .line 1167
    .line 1168
    :cond_46
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    iget-object v1, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->I:Lxe2;

    .line 1176
    .line 1177
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1178
    .line 1179
    invoke-static {v1, v6}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v1

    .line 1183
    if-ne v1, v12, :cond_47

    .line 1184
    .line 1185
    move-object v10, v12

    .line 1186
    goto/16 :goto_2c

    .line 1187
    .line 1188
    :cond_47
    :goto_29
    check-cast v1, Ljava/lang/Boolean;

    .line 1189
    .line 1190
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v1

    .line 1194
    if-nez v1, :cond_48

    .line 1195
    .line 1196
    sget v1, Lt46;->dialog_alert_warning:I

    .line 1197
    .line 1198
    sget v2, Ly46;->toast_failure:I

    .line 1199
    .line 1200
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v17

    .line 1204
    sget v2, Ly46;->send_to_tv_err_no_subs:I

    .line 1205
    .line 1206
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v18

    .line 1210
    const v2, 0x104000a

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v20

    .line 1217
    new-instance v2, Ljava/lang/Integer;

    .line 1218
    .line 1219
    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 1220
    .line 1221
    .line 1222
    const/16 v24, 0x0

    .line 1223
    .line 1224
    const/16 v25, 0x752

    .line 1225
    .line 1226
    const/16 v19, 0x0

    .line 1227
    .line 1228
    const/16 v21, 0x0

    .line 1229
    .line 1230
    const/16 v23, 0x0

    .line 1231
    .line 1232
    move-object/from16 v16, v0

    .line 1233
    .line 1234
    move-object/from16 v22, v2

    .line 1235
    .line 1236
    invoke-static/range {v16 .. v25}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 1237
    .line 1238
    .line 1239
    goto/16 :goto_2c

    .line 1240
    .line 1241
    :cond_48
    move-object/from16 v16, v0

    .line 1242
    .line 1243
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v1

    .line 1247
    check-cast v13, Lk83;

    .line 1248
    .line 1249
    iget-object v2, v13, Lk83;->a:Ljava/lang/String;

    .line 1250
    .line 1251
    invoke-virtual/range {v16 .. v16}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    iget-object v0, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->H:Lh76;

    .line 1256
    .line 1257
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 1258
    .line 1259
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    check-cast v0, Ljava/util/List;

    .line 1264
    .line 1265
    if-nez v0, :cond_49

    .line 1266
    .line 1267
    sget-object v0, Ld02;->X:Ld02;

    .line 1268
    .line 1269
    :cond_49
    move-object v3, v0

    .line 1270
    sget v0, Le46;->fragment_container_view:I

    .line 1271
    .line 1272
    new-instance v4, Ljava/lang/Integer;

    .line 1273
    .line 1274
    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 1275
    .line 1276
    .line 1277
    :try_start_2
    new-instance v0, Lcom/google/gson/a;

    .line 1278
    .line 1279
    invoke-direct {v0}, Lcom/google/gson/a;-><init>()V

    .line 1280
    .line 1281
    .line 1282
    const-class v6, Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 1283
    .line 1284
    new-instance v7, Lyi8;

    .line 1285
    .line 1286
    invoke-direct {v7, v6}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v0, v2, v7}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    check-cast v0, Lsu/happ/proxyutility/dto/SocketServerInfo;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1294
    .line 1295
    goto :goto_2a

    .line 1296
    :catchall_1
    move-exception v0

    .line 1297
    instance-of v6, v0, Ljava/lang/InterruptedException;

    .line 1298
    .line 1299
    if-nez v6, :cond_4d

    .line 1300
    .line 1301
    instance-of v6, v0, Ljava/util/concurrent/CancellationException;

    .line 1302
    .line 1303
    if-nez v6, :cond_4d

    .line 1304
    .line 1305
    new-instance v6, Lrj6;

    .line 1306
    .line 1307
    invoke-direct {v6, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 1308
    .line 1309
    .line 1310
    move-object v0, v6

    .line 1311
    :goto_2a
    nop

    .line 1312
    instance-of v6, v0, Lrj6;

    .line 1313
    .line 1314
    if-eqz v6, :cond_4a

    .line 1315
    .line 1316
    move-object v0, v15

    .line 1317
    :cond_4a
    if-eqz v0, :cond_4c

    .line 1318
    .line 1319
    new-instance v0, Leo1;

    .line 1320
    .line 1321
    invoke-direct {v0}, Leo1;-><init>()V

    .line 1322
    .line 1323
    .line 1324
    new-instance v6, Landroid/os/Bundle;

    .line 1325
    .line 1326
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1327
    .line 1328
    .line 1329
    sget-object v7, Lyw2;->b:Lcom/google/gson/a;

    .line 1330
    .line 1331
    new-instance v8, Ljava/util/ArrayList;

    .line 1332
    .line 1333
    invoke-static {v3, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 1334
    .line 1335
    .line 1336
    move-result v5

    .line 1337
    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1338
    .line 1339
    .line 1340
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v3

    .line 1344
    :goto_2b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1345
    .line 1346
    .line 1347
    move-result v5

    .line 1348
    if-eqz v5, :cond_4b

    .line 1349
    .line 1350
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v5

    .line 1354
    invoke-virtual {v7, v5}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v5

    .line 1358
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1359
    .line 1360
    .line 1361
    goto :goto_2b

    .line 1362
    :cond_4b
    new-array v3, v9, [Ljava/lang/String;

    .line 1363
    .line 1364
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v3

    .line 1368
    check-cast v3, [Ljava/lang/String;

    .line 1369
    .line 1370
    const-string v5, "config_list"

    .line 1371
    .line 1372
    invoke-virtual {v6, v5, v3}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 1373
    .line 1374
    .line 1375
    const-string v3, "socket_server_info"

    .line 1376
    .line 1377
    invoke-virtual {v6, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v0, v6}, Lqk2;->Q(Landroid/os/Bundle;)V

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v0}, Lsn1;->V()V

    .line 1384
    .line 1385
    .line 1386
    new-instance v2, Lr00;

    .line 1387
    .line 1388
    invoke-direct {v2, v1}, Lr00;-><init>(Lml2;)V

    .line 1389
    .line 1390
    .line 1391
    iput-boolean v14, v2, Lr00;->o:Z

    .line 1392
    .line 1393
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1394
    .line 1395
    .line 1396
    move-result v1

    .line 1397
    invoke-virtual {v2, v1, v0, v15, v14}, Lr00;->g(ILqk2;Ljava/lang/String;I)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v2}, Lr00;->e()V

    .line 1401
    .line 1402
    .line 1403
    :cond_4c
    :goto_2c
    return-object v10

    .line 1404
    :cond_4d
    throw v0

    .line 1405
    :pswitch_13
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1406
    .line 1407
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 1408
    .line 1409
    iget-boolean v1, v6, Ljy2;->h0:Z

    .line 1410
    .line 1411
    if-eqz v1, :cond_4f

    .line 1412
    .line 1413
    if-ne v1, v14, :cond_4e

    .line 1414
    .line 1415
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1416
    .line 1417
    .line 1418
    move-object/from16 v1, p1

    .line 1419
    .line 1420
    goto :goto_2e

    .line 1421
    :cond_4e
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1422
    .line 1423
    .line 1424
    :goto_2d
    move-object v10, v15

    .line 1425
    goto/16 :goto_37

    .line 1426
    .line 1427
    :cond_4f
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v1

    .line 1434
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1435
    .line 1436
    iget-object v1, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->H:Lh76;

    .line 1437
    .line 1438
    new-instance v2, Lo;

    .line 1439
    .line 1440
    const/16 v5, 0xe

    .line 1441
    .line 1442
    invoke-direct {v2, v1, v5}, Lo;-><init>(Lxe2;B)V

    .line 1443
    .line 1444
    .line 1445
    new-instance v1, Lj31;

    .line 1446
    .line 1447
    invoke-direct {v1, v2, v3}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 1448
    .line 1449
    .line 1450
    invoke-static {v1, v6}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v1

    .line 1454
    if-ne v1, v12, :cond_50

    .line 1455
    .line 1456
    move-object v10, v12

    .line 1457
    goto/16 :goto_37

    .line 1458
    .line 1459
    :cond_50
    :goto_2e
    check-cast v1, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 1460
    .line 1461
    if-eqz v1, :cond_60

    .line 1462
    .line 1463
    check-cast v13, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 1464
    .line 1465
    sget-object v2, Lek4;->a:[I

    .line 1466
    .line 1467
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 1468
    .line 1469
    .line 1470
    move-result v3

    .line 1471
    aget v2, v2, v3

    .line 1472
    .line 1473
    if-eq v2, v14, :cond_5f

    .line 1474
    .line 1475
    const-wide/16 v5, -0x1

    .line 1476
    .line 1477
    if-eq v2, v4, :cond_55

    .line 1478
    .line 1479
    if-ne v2, v8, :cond_54

    .line 1480
    .line 1481
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v2

    .line 1485
    new-instance v3, Ljava/util/ArrayList;

    .line 1486
    .line 1487
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1488
    .line 1489
    .line 1490
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v2

    .line 1494
    :cond_51
    :goto_2f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1495
    .line 1496
    .line 1497
    move-result v4

    .line 1498
    if-eqz v4, :cond_53

    .line 1499
    .line 1500
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v4

    .line 1504
    move-object v7, v4

    .line 1505
    check-cast v7, Lsu/happ/proxyutility/dto/ServerCache;

    .line 1506
    .line 1507
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v8

    .line 1511
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v7

    .line 1515
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->o()Lun5;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v8

    .line 1522
    invoke-virtual {v8, v7}, Lun5;->c(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerAffiliationInfo;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v7

    .line 1526
    if-eqz v7, :cond_52

    .line 1527
    .line 1528
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerAffiliationInfo;->b()Ljava/lang/Long;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v7

    .line 1532
    if-eqz v7, :cond_52

    .line 1533
    .line 1534
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 1535
    .line 1536
    .line 1537
    move-result-wide v8

    .line 1538
    cmp-long v8, v8, v5

    .line 1539
    .line 1540
    if-eqz v8, :cond_52

    .line 1541
    .line 1542
    goto :goto_30

    .line 1543
    :cond_52
    move-object v7, v15

    .line 1544
    :goto_30
    if-eqz v7, :cond_51

    .line 1545
    .line 1546
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1547
    .line 1548
    .line 1549
    goto :goto_2f

    .line 1550
    :cond_53
    invoke-static {v3}, Lwv0;->a1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v2

    .line 1554
    invoke-static {v2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 1555
    .line 1556
    .line 1557
    invoke-static {v2}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v2

    .line 1561
    check-cast v2, Lsu/happ/proxyutility/dto/ServerCache;

    .line 1562
    .line 1563
    if-nez v2, :cond_5d

    .line 1564
    .line 1565
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v1

    .line 1569
    invoke-static {v1}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v1

    .line 1573
    move-object v2, v1

    .line 1574
    check-cast v2, Lsu/happ/proxyutility/dto/ServerCache;

    .line 1575
    .line 1576
    goto/16 :goto_36

    .line 1577
    .line 1578
    :cond_54
    invoke-static {}, Lb61;->c()V

    .line 1579
    .line 1580
    .line 1581
    goto/16 :goto_2d

    .line 1582
    .line 1583
    :cond_55
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v1

    .line 1587
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v1

    .line 1591
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v2

    .line 1595
    if-eqz v2, :cond_5e

    .line 1596
    .line 1597
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v2

    .line 1601
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1602
    .line 1603
    .line 1604
    move-result v3

    .line 1605
    if-nez v3, :cond_56

    .line 1606
    .line 1607
    goto/16 :goto_35

    .line 1608
    .line 1609
    :cond_56
    move-object v3, v2

    .line 1610
    check-cast v3, Lsu/happ/proxyutility/dto/ServerCache;

    .line 1611
    .line 1612
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v4

    .line 1616
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v3

    .line 1620
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v4}, Lsu/happ/proxyutility/feature/main/MainViewModel;->o()Lun5;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v4

    .line 1627
    invoke-virtual {v4, v3}, Lun5;->c(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerAffiliationInfo;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v3

    .line 1631
    const-wide v7, 0x7fffffffffffffffL

    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    if-eqz v3, :cond_58

    .line 1637
    .line 1638
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ServerAffiliationInfo;->b()Ljava/lang/Long;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v3

    .line 1642
    if-eqz v3, :cond_58

    .line 1643
    .line 1644
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 1645
    .line 1646
    .line 1647
    move-result-wide v11

    .line 1648
    cmp-long v4, v11, v5

    .line 1649
    .line 1650
    if-eqz v4, :cond_57

    .line 1651
    .line 1652
    goto :goto_31

    .line 1653
    :cond_57
    move-object v3, v15

    .line 1654
    :goto_31
    if-eqz v3, :cond_58

    .line 1655
    .line 1656
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1657
    .line 1658
    .line 1659
    move-result-wide v3

    .line 1660
    goto :goto_32

    .line 1661
    :cond_58
    move-wide v3, v7

    .line 1662
    :cond_59
    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v9

    .line 1666
    move-object v11, v9

    .line 1667
    check-cast v11, Lsu/happ/proxyutility/dto/ServerCache;

    .line 1668
    .line 1669
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v12

    .line 1673
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v11

    .line 1677
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v12}, Lsu/happ/proxyutility/feature/main/MainViewModel;->o()Lun5;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v12

    .line 1684
    invoke-virtual {v12, v11}, Lun5;->c(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerAffiliationInfo;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v11

    .line 1688
    if-eqz v11, :cond_5b

    .line 1689
    .line 1690
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ServerAffiliationInfo;->b()Ljava/lang/Long;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v11

    .line 1694
    if-eqz v11, :cond_5b

    .line 1695
    .line 1696
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 1697
    .line 1698
    .line 1699
    move-result-wide v12

    .line 1700
    cmp-long v12, v12, v5

    .line 1701
    .line 1702
    if-eqz v12, :cond_5a

    .line 1703
    .line 1704
    goto :goto_33

    .line 1705
    :cond_5a
    move-object v11, v15

    .line 1706
    :goto_33
    if-eqz v11, :cond_5b

    .line 1707
    .line 1708
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 1709
    .line 1710
    .line 1711
    move-result-wide v11

    .line 1712
    goto :goto_34

    .line 1713
    :cond_5b
    move-wide v11, v7

    .line 1714
    :goto_34
    cmp-long v13, v3, v11

    .line 1715
    .line 1716
    if-lez v13, :cond_5c

    .line 1717
    .line 1718
    move-object v2, v9

    .line 1719
    move-wide v3, v11

    .line 1720
    :cond_5c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1721
    .line 1722
    .line 1723
    move-result v9

    .line 1724
    if-nez v9, :cond_59

    .line 1725
    .line 1726
    :goto_35
    check-cast v2, Lsu/happ/proxyutility/dto/ServerCache;

    .line 1727
    .line 1728
    :cond_5d
    :goto_36
    sget v1, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 1729
    .line 1730
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/feature/main/MainActivity;->B(Lsu/happ/proxyutility/dto/ServerCache;)V

    .line 1731
    .line 1732
    .line 1733
    goto :goto_37

    .line 1734
    :cond_5e
    invoke-static {}, Lbt;->n()V

    .line 1735
    .line 1736
    .line 1737
    goto/16 :goto_2d

    .line 1738
    .line 1739
    :cond_5f
    const-string v0, "Last used is unreachable"

    .line 1740
    .line 1741
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 1742
    .line 1743
    .line 1744
    goto/16 :goto_2d

    .line 1745
    .line 1746
    :cond_60
    :goto_37
    return-object v10

    .line 1747
    :pswitch_14
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 1748
    .line 1749
    if-eqz v0, :cond_62

    .line 1750
    .line 1751
    if-ne v0, v14, :cond_61

    .line 1752
    .line 1753
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1754
    .line 1755
    .line 1756
    goto :goto_39

    .line 1757
    :cond_61
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1758
    .line 1759
    .line 1760
    move-object v10, v15

    .line 1761
    goto :goto_39

    .line 1762
    :cond_62
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1763
    .line 1764
    .line 1765
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1766
    .line 1767
    check-cast v0, Lci4;

    .line 1768
    .line 1769
    check-cast v13, Ltg4;

    .line 1770
    .line 1771
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1772
    .line 1773
    iget-object v0, v0, Lci4;->e:Lu77;

    .line 1774
    .line 1775
    invoke-virtual {v0, v13, v6}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v0

    .line 1779
    if-ne v0, v12, :cond_63

    .line 1780
    .line 1781
    goto :goto_38

    .line 1782
    :cond_63
    move-object v0, v10

    .line 1783
    :goto_38
    if-ne v0, v12, :cond_64

    .line 1784
    .line 1785
    move-object v10, v12

    .line 1786
    :cond_64
    :goto_39
    return-object v10

    .line 1787
    :pswitch_15
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 1788
    .line 1789
    if-eqz v0, :cond_66

    .line 1790
    .line 1791
    if-ne v0, v14, :cond_65

    .line 1792
    .line 1793
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1794
    .line 1795
    .line 1796
    goto :goto_3b

    .line 1797
    :cond_65
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1798
    .line 1799
    .line 1800
    move-object v10, v15

    .line 1801
    goto :goto_3b

    .line 1802
    :cond_66
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1803
    .line 1804
    .line 1805
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1806
    .line 1807
    check-cast v0, Lth4;

    .line 1808
    .line 1809
    check-cast v13, Llf4;

    .line 1810
    .line 1811
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1812
    .line 1813
    .line 1814
    new-instance v1, Lvf4;

    .line 1815
    .line 1816
    invoke-direct {v1, v13}, Lvf4;-><init>(Llf4;)V

    .line 1817
    .line 1818
    .line 1819
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1820
    .line 1821
    iget-object v0, v0, Lth4;->f:Lu77;

    .line 1822
    .line 1823
    invoke-virtual {v0, v1, v6}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v0

    .line 1827
    if-ne v0, v12, :cond_67

    .line 1828
    .line 1829
    goto :goto_3a

    .line 1830
    :cond_67
    move-object v0, v10

    .line 1831
    :goto_3a
    if-ne v0, v12, :cond_68

    .line 1832
    .line 1833
    move-object v10, v12

    .line 1834
    :cond_68
    :goto_3b
    return-object v10

    .line 1835
    :pswitch_16
    check-cast v13, Ly05;

    .line 1836
    .line 1837
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 1838
    .line 1839
    if-eqz v0, :cond_6a

    .line 1840
    .line 1841
    if-ne v0, v14, :cond_69

    .line 1842
    .line 1843
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1844
    .line 1845
    check-cast v0, Loh2;

    .line 1846
    .line 1847
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1848
    .line 1849
    .line 1850
    goto :goto_3c

    .line 1851
    :cond_69
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1852
    .line 1853
    .line 1854
    move-object v10, v15

    .line 1855
    goto :goto_3d

    .line 1856
    :cond_6a
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1857
    .line 1858
    .line 1859
    invoke-interface {v13}, Llh7;->getValue()Ljava/lang/Object;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v0

    .line 1863
    check-cast v0, Loh2;

    .line 1864
    .line 1865
    if-eqz v0, :cond_6c

    .line 1866
    .line 1867
    new-instance v2, Luh3;

    .line 1868
    .line 1869
    const/16 v3, 0x10

    .line 1870
    .line 1871
    invoke-direct {v2, v3}, Luh3;-><init>(B)V

    .line 1872
    .line 1873
    .line 1874
    iput-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1875
    .line 1876
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1877
    .line 1878
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1879
    .line 1880
    .line 1881
    invoke-static {v1}, Lz68;->H(Ls61;)Lai;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v1

    .line 1885
    invoke-virtual {v1, v2, v6}, Lai;->a(Lgn2;Lq51;)Ljava/lang/Object;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v1

    .line 1889
    if-ne v1, v12, :cond_6b

    .line 1890
    .line 1891
    move-object v10, v12

    .line 1892
    goto :goto_3d

    .line 1893
    :cond_6b
    :goto_3c
    invoke-static {v0}, Loh2;->a(Loh2;)Z

    .line 1894
    .line 1895
    .line 1896
    :cond_6c
    invoke-interface {v13, v15}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 1897
    .line 1898
    .line 1899
    :goto_3d
    return-object v10

    .line 1900
    :pswitch_17
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 1901
    .line 1902
    if-eqz v0, :cond_6e

    .line 1903
    .line 1904
    if-eq v0, v14, :cond_6d

    .line 1905
    .line 1906
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1907
    .line 1908
    .line 1909
    :goto_3e
    move-object v12, v15

    .line 1910
    goto :goto_40

    .line 1911
    :cond_6d
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1912
    .line 1913
    .line 1914
    goto :goto_3f

    .line 1915
    :cond_6e
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1916
    .line 1917
    .line 1918
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1919
    .line 1920
    check-cast v0, Lr77;

    .line 1921
    .line 1922
    new-instance v1, Lk;

    .line 1923
    .line 1924
    check-cast v13, Landroid/app/Activity;

    .line 1925
    .line 1926
    const/16 v2, 0x12

    .line 1927
    .line 1928
    invoke-direct {v1, v13, v15, v2}, Lk;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 1929
    .line 1930
    .line 1931
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1932
    .line 1933
    .line 1934
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 1935
    .line 1936
    invoke-static {v0, v1, v6}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v0

    .line 1940
    if-ne v0, v12, :cond_6f

    .line 1941
    .line 1942
    goto :goto_40

    .line 1943
    :cond_6f
    :goto_3f
    invoke-static {v7}, Lbt;->i(Ljava/lang/String;)V

    .line 1944
    .line 1945
    .line 1946
    goto :goto_3e

    .line 1947
    :goto_40
    return-object v12

    .line 1948
    :pswitch_18
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 1949
    .line 1950
    check-cast v0, Lak3;

    .line 1951
    .line 1952
    iget-object v1, v0, Lak3;->b:Ljava/lang/ThreadLocal;

    .line 1953
    .line 1954
    iget-boolean v2, v6, Ljy2;->h0:Z

    .line 1955
    .line 1956
    if-eqz v2, :cond_71

    .line 1957
    .line 1958
    if-ne v2, v14, :cond_70

    .line 1959
    .line 1960
    :try_start_3
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1961
    .line 1962
    .line 1963
    move-object/from16 v0, p1

    .line 1964
    .line 1965
    goto :goto_42

    .line 1966
    :catchall_2
    move-exception v0

    .line 1967
    goto :goto_43

    .line 1968
    :cond_70
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 1969
    .line 1970
    .line 1971
    :goto_41
    move-object v12, v15

    .line 1972
    goto :goto_44

    .line 1973
    :cond_71
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v2

    .line 1980
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1981
    .line 1982
    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1983
    .line 1984
    .line 1985
    move-result v2

    .line 1986
    if-nez v2, :cond_73

    .line 1987
    .line 1988
    invoke-virtual {v1, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 1989
    .line 1990
    .line 1991
    :try_start_4
    iget-object v0, v0, Lak3;->c:Lna1;

    .line 1992
    .line 1993
    new-instance v2, Lw81;

    .line 1994
    .line 1995
    check-cast v13, Lgn2;

    .line 1996
    .line 1997
    invoke-direct {v2, v13, v15, v4}, Lw81;-><init>(Lgn2;Lq51;B)V

    .line 1998
    .line 1999
    .line 2000
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 2001
    .line 2002
    invoke-static {v0, v2, v6}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v0

    .line 2006
    if-ne v0, v12, :cond_72

    .line 2007
    .line 2008
    goto :goto_44

    .line 2009
    :cond_72
    :goto_42
    move-object v12, v0

    .line 2010
    check-cast v12, Lo05;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 2011
    .line 2012
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2013
    .line 2014
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 2015
    .line 2016
    .line 2017
    goto :goto_44

    .line 2018
    :goto_43
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2019
    .line 2020
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 2021
    .line 2022
    .line 2023
    throw v0

    .line 2024
    :cond_73
    const-string v0, "Don\'t call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don\'t do everything in a single callback. "

    .line 2025
    .line 2026
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 2027
    .line 2028
    .line 2029
    goto :goto_41

    .line 2030
    :goto_44
    return-object v12

    .line 2031
    :pswitch_19
    check-cast v13, Luh3;

    .line 2032
    .line 2033
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 2034
    .line 2035
    check-cast v0, Lml2;

    .line 2036
    .line 2037
    iget-boolean v2, v6, Ljy2;->h0:Z

    .line 2038
    .line 2039
    if-eqz v2, :cond_75

    .line 2040
    .line 2041
    if-ne v2, v14, :cond_74

    .line 2042
    .line 2043
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2044
    .line 2045
    .line 2046
    goto :goto_45

    .line 2047
    :cond_74
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 2048
    .line 2049
    .line 2050
    move-object v10, v15

    .line 2051
    goto :goto_45

    .line 2052
    :cond_75
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2053
    .line 2054
    .line 2055
    const-string v2, "InvalidSystemTimeDialogFragment"

    .line 2056
    .line 2057
    invoke-virtual {v0, v2}, Lml2;->E(Ljava/lang/String;)Lqk2;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v3

    .line 2061
    instance-of v4, v3, Lvh3;

    .line 2062
    .line 2063
    if-eqz v4, :cond_78

    .line 2064
    .line 2065
    move-object v0, v3

    .line 2066
    check-cast v0, Lvh3;

    .line 2067
    .line 2068
    iget-object v2, v0, Lqk2;->S0:Lg94;

    .line 2069
    .line 2070
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2071
    .line 2072
    .line 2073
    sget-object v4, Ltp1;->a:Lnf1;

    .line 2074
    .line 2075
    sget-object v4, Ldm4;->a:Lhv2;

    .line 2076
    .line 2077
    iget-object v4, v4, Lhv2;->h0:Lhv2;

    .line 2078
    .line 2079
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2080
    .line 2081
    .line 2082
    invoke-virtual {v4, v1}, Lhv2;->b1(Ls61;)Z

    .line 2083
    .line 2084
    .line 2085
    move-result v1

    .line 2086
    if-nez v1, :cond_77

    .line 2087
    .line 2088
    iget-object v5, v2, Lg94;->i:Lo84;

    .line 2089
    .line 2090
    sget-object v7, Lo84;->X:Lo84;

    .line 2091
    .line 2092
    if-eq v5, v7, :cond_76

    .line 2093
    .line 2094
    sget-object v7, Lo84;->g0:Lo84;

    .line 2095
    .line 2096
    invoke-virtual {v5, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2097
    .line 2098
    .line 2099
    move-result v5

    .line 2100
    if-ltz v5, :cond_77

    .line 2101
    .line 2102
    invoke-virtual {v13, v3}, Luh3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2103
    .line 2104
    .line 2105
    goto :goto_45

    .line 2106
    :cond_76
    new-instance v0, Lv84;

    .line 2107
    .line 2108
    invoke-direct {v0, v15}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 2109
    .line 2110
    .line 2111
    throw v0

    .line 2112
    :cond_77
    new-instance v3, Lc3;

    .line 2113
    .line 2114
    const/16 v5, 0xf

    .line 2115
    .line 2116
    invoke-direct {v3, v13, v0, v5}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2117
    .line 2118
    .line 2119
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 2120
    .line 2121
    invoke-static {v2, v1, v4, v3, v6}, Ls08;->h(Lg94;ZLhv2;Ldn2;Luy7;)Ljava/lang/Object;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v0

    .line 2125
    if-ne v0, v12, :cond_79

    .line 2126
    .line 2127
    move-object v10, v12

    .line 2128
    goto :goto_45

    .line 2129
    :cond_78
    new-instance v1, Lvh3;

    .line 2130
    .line 2131
    invoke-direct {v1}, Lvh3;-><init>()V

    .line 2132
    .line 2133
    .line 2134
    invoke-static {v0, v1, v2}, Ld8;->Z(Lml2;Ld8;Ljava/lang/String;)V

    .line 2135
    .line 2136
    .line 2137
    invoke-virtual {v13, v1}, Luh3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2138
    .line 2139
    .line 2140
    :cond_79
    :goto_45
    return-object v10

    .line 2141
    :pswitch_1a
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 2142
    .line 2143
    if-eqz v0, :cond_7b

    .line 2144
    .line 2145
    if-ne v0, v14, :cond_7a

    .line 2146
    .line 2147
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2148
    .line 2149
    .line 2150
    move-object/from16 v0, p1

    .line 2151
    .line 2152
    check-cast v0, Lsj6;

    .line 2153
    .line 2154
    iget-object v0, v0, Lsj6;->X:Ljava/lang/Object;

    .line 2155
    .line 2156
    goto :goto_46

    .line 2157
    :cond_7a
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 2158
    .line 2159
    .line 2160
    move-object v10, v15

    .line 2161
    goto :goto_46

    .line 2162
    :cond_7b
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2163
    .line 2164
    .line 2165
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 2166
    .line 2167
    check-cast v0, Lza3;

    .line 2168
    .line 2169
    invoke-virtual {v0}, Lza3;->e()Lms;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v0

    .line 2173
    check-cast v13, Lzo8;

    .line 2174
    .line 2175
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 2176
    .line 2177
    invoke-virtual {v0, v13, v6}, Lms;->e(Lzo8;Ls51;)Ljava/lang/Object;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v0

    .line 2181
    if-ne v0, v12, :cond_7c

    .line 2182
    .line 2183
    move-object v10, v12

    .line 2184
    :cond_7c
    :goto_46
    return-object v10

    .line 2185
    :pswitch_1b
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2186
    .line 2187
    .line 2188
    iget-boolean v0, v6, Ljy2;->h0:Z

    .line 2189
    .line 2190
    iget-object v1, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 2191
    .line 2192
    check-cast v1, Lpx2;

    .line 2193
    .line 2194
    if-eqz v0, :cond_7e

    .line 2195
    .line 2196
    check-cast v13, Ly05;

    .line 2197
    .line 2198
    invoke-interface {v13}, Llh7;->getValue()Ljava/lang/Object;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v0

    .line 2202
    check-cast v0, Ly24;

    .line 2203
    .line 2204
    iget-object v2, v1, Lpx2;->c:Lrh5;

    .line 2205
    .line 2206
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v2

    .line 2210
    check-cast v2, Ly24;

    .line 2211
    .line 2212
    if-eqz v2, :cond_7d

    .line 2213
    .line 2214
    if-eqz v0, :cond_7d

    .line 2215
    .line 2216
    invoke-interface {v2}, Ly24;->g()Z

    .line 2217
    .line 2218
    .line 2219
    move-result v3

    .line 2220
    if-eqz v3, :cond_7d

    .line 2221
    .line 2222
    invoke-interface {v0}, Ly24;->g()Z

    .line 2223
    .line 2224
    .line 2225
    move-result v3

    .line 2226
    if-eqz v3, :cond_7d

    .line 2227
    .line 2228
    iget-object v3, v1, Lpx2;->b:Lrh5;

    .line 2229
    .line 2230
    invoke-interface {v2, v0, v14}, Ly24;->H(Ly24;Z)Ls86;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v0

    .line 2234
    invoke-virtual {v3, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 2235
    .line 2236
    .line 2237
    :cond_7d
    iget-object v0, v1, Lpx2;->a:Lrh5;

    .line 2238
    .line 2239
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2240
    .line 2241
    invoke-virtual {v0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 2242
    .line 2243
    .line 2244
    goto :goto_47

    .line 2245
    :cond_7e
    iget-object v0, v1, Lpx2;->a:Lrh5;

    .line 2246
    .line 2247
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2248
    .line 2249
    invoke-virtual {v0, v2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 2250
    .line 2251
    .line 2252
    iget-object v0, v1, Lpx2;->b:Lrh5;

    .line 2253
    .line 2254
    invoke-virtual {v0, v15}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 2255
    .line 2256
    .line 2257
    :goto_47
    return-object v10

    .line 2258
    :pswitch_1c
    iget-object v0, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 2259
    .line 2260
    check-cast v0, Lb71;

    .line 2261
    .line 2262
    iget-boolean v1, v6, Ljy2;->h0:Z

    .line 2263
    .line 2264
    if-eqz v1, :cond_80

    .line 2265
    .line 2266
    if-ne v1, v14, :cond_7f

    .line 2267
    .line 2268
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2269
    .line 2270
    .line 2271
    goto :goto_48

    .line 2272
    :cond_7f
    invoke-static {v11}, Lbt;->i(Ljava/lang/String;)V

    .line 2273
    .line 2274
    .line 2275
    move-object v10, v15

    .line 2276
    goto :goto_48

    .line 2277
    :cond_80
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2278
    .line 2279
    .line 2280
    check-cast v13, Lky2;

    .line 2281
    .line 2282
    new-instance v1, Ltb2;

    .line 2283
    .line 2284
    invoke-direct {v1, v13, v2}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 2285
    .line 2286
    .line 2287
    invoke-static {v1}, Lw51;->L(Ldn2;)Lj31;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v1

    .line 2291
    new-instance v2, Lq0;

    .line 2292
    .line 2293
    const/16 v3, 0x1d

    .line 2294
    .line 2295
    invoke-direct {v2, v0, v15, v3}, Lq0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 2296
    .line 2297
    .line 2298
    iput-object v15, v6, Ljy2;->i0:Ljava/lang/Object;

    .line 2299
    .line 2300
    iput-boolean v14, v6, Ljy2;->h0:Z

    .line 2301
    .line 2302
    invoke-static {v1, v2, v6}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v0

    .line 2306
    if-ne v0, v12, :cond_81

    .line 2307
    .line 2308
    move-object v10, v12

    .line 2309
    :cond_81
    :goto_48
    return-object v10

    .line 2310
    nop

    .line 2311
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
