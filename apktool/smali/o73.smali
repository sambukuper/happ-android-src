.class public final synthetic Lo73;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:I

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILm73;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lo73;->X:B

    .line 2
    .line 3
    iput p1, p0, Lo73;->Y:I

    .line 4
    .line 5
    iput p2, p0, Lo73;->Z:I

    .line 6
    .line 7
    iput-object p3, p0, Lo73;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IIB)V
    .locals 0

    .line 13
    iput-byte p4, p0, Lo73;->X:B

    iput-object p1, p0, Lo73;->f0:Ljava/lang/Object;

    iput p2, p0, Lo73;->Y:I

    iput p3, p0, Lo73;->Z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lo73;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    iget v3, p0, Lo73;->Z:I

    .line 7
    .line 8
    iget v4, p0, Lo73;->Y:I

    .line 9
    .line 10
    iget-object p0, p0, Lo73;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Llf;

    .line 16
    .line 17
    check-cast p1, Ltg5;

    .line 18
    .line 19
    iget-object v0, p1, Ltg5;->a:Lff;

    .line 20
    .line 21
    invoke-virtual {p1, v4}, Ltg5;->d(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1, v3}, Ltg5;->d(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object v4, v0, Lff;->e:Ljava/lang/CharSequence;

    .line 30
    .line 31
    if-ltz v1, :cond_0

    .line 32
    .line 33
    if-gt v1, v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-gt v3, v5, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const-string v5, ") or end("

    .line 47
    .line 48
    const-string v6, ") is out of range [0.."

    .line 49
    .line 50
    const-string v7, "start("

    .line 51
    .line 52
    invoke-static {v1, v7, v3, v5, v6}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v4, "], or start > end!"

    .line 60
    .line 61
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v4}, Lxc3;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    new-instance v4, Landroid/graphics/Path;

    .line 72
    .line 73
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 74
    .line 75
    .line 76
    iget-object v0, v0, Lff;->d:Lv78;

    .line 77
    .line 78
    iget-object v5, v0, Lv78;->f:Landroid/text/Layout;

    .line 79
    .line 80
    invoke-virtual {v5, v1, v3, v4}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    .line 81
    .line 82
    .line 83
    iget v0, v0, Lv78;->h:I

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/graphics/Path;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_1

    .line 93
    .line 94
    int-to-float v0, v0

    .line 95
    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->offset(FF)V

    .line 96
    .line 97
    .line 98
    :cond_1
    new-instance v0, Llf;

    .line 99
    .line 100
    invoke-direct {v0, v4}, Llf;-><init>(Landroid/graphics/Path;)V

    .line 101
    .line 102
    .line 103
    iget p1, p1, Ltg5;->f:F

    .line 104
    .line 105
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    int-to-long v3, v1

    .line 110
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    int-to-long v5, p1

    .line 115
    const/16 p1, 0x20

    .line 116
    .line 117
    shl-long/2addr v3, p1

    .line 118
    const-wide v7, 0xffffffffL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    and-long/2addr v5, v7

    .line 124
    or-long/2addr v3, v5

    .line 125
    invoke-virtual {v0, v3, v4}, Llf;->h(J)V

    .line 126
    .line 127
    .line 128
    invoke-static {p0, v0}, Llf;->a(Llf;Llf;)V

    .line 129
    .line 130
    .line 131
    return-object v2

    .line 132
    :pswitch_0
    check-cast p0, Lm73;

    .line 133
    .line 134
    check-cast p1, Lg48;

    .line 135
    .line 136
    iget-object v0, p1, Lg48;->j0:Lf88;

    .line 137
    .line 138
    iget-object v5, p1, Lg48;->Z:Lmi5;

    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    invoke-virtual {p1, v6}, Lg48;->f(Lf88;)V

    .line 144
    .line 145
    .line 146
    :cond_2
    if-gez v4, :cond_3

    .line 147
    .line 148
    move v4, v1

    .line 149
    :cond_3
    if-gez v3, :cond_4

    .line 150
    .line 151
    move v3, v1

    .line 152
    :cond_4
    invoke-static {v4, v3}, Lct7;->c(II)J

    .line 153
    .line 154
    .line 155
    move-result-wide v3

    .line 156
    invoke-interface {p0, v3, v4}, Lm73;->b(J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v3

    .line 160
    invoke-static {v3, v4}, Lf88;->d(J)I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    invoke-virtual {v5}, Lmi5;->length()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-static {p0, v1, v0}, Lx97;->n(III)I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    invoke-static {v3, v4}, Lf88;->c(J)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    invoke-virtual {v5}, Lmi5;->length()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-static {v0, v1, v3}, Lx97;->n(III)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eq p0, v0, :cond_6

    .line 185
    .line 186
    if-ge p0, v0, :cond_5

    .line 187
    .line 188
    invoke-virtual {p1, p0, v0, v6}, Lg48;->e(IILjava/util/List;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_5
    invoke-virtual {p1, v0, p0, v6}, Lg48;->e(IILjava/util/List;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    :goto_1
    return-object v2

    .line 196
    :pswitch_1
    check-cast p0, Lm73;

    .line 197
    .line 198
    check-cast p1, Lg48;

    .line 199
    .line 200
    if-ltz v4, :cond_7

    .line 201
    .line 202
    if-ltz v3, :cond_7

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v5, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "

    .line 208
    .line 209
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v5, " and "

    .line 216
    .line 217
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v5, " respectively."

    .line 224
    .line 225
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-static {v0}, Lzc3;->a(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_2
    iget-wide v5, p1, Lg48;->i0:J

    .line 236
    .line 237
    invoke-interface {p0, v5, v6}, Lm73;->f(J)J

    .line 238
    .line 239
    .line 240
    move-result-wide v5

    .line 241
    invoke-static {v5, v6}, Lf88;->c(J)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    add-int v7, v0, v3

    .line 246
    .line 247
    xor-int/2addr v0, v7

    .line 248
    xor-int/2addr v3, v7

    .line 249
    and-int/2addr v0, v3

    .line 250
    if-gez v0, :cond_8

    .line 251
    .line 252
    invoke-interface {p0}, Lm73;->a()I

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    :cond_8
    invoke-static {v5, v6}, Lf88;->c(J)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    invoke-interface {p0}, Lm73;->a()I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    invoke-static {v7, v3}, Ljava/lang/Math;->min(II)I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    invoke-static {v0, v3}, Lct7;->c(II)J

    .line 269
    .line 270
    .line 271
    move-result-wide v7

    .line 272
    invoke-interface {p0, v7, v8}, Lm73;->b(J)J

    .line 273
    .line 274
    .line 275
    move-result-wide v7

    .line 276
    invoke-static {v7, v8}, Lf88;->d(J)I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-static {v7, v8}, Lf88;->c(J)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    invoke-static {p1, v0, v3}, Lw79;->D(Lg48;II)V

    .line 285
    .line 286
    .line 287
    invoke-static {v5, v6}, Lf88;->d(J)I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    sub-int v3, v0, v4

    .line 292
    .line 293
    xor-int/2addr v4, v0

    .line 294
    xor-int/2addr v0, v3

    .line 295
    and-int/2addr v0, v4

    .line 296
    if-gez v0, :cond_9

    .line 297
    .line 298
    move v3, v1

    .line 299
    :cond_9
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    invoke-static {v5, v6}, Lf88;->d(J)I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-static {v0, v1}, Lct7;->c(II)J

    .line 308
    .line 309
    .line 310
    move-result-wide v0

    .line 311
    invoke-interface {p0, v0, v1}, Lm73;->b(J)J

    .line 312
    .line 313
    .line 314
    move-result-wide v0

    .line 315
    invoke-static {v0, v1}, Lf88;->d(J)I

    .line 316
    .line 317
    .line 318
    move-result p0

    .line 319
    invoke-static {v0, v1}, Lf88;->c(J)I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    invoke-static {p1, p0, v0}, Lw79;->D(Lg48;II)V

    .line 324
    .line 325
    .line 326
    return-object v2

    .line 327
    :pswitch_2
    check-cast p0, Lm73;

    .line 328
    .line 329
    check-cast p1, Lg48;

    .line 330
    .line 331
    iget-object v0, p1, Lg48;->Z:Lmi5;

    .line 332
    .line 333
    invoke-virtual {v0}, Lmi5;->length()I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    invoke-static {v1, v0}, Lct7;->c(II)J

    .line 338
    .line 339
    .line 340
    move-result-wide v0

    .line 341
    invoke-interface {p0, v0, v1}, Lm73;->f(J)J

    .line 342
    .line 343
    .line 344
    move-result-wide v0

    .line 345
    invoke-static {v0, v1}, Lf88;->d(J)I

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    invoke-static {v0, v1}, Lf88;->c(J)I

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    if-ge v4, v5, :cond_a

    .line 354
    .line 355
    move v4, v5

    .line 356
    :cond_a
    if-le v4, v6, :cond_b

    .line 357
    .line 358
    goto :goto_3

    .line 359
    :cond_b
    move v6, v4

    .line 360
    :goto_3
    invoke-static {v0, v1}, Lf88;->d(J)I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    invoke-static {v0, v1}, Lf88;->c(J)I

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-ge v3, v4, :cond_c

    .line 369
    .line 370
    move v3, v4

    .line 371
    :cond_c
    if-le v3, v0, :cond_d

    .line 372
    .line 373
    goto :goto_4

    .line 374
    :cond_d
    move v0, v3

    .line 375
    :goto_4
    invoke-static {v6, v0}, Lct7;->c(II)J

    .line 376
    .line 377
    .line 378
    move-result-wide v0

    .line 379
    invoke-interface {p0, v0, v1}, Lm73;->b(J)J

    .line 380
    .line 381
    .line 382
    move-result-wide v0

    .line 383
    invoke-virtual {p1, v0, v1}, Lg48;->g(J)V

    .line 384
    .line 385
    .line 386
    return-object v2

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
