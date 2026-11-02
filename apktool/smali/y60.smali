.class public final synthetic Ly60;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:J

.field public final synthetic Z:J

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfe7;JJLtv1;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput-byte v0, p0, Ly60;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly60;->f0:Ljava/lang/Object;

    iput-wide p2, p0, Ly60;->Y:J

    iput-wide p4, p0, Ly60;->Z:J

    iput-object p6, p0, Ly60;->g0:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lny6;Lz24;JJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Ly60;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ly60;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ly60;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-wide p3, p0, Ly60;->Y:J

    .line 12
    .line 13
    iput-wide p5, p0, Ly60;->Z:J

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Ly60;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v3, v0, Ly60;->g0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Ly60;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, Lny6;

    .line 15
    .line 16
    check-cast v3, Lz24;

    .line 17
    .line 18
    move-object/from16 v5, p1

    .line 19
    .line 20
    check-cast v5, Lp34;

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, v5, Lp34;->X:Lum0;

    .line 26
    .line 27
    invoke-virtual {v5}, Lp34;->a()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v4}, Lny6;->j()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-nez v6, :cond_1

    .line 35
    .line 36
    invoke-interface {v4}, Lny6;->m()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    :cond_0
    :goto_0
    move-object/from16 v19, v2

    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_1
    invoke-interface {v4}, Lny6;->o()Ltx6;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-interface {v6}, Ltx6;->p()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-interface {v6}, Ltx6;->s()I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    invoke-interface {v6}, Ltx6;->e()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const v9, 0x7fffffff

    .line 66
    .line 67
    .line 68
    if-eq v7, v9, :cond_0

    .line 69
    .line 70
    if-eq v8, v9, :cond_0

    .line 71
    .line 72
    if-eq v6, v9, :cond_0

    .line 73
    .line 74
    if-le v7, v8, :cond_0

    .line 75
    .line 76
    if-gtz v8, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    const/high16 v9, 0x40c00000    # 6.0f

    .line 80
    .line 81
    invoke-virtual {v5, v9}, Lp34;->h0(F)F

    .line 82
    .line 83
    .line 84
    move-result v14

    .line 85
    const/high16 v9, 0x40400000    # 3.0f

    .line 86
    .line 87
    invoke-virtual {v5, v9}, Lp34;->h0(F)F

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    invoke-interface {v1}, Lsv1;->e()J

    .line 92
    .line 93
    .line 94
    move-result-wide v9

    .line 95
    const-wide v16, 0xffffffffL

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    and-long v9, v9, v16

    .line 101
    .line 102
    long-to-int v9, v9

    .line 103
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    const/high16 v10, 0x40000000    # 2.0f

    .line 108
    .line 109
    mul-float v11, v14, v10

    .line 110
    .line 111
    sub-float/2addr v9, v11

    .line 112
    const/4 v11, 0x0

    .line 113
    cmpg-float v12, v9, v11

    .line 114
    .line 115
    if-lez v12, :cond_0

    .line 116
    .line 117
    invoke-interface {v1}, Lsv1;->e()J

    .line 118
    .line 119
    .line 120
    move-result-wide v12

    .line 121
    const/16 v18, 0x20

    .line 122
    .line 123
    shr-long v12, v12, v18

    .line 124
    .line 125
    long-to-int v12, v12

    .line 126
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    add-float v13, v14, v15

    .line 131
    .line 132
    cmpg-float v12, v12, v13

    .line 133
    .line 134
    if-gez v12, :cond_4

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_4
    int-to-float v12, v8

    .line 138
    mul-float/2addr v12, v9

    .line 139
    int-to-float v13, v7

    .line 140
    div-float/2addr v12, v13

    .line 141
    const/high16 v13, 0x41c00000    # 24.0f

    .line 142
    .line 143
    invoke-virtual {v5, v13}, Lp34;->h0(F)F

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    invoke-static {v13, v9}, Ljava/lang/Math;->min(FF)F

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    invoke-static {v12, v13, v9}, Lx97;->m(FFF)F

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    invoke-interface {v4}, Lny6;->j()Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-nez v13, :cond_5

    .line 160
    .line 161
    :goto_1
    move v4, v11

    .line 162
    goto :goto_2

    .line 163
    :cond_5
    invoke-interface {v4}, Lny6;->m()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    const/high16 v13, 0x3f800000    # 1.0f

    .line 168
    .line 169
    if-nez v4, :cond_6

    .line 170
    .line 171
    move v4, v13

    .line 172
    goto :goto_2

    .line 173
    :cond_6
    int-to-float v4, v6

    .line 174
    sub-int/2addr v7, v8

    .line 175
    int-to-float v6, v7

    .line 176
    div-float/2addr v4, v6

    .line 177
    invoke-static {v4, v11, v13}, Lx97;->m(FFF)F

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    goto :goto_1

    .line 182
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_8

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    if-ne v3, v1, :cond_7

    .line 190
    .line 191
    move v1, v14

    .line 192
    goto :goto_3

    .line 193
    :cond_7
    invoke-static {}, Lb61;->c()V

    .line 194
    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    goto/16 :goto_5

    .line 198
    .line 199
    :cond_8
    invoke-interface {v1}, Lsv1;->e()J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    shr-long v6, v6, v18

    .line 204
    .line 205
    long-to-int v1, v6

    .line 206
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    sub-float/2addr v1, v14

    .line 211
    sub-float/2addr v1, v15

    .line 212
    :goto_3
    div-float v3, v15, v10

    .line 213
    .line 214
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    int-to-long v6, v6

    .line 219
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    int-to-long v10, v3

    .line 224
    shl-long v6, v6, v18

    .line 225
    .line 226
    and-long v10, v10, v16

    .line 227
    .line 228
    or-long/2addr v6, v10

    .line 229
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    int-to-long v10, v3

    .line 234
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    move/from16 p1, v1

    .line 239
    .line 240
    move-object/from16 v19, v2

    .line 241
    .line 242
    int-to-long v1, v3

    .line 243
    shl-long v10, v10, v18

    .line 244
    .line 245
    and-long v1, v1, v16

    .line 246
    .line 247
    or-long/2addr v1, v10

    .line 248
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    int-to-long v10, v3

    .line 253
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    move-wide/from16 v20, v1

    .line 258
    .line 259
    int-to-long v1, v3

    .line 260
    shl-long v10, v10, v18

    .line 261
    .line 262
    and-long v1, v1, v16

    .line 263
    .line 264
    or-long/2addr v10, v1

    .line 265
    move v1, v12

    .line 266
    move-wide v12, v6

    .line 267
    iget-wide v6, v0, Ly60;->Y:J

    .line 268
    .line 269
    move v2, v1

    .line 270
    move v1, v9

    .line 271
    move-wide/from16 v8, v20

    .line 272
    .line 273
    invoke-virtual/range {v5 .. v13}, Lp34;->f0(JJJJ)V

    .line 274
    .line 275
    .line 276
    invoke-static {v1, v2, v4, v14}, Lp61;->e(FFFF)F

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    int-to-long v3, v3

    .line 285
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    int-to-long v6, v1

    .line 290
    shl-long v3, v3, v18

    .line 291
    .line 292
    and-long v6, v6, v16

    .line 293
    .line 294
    or-long v8, v3, v6

    .line 295
    .line 296
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    int-to-long v3, v1

    .line 301
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    int-to-long v1, v1

    .line 306
    shl-long v3, v3, v18

    .line 307
    .line 308
    and-long v1, v1, v16

    .line 309
    .line 310
    or-long v10, v3, v1

    .line 311
    .line 312
    iget-wide v6, v0, Ly60;->Z:J

    .line 313
    .line 314
    invoke-virtual/range {v5 .. v13}, Lp34;->f0(JJJJ)V

    .line 315
    .line 316
    .line 317
    :goto_4
    move-object/from16 v2, v19

    .line 318
    .line 319
    :goto_5
    return-object v2

    .line 320
    :pswitch_0
    move-object/from16 v19, v2

    .line 321
    .line 322
    check-cast v4, Ld90;

    .line 323
    .line 324
    move-object v10, v3

    .line 325
    check-cast v10, Ltv1;

    .line 326
    .line 327
    move-object/from16 v3, p1

    .line 328
    .line 329
    check-cast v3, Lp34;

    .line 330
    .line 331
    invoke-virtual {v3}, Lp34;->a()V

    .line 332
    .line 333
    .line 334
    const/4 v11, 0x0

    .line 335
    const/16 v12, 0x68

    .line 336
    .line 337
    iget-wide v5, v0, Ly60;->Y:J

    .line 338
    .line 339
    iget-wide v7, v0, Ly60;->Z:J

    .line 340
    .line 341
    const/4 v9, 0x0

    .line 342
    invoke-static/range {v3 .. v12}, Lsv1;->E0(Lsv1;Ld90;JJFLtv1;II)V

    .line 343
    .line 344
    .line 345
    return-object v19

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
