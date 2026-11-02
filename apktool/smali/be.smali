.class public Lbe;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Let;
.implements Lgt;
.implements Lr61;
.implements Lz41;
.implements Li86;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lbe;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static f(Landroid/view/Surface;Ljava/lang/Integer;Llh4;Lbf5;Laf5;Lcf5;Ljava/util/List;Landroid/util/Size;ZILjava/lang/String;I)Laf;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    move-object/from16 v5, p10

    .line 12
    .line 13
    move/from16 v6, p11

    .line 14
    .line 15
    sget-object v7, Llh4;->n0:Llh4;

    .line 16
    .line 17
    and-int/lit8 v8, v6, 0x2

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    if-eqz v8, :cond_0

    .line 21
    .line 22
    move-object v8, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object/from16 v8, p1

    .line 25
    .line 26
    :goto_0
    and-int/lit8 v10, v6, 0x4

    .line 27
    .line 28
    if-eqz v10, :cond_1

    .line 29
    .line 30
    move-object v10, v7

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object/from16 v10, p2

    .line 33
    .line 34
    :goto_1
    and-int/lit16 v11, v6, 0x200

    .line 35
    .line 36
    if-eqz v11, :cond_2

    .line 37
    .line 38
    const/4 v11, 0x0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move/from16 v11, p8

    .line 41
    .line 42
    :goto_2
    and-int/lit16 v6, v6, 0x400

    .line 43
    .line 44
    const/4 v12, -0x1

    .line 45
    if-eqz v6, :cond_3

    .line 46
    .line 47
    move v6, v12

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move/from16 v6, p9

    .line 50
    .line 51
    :goto_3
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v13, Llh4;->q0:Llh4;

    .line 55
    .line 56
    const/16 v14, 0x1a

    .line 57
    .line 58
    const/16 v15, 0x23

    .line 59
    .line 60
    if-eq v10, v13, :cond_4

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    if-lt v13, v15, :cond_7

    .line 66
    .line 67
    const-string v0, "Required value was null."

    .line 68
    .line 69
    if-eqz v8, :cond_6

    .line 70
    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v0, v4}, Lmn;->a(ILandroid/util/Size;)Landroid/hardware/camera2/params/OutputConfiguration;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_5
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v9

    .line 87
    :cond_6
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v9

    .line 91
    :cond_7
    :goto_4
    if-eq v10, v7, :cond_10

    .line 92
    .line 93
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    if-lt v0, v14, :cond_f

    .line 96
    .line 97
    if-eqz v4, :cond_e

    .line 98
    .line 99
    sget-object v6, Llh4;->p0:Llh4;

    .line 100
    .line 101
    if-eq v10, v6, :cond_d

    .line 102
    .line 103
    sget-object v6, Llh4;->o0:Llh4;

    .line 104
    .line 105
    if-eq v10, v6, :cond_c

    .line 106
    .line 107
    sget-object v6, Llh4;->r0:Llh4;

    .line 108
    .line 109
    if-eq v10, v6, :cond_a

    .line 110
    .line 111
    sget-object v6, Llh4;->s0:Llh4;

    .line 112
    .line 113
    if-ne v10, v6, :cond_9

    .line 114
    .line 115
    if-lt v0, v15, :cond_8

    .line 116
    .line 117
    const-class v0, Landroid/media/MediaRecorder;

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_8
    const-string v0, "OutputType.MEDIA_RECORDER requires API 35 or higher."

    .line 121
    .line 122
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v9

    .line 126
    :cond_9
    const-string v0, "Unsupported OutputType: "

    .line 127
    .line 128
    invoke-static {v10, v0}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v9

    .line 132
    :cond_a
    if-lt v0, v15, :cond_b

    .line 133
    .line 134
    const-class v0, Landroid/media/MediaCodec;

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_b
    const-string v0, "OutputType.MEDIA_CODEC requires API 35 or higher."

    .line 138
    .line 139
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v9

    .line 143
    :cond_c
    const-class v0, Landroid/view/SurfaceHolder;

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_d
    const-class v0, Landroid/graphics/SurfaceTexture;

    .line 147
    .line 148
    :goto_5
    invoke-static {v4, v0}, Ldn;->b(Landroid/util/Size;Ljava/lang/Class;)Landroid/hardware/camera2/params/OutputConfiguration;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    goto :goto_7

    .line 153
    :cond_e
    const-string v0, "Size must defined when creating a deferred OutputConfiguration."

    .line 154
    .line 155
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v9

    .line 159
    :cond_f
    const-string v1, "Deferred OutputConfigurations are not supported on API "

    .line 160
    .line 161
    const-string v2, " (requires API 26)"

    .line 162
    .line 163
    invoke-static {v1, v0, v2}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object v9

    .line 171
    :cond_10
    if-eqz v0, :cond_20

    .line 172
    .line 173
    if-eq v6, v12, :cond_11

    .line 174
    .line 175
    :try_start_0
    new-instance v4, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 176
    .line 177
    invoke-direct {v4, v6, v0}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    .line 178
    .line 179
    .line 180
    :goto_6
    move-object v0, v4

    .line 181
    goto :goto_7

    .line 182
    :cond_11
    new-instance v4, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 183
    .line 184
    invoke-direct {v4, v0}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(Landroid/view/Surface;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :goto_7
    if-eqz v11, :cond_12

    .line 189
    .line 190
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 191
    .line 192
    if-lt v4, v14, :cond_12

    .line 193
    .line 194
    invoke-static {v0}, Lue3;->p(Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 195
    .line 196
    .line 197
    :cond_12
    const/16 v4, 0x1c

    .line 198
    .line 199
    if-eqz v5, :cond_14

    .line 200
    .line 201
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 202
    .line 203
    if-lt v6, v4, :cond_13

    .line 204
    .line 205
    if-lt v6, v4, :cond_14

    .line 206
    .line 207
    invoke-static {v0, v5}, Len;->X(Landroid/hardware/camera2/params/OutputConfiguration;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_8

    .line 211
    :cond_13
    const-string v0, "physicalCameraId is not supported on API "

    .line 212
    .line 213
    const-string v1, " (requires API 28)"

    .line 214
    .line 215
    invoke-static {v0, v6, v1}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lkp5;->h(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    return-object v9

    .line 223
    :cond_14
    :goto_8
    const/16 v5, 0x21

    .line 224
    .line 225
    if-eqz v1, :cond_17

    .line 226
    .line 227
    iget-byte v1, v1, Lbf5;->a:B

    .line 228
    .line 229
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 230
    .line 231
    if-lt v6, v5, :cond_15

    .line 232
    .line 233
    invoke-static {v0, v1}, Lc4;->E(Landroid/hardware/camera2/params/OutputConfiguration;I)V

    .line 234
    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_15
    if-nez v1, :cond_16

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_16
    invoke-static {v1}, Lbf5;->a(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    :cond_17
    :goto_9
    if-eqz v2, :cond_1a

    .line 244
    .line 245
    iget-wide v1, v2, Laf5;->a:J

    .line 246
    .line 247
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 248
    .line 249
    if-lt v6, v5, :cond_18

    .line 250
    .line 251
    invoke-static {v0, v1, v2}, Lc4;->B(Landroid/hardware/camera2/params/OutputConfiguration;J)V

    .line 252
    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_18
    const-wide/16 v6, 0x1

    .line 256
    .line 257
    cmp-long v6, v1, v6

    .line 258
    .line 259
    if-nez v6, :cond_19

    .line 260
    .line 261
    goto :goto_a

    .line 262
    :cond_19
    invoke-static {v1, v2}, Laf5;->a(J)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    :cond_1a
    :goto_a
    if-eqz v3, :cond_1b

    .line 266
    .line 267
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 268
    .line 269
    if-lt v1, v5, :cond_1b

    .line 270
    .line 271
    iget-wide v1, v3, Lcf5;->a:J

    .line 272
    .line 273
    invoke-static {v0, v1, v2}, Lc4;->G(Landroid/hardware/camera2/params/OutputConfiguration;J)V

    .line 274
    .line 275
    .line 276
    :cond_1b
    invoke-interface/range {p6 .. p6}, Ljava/util/Collection;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-nez v1, :cond_1e

    .line 281
    .line 282
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 283
    .line 284
    const/16 v2, 0x1f

    .line 285
    .line 286
    if-lt v1, v2, :cond_1d

    .line 287
    .line 288
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    if-nez v2, :cond_1c

    .line 297
    .line 298
    goto :goto_b

    .line 299
    :cond_1c
    invoke-static {v1}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    throw v0

    .line 304
    :cond_1d
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    :cond_1e
    :goto_b
    new-instance v1, Laf;

    .line 308
    .line 309
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 310
    .line 311
    if-lt v2, v4, :cond_1f

    .line 312
    .line 313
    invoke-static {v0}, Len;->s(Landroid/hardware/camera2/params/OutputConfiguration;)I

    .line 314
    .line 315
    .line 316
    :cond_1f
    invoke-direct {v1, v0}, Laf;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 317
    .line 318
    .line 319
    return-object v1

    .line 320
    :catchall_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    return-object v9

    .line 324
    :cond_20
    const-string v0, "non-null surface!"

    .line 325
    .line 326
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-object v9
.end method

.method public static g([B[B[B)[B
    .locals 3

    .line 1
    const-string v0, "HmacSHA256"

    .line 2
    .line 3
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 8
    .line 9
    invoke-direct {v2, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljavax/crypto/Mac;->update([B)V

    .line 16
    .line 17
    .line 18
    const/16 p0, 0x2e

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljavax/crypto/Mac;->update(B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static k(Ljava/lang/String;)Lwr0;
    .locals 2

    .line 1
    new-instance v0, Lwr0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lwr0;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lwr0;->d:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V
    .locals 15

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move v5, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v5, v2

    .line 12
    :goto_0
    and-int/lit8 v1, v0, 0x4

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object v6, v4

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object/from16 v6, p1

    .line 20
    .line 21
    :goto_1
    and-int/lit8 v1, v0, 0x8

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    move-object v7, v4

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move-object/from16 v7, p2

    .line 28
    .line 29
    :goto_2
    and-int/lit8 v1, v0, 0x10

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    move-object v8, v4

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    move-object/from16 v8, p3

    .line 36
    .line 37
    :goto_3
    and-int/lit8 v1, v0, 0x20

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    move-object v9, v4

    .line 42
    goto :goto_4

    .line 43
    :cond_4
    move-object/from16 v9, p4

    .line 44
    .line 45
    :goto_4
    and-int/lit8 v1, v0, 0x40

    .line 46
    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    move-object v10, v4

    .line 50
    goto :goto_5

    .line 51
    :cond_5
    move-object/from16 v10, p5

    .line 52
    .line 53
    :goto_5
    and-int/lit16 v1, v0, 0x80

    .line 54
    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    move-object v11, v4

    .line 58
    goto :goto_6

    .line 59
    :cond_6
    move-object/from16 v11, p6

    .line 60
    .line 61
    :goto_6
    and-int/lit16 v1, v0, 0x100

    .line 62
    .line 63
    if-eqz v1, :cond_7

    .line 64
    .line 65
    move v12, v2

    .line 66
    goto :goto_7

    .line 67
    :cond_7
    move v12, v3

    .line 68
    :goto_7
    and-int/lit16 v1, v0, 0x200

    .line 69
    .line 70
    if-eqz v1, :cond_8

    .line 71
    .line 72
    move-object v13, v4

    .line 73
    goto :goto_8

    .line 74
    :cond_8
    move-object/from16 v13, p7

    .line 75
    .line 76
    :goto_8
    and-int/lit16 v0, v0, 0x400

    .line 77
    .line 78
    if-eqz v0, :cond_9

    .line 79
    .line 80
    move-object v14, v4

    .line 81
    goto :goto_9

    .line 82
    :cond_9
    move-object/from16 v14, p8

    .line 83
    .line 84
    :goto_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v4, Len1;

    .line 88
    .line 89
    invoke-direct/range {v4 .. v14}, Len1;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLdn2;Ldn2;)V

    .line 90
    .line 91
    .line 92
    const-string v0, "DialogAlert"

    .line 93
    .line 94
    invoke-static {p0, v4, v0}, Ld8;->a0(Lsu/happ/proxyutility/ui/BaseActivity;Lsn1;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public static n(Ljava/util/List;)Lea4;
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    int-to-long v1, v1

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    int-to-long v3, v3

    .line 12
    const/16 v5, 0x20

    .line 13
    .line 14
    shl-long/2addr v1, v5

    .line 15
    const-wide v6, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v3, v6

    .line 21
    or-long v10, v1, v3

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v0, v0

    .line 28
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    int-to-long v2, v2

    .line 35
    shl-long/2addr v0, v5

    .line 36
    and-long/2addr v2, v6

    .line 37
    or-long v12, v0, v2

    .line 38
    .line 39
    new-instance v8, Lea4;

    .line 40
    .line 41
    move-object v9, p0

    .line 42
    invoke-direct/range {v8 .. v13}, Lea4;-><init>(Ljava/util/List;JJ)V

    .line 43
    .line 44
    .line 45
    return-object v8
.end method


# virtual methods
.method public a()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public b(JJ)J
    .locals 2

    .line 1
    invoke-static {p1, p2, p3, p4}, Lci8;->m(JJ)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-long p1, p1

    .line 10
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-long p3, p0

    .line 15
    const/16 p0, 0x20

    .line 16
    .line 17
    shl-long p0, p1, p0

    .line 18
    .line 19
    const-wide v0, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long p2, p3, v0

    .line 25
    .line 26
    or-long/2addr p0, p2

    .line 27
    sget p2, Lsw6;->a:I

    .line 28
    .line 29
    return-wide p0
.end method

.method public c()Lt14;
    .locals 1

    .line 1
    iget-byte p0, p0, Lbe;->X:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v0, "This method should not be called"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "This method should not be called"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lzr4;I[ILz24;[I)V
    .locals 0

    .line 1
    sget-object p0, Lz24;->X:Lz24;

    .line 2
    .line 3
    if-ne p4, p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    invoke-static {p2, p3, p5, p0}, Lht;->a(I[I[IZ)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p0, 0x1

    .line 11
    invoke-static {p2, p3, p5, p0}, Lht;->a(I[I[IZ)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public e(ILzr4;[I[I)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p1, p3, p4, p0}, Lht;->a(I[I[IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public declared-synchronized h(Ljava/lang/String;)Lwr0;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    sget-object v0, Lwr0;->d:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lwr0;

    .line 12
    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    const-string v1, "SSL_"

    .line 16
    .line 17
    const-string v2, "TLS_"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {p1, v3, v2}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v5, 0x4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p1, v3, v1}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v1, p1

    .line 52
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lwr0;

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    new-instance v1, Lwr0;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Lwr0;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_3
    monitor-exit p0

    .line 72
    return-object v1

    .line 73
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    throw p1
.end method

.method public i(Landroid/content/Context;)Lwp1;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lwp1;->k:Lwp1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    sget-object v0, Lwp1;->k:Lwp1;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lwp1;

    .line 14
    .line 15
    invoke-static {p1}, Lo51;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p1}, Lwp1;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lwp1;->k:Lwp1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :goto_1
    monitor-exit p0

    .line 33
    throw p1

    .line 34
    :cond_1
    return-object v0
.end method

.method public j(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 0

    .line 1
    const/16 p0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, p2, p0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 8
    .line 9
    return-object p0
.end method

.method public l(Ljava/util/List;Lra1;Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lha1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lha1;

    .line 7
    .line 8
    iget v1, v0, Lha1;->j0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lha1;->j0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lha1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lha1;-><init>(Lbe;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lha1;->h0:Ljava/lang/Object;

    .line 26
    .line 27
    iget p3, v0, Lha1;->j0:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x2

    .line 31
    const/4 v3, 0x1

    .line 32
    sget-object v4, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz p3, :cond_3

    .line 35
    .line 36
    if-eq p3, v3, :cond_2

    .line 37
    .line 38
    if-ne p3, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lha1;->g0:Ljava/util/Iterator;

    .line 41
    .line 42
    iget-object p2, v0, Lha1;->f0:Ljava/io/Serializable;

    .line 43
    .line 44
    check-cast p2, Lea6;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_4

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_2
    iget-object p1, v0, Lha1;->f0:Ljava/io/Serializable;

    .line 59
    .line 60
    check-cast p1, Ljava/util/List;

    .line 61
    .line 62
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance p3, Lia1;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-direct {p3, p1, p0, v1, v5}, Lia1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 78
    .line 79
    .line 80
    iput-object p0, v0, Lha1;->f0:Ljava/io/Serializable;

    .line 81
    .line 82
    iput v3, v0, Lha1;->j0:I

    .line 83
    .line 84
    invoke-virtual {p2, p3, v0}, Lra1;->a(Lia1;Ls51;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v4, :cond_4

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move-object p1, p0

    .line 92
    :goto_1
    new-instance p0, Lea6;

    .line 93
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    move-object p2, p0

    .line 102
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_7

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Lgn2;

    .line 113
    .line 114
    :try_start_1
    iput-object p2, v0, Lha1;->f0:Ljava/io/Serializable;

    .line 115
    .line 116
    iput-object p1, v0, Lha1;->g0:Ljava/util/Iterator;

    .line 117
    .line 118
    iput v2, v0, Lha1;->j0:I

    .line 119
    .line 120
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    if-ne p0, v4, :cond_5

    .line 125
    .line 126
    :goto_3
    return-object v4

    .line 127
    :goto_4
    iget-object p3, p2, Lea6;->X:Ljava/lang/Object;

    .line 128
    .line 129
    if-nez p3, :cond_6

    .line 130
    .line 131
    iput-object p0, p2, Lea6;->X:Ljava/lang/Object;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    check-cast p3, Ljava/lang/Throwable;

    .line 135
    .line 136
    invoke-static {p3, p0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    iget-object p0, p2, Lea6;->X:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, Ljava/lang/Throwable;

    .line 143
    .line 144
    if-nez p0, :cond_8

    .line 145
    .line 146
    sget-object p0, Ldn8;->a:Ldn8;

    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_8
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, Lbe;->X:B

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_0
    const-string p0, "CompositionErrorContext"

    .line 12
    .line 13
    return-object p0

    .line 14
    :sswitch_1
    const-string p0, "Empty"

    .line 15
    .line 16
    return-object p0

    .line 17
    :sswitch_2
    const-string p0, "Arrangement#Center"

    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_2
        0xc -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method
