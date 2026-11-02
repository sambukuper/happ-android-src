.class public final Llg7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Llg7;->a:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lsr2;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lmb6;->s0(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lsr2;->X:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Lmb6;->r0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lsr2;->Y:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, Lmb6;->r0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lsr2;->Z:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, Lmb6;->r0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lsr2;->f0:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v3, v1}, Lmb6;->n0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lsr2;->g0:Landroid/os/IBinder;

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v2, 0x5

    .line 46
    invoke-static {p1, v2}, Lmb6;->s0(Landroid/os/Parcel;I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2}, Lmb6;->t0(Landroid/os/Parcel;I)V

    .line 54
    .line 55
    .line 56
    :goto_0
    const/4 v1, 0x6

    .line 57
    iget-object v2, p0, Lsr2;->h0:[Lcom/google/android/gms/common/api/Scope;

    .line 58
    .line 59
    invoke-static {p1, v1, v2, p2}, Lmb6;->o0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x7

    .line 63
    iget-object v2, p0, Lsr2;->i0:Landroid/os/Bundle;

    .line 64
    .line 65
    invoke-static {p1, v1, v2}, Lmb6;->l0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    const/16 v1, 0x8

    .line 69
    .line 70
    iget-object v2, p0, Lsr2;->j0:Landroid/accounts/Account;

    .line 71
    .line 72
    invoke-static {p1, v1, v2, p2}, Lmb6;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 73
    .line 74
    .line 75
    const/16 v1, 0xa

    .line 76
    .line 77
    iget-object v2, p0, Lsr2;->k0:[Lk82;

    .line 78
    .line 79
    invoke-static {p1, v1, v2, p2}, Lmb6;->o0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 80
    .line 81
    .line 82
    const/16 v1, 0xb

    .line 83
    .line 84
    iget-object v2, p0, Lsr2;->l0:[Lk82;

    .line 85
    .line 86
    invoke-static {p1, v1, v2, p2}, Lmb6;->o0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 87
    .line 88
    .line 89
    iget-boolean p2, p0, Lsr2;->m0:Z

    .line 90
    .line 91
    const/16 v1, 0xc

    .line 92
    .line 93
    invoke-static {p1, v1, v3}, Lmb6;->r0(Landroid/os/Parcel;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget p2, p0, Lsr2;->n0:I

    .line 100
    .line 101
    const/16 v1, 0xd

    .line 102
    .line 103
    invoke-static {p1, v1, v3}, Lmb6;->r0(Landroid/os/Parcel;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    iget-boolean p2, p0, Lsr2;->o0:Z

    .line 110
    .line 111
    const/16 v1, 0xe

    .line 112
    .line 113
    invoke-static {p1, v1, v3}, Lmb6;->r0(Landroid/os/Parcel;II)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    .line 118
    .line 119
    const/16 p2, 0xf

    .line 120
    .line 121
    iget-object p0, p0, Lsr2;->p0:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p1, p2, p0}, Lmb6;->n0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v0}, Lmb6;->t0(Landroid/os/Parcel;I)V

    .line 127
    .line 128
    .line 129
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, Llg7;->a:B

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x5

    .line 10
    const/16 v5, 0x8

    .line 11
    .line 12
    const/4 v6, 0x4

    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    move v7, v10

    .line 26
    move-object v2, v11

    .line 27
    move-object v3, v2

    .line 28
    move-object v4, v3

    .line 29
    move-object v5, v4

    .line 30
    move-object v6, v5

    .line 31
    move-object v8, v6

    .line 32
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    if-ge v9, v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    int-to-char v10, v9

    .line 43
    packed-switch v10, :pswitch_data_1

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v9}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_0
    invoke-static {v1, v9}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    goto :goto_0

    .line 55
    :pswitch_1
    invoke-static {v1, v9}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    goto :goto_0

    .line 60
    :pswitch_2
    invoke-static {v1, v9}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    goto :goto_0

    .line 65
    :pswitch_3
    invoke-static {v1, v9}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    goto :goto_0

    .line 70
    :pswitch_4
    invoke-static {v1, v9}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    goto :goto_0

    .line 75
    :pswitch_5
    invoke-static {v1, v9}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    goto :goto_0

    .line 80
    :pswitch_6
    invoke-static {v1, v9}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Loc6;

    .line 89
    .line 90
    invoke-direct/range {v1 .. v8}, Loc6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :pswitch_7
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    new-instance v2, Landroid/os/Bundle;

    .line 99
    .line 100
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 101
    .line 102
    .line 103
    sget-object v3, Lsr2;->q0:[Lcom/google/android/gms/common/api/Scope;

    .line 104
    .line 105
    sget-object v4, Lsr2;->r0:[Lk82;

    .line 106
    .line 107
    move-object/from16 v19, v2

    .line 108
    .line 109
    move-object/from16 v18, v3

    .line 110
    .line 111
    move-object/from16 v21, v4

    .line 112
    .line 113
    move-object/from16 v22, v21

    .line 114
    .line 115
    move v13, v10

    .line 116
    move v14, v13

    .line 117
    move v15, v14

    .line 118
    move/from16 v23, v15

    .line 119
    .line 120
    move/from16 v24, v23

    .line 121
    .line 122
    move/from16 v25, v24

    .line 123
    .line 124
    move-object/from16 v16, v11

    .line 125
    .line 126
    move-object/from16 v17, v16

    .line 127
    .line 128
    move-object/from16 v20, v17

    .line 129
    .line 130
    move-object/from16 v26, v20

    .line 131
    .line 132
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-ge v2, v0, :cond_2

    .line 137
    .line 138
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    int-to-char v3, v2

    .line 143
    packed-switch v3, :pswitch_data_2

    .line 144
    .line 145
    .line 146
    :pswitch_8
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :pswitch_9
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v26

    .line 154
    goto :goto_1

    .line 155
    :pswitch_a
    invoke-static {v1, v2}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 156
    .line 157
    .line 158
    move-result v25

    .line 159
    goto :goto_1

    .line 160
    :pswitch_b
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 161
    .line 162
    .line 163
    move-result v24

    .line 164
    goto :goto_1

    .line 165
    :pswitch_c
    invoke-static {v1, v2}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 166
    .line 167
    .line 168
    move-result v23

    .line 169
    goto :goto_1

    .line 170
    :pswitch_d
    sget-object v3, Lk82;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 171
    .line 172
    invoke-static {v1, v2, v3}, Lhi5;->V(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    move-object/from16 v22, v2

    .line 177
    .line 178
    check-cast v22, [Lk82;

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :pswitch_e
    sget-object v3, Lk82;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 182
    .line 183
    invoke-static {v1, v2, v3}, Lhi5;->V(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    move-object/from16 v21, v2

    .line 188
    .line 189
    check-cast v21, [Lk82;

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :pswitch_f
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 193
    .line 194
    invoke-static {v1, v2, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move-object/from16 v20, v2

    .line 199
    .line 200
    check-cast v20, Landroid/accounts/Account;

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :pswitch_10
    invoke-static {v1, v2}, Lhi5;->S(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 204
    .line 205
    .line 206
    move-result-object v19

    .line 207
    goto :goto_1

    .line 208
    :pswitch_11
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 209
    .line 210
    invoke-static {v1, v2, v3}, Lhi5;->V(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    move-object/from16 v18, v2

    .line 215
    .line 216
    check-cast v18, [Lcom/google/android/gms/common/api/Scope;

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :pswitch_12
    invoke-static {v1, v2}, Lhi5;->v0(Landroid/os/Parcel;I)I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-nez v2, :cond_1

    .line 228
    .line 229
    move-object/from16 v17, v11

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    add-int/2addr v3, v2

    .line 237
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 238
    .line 239
    .line 240
    move-object/from16 v17, v4

    .line 241
    .line 242
    goto :goto_1

    .line 243
    :pswitch_13
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v16

    .line 247
    goto :goto_1

    .line 248
    :pswitch_14
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 249
    .line 250
    .line 251
    move-result v15

    .line 252
    goto :goto_1

    .line 253
    :pswitch_15
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    goto :goto_1

    .line 258
    :pswitch_16
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 259
    .line 260
    .line 261
    move-result v13

    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :cond_2
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 265
    .line 266
    .line 267
    new-instance v12, Lsr2;

    .line 268
    .line 269
    invoke-direct/range {v12 .. v26}, Lsr2;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lk82;[Lk82;ZIZLjava/lang/String;)V

    .line 270
    .line 271
    .line 272
    return-object v12

    .line 273
    :pswitch_17
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    move v3, v10

    .line 278
    move v4, v3

    .line 279
    move v6, v4

    .line 280
    move-object v2, v11

    .line 281
    move-object v5, v2

    .line 282
    move-object v7, v5

    .line 283
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    if-ge v8, v0, :cond_5

    .line 288
    .line 289
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    int-to-char v9, v8

    .line 294
    packed-switch v9, :pswitch_data_3

    .line 295
    .line 296
    .line 297
    invoke-static {v1, v8}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 298
    .line 299
    .line 300
    goto :goto_2

    .line 301
    :pswitch_18
    invoke-static {v1, v8}, Lhi5;->v0(Landroid/os/Parcel;I)I

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    if-nez v7, :cond_3

    .line 310
    .line 311
    move-object v7, v11

    .line 312
    goto :goto_2

    .line 313
    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    add-int/2addr v8, v7

    .line 318
    invoke-virtual {v1, v8}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 319
    .line 320
    .line 321
    move-object v7, v9

    .line 322
    goto :goto_2

    .line 323
    :pswitch_19
    invoke-static {v1, v8}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    goto :goto_2

    .line 328
    :pswitch_1a
    invoke-static {v1, v8}, Lhi5;->v0(Landroid/os/Parcel;I)I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    if-nez v5, :cond_4

    .line 337
    .line 338
    move-object v5, v11

    .line 339
    goto :goto_2

    .line 340
    :cond_4
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    add-int/2addr v8, v5

    .line 345
    invoke-virtual {v1, v8}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 346
    .line 347
    .line 348
    move-object v5, v9

    .line 349
    goto :goto_2

    .line 350
    :pswitch_1b
    invoke-static {v1, v8}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    goto :goto_2

    .line 355
    :pswitch_1c
    invoke-static {v1, v8}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    goto :goto_2

    .line 360
    :pswitch_1d
    sget-object v2, Lxl6;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 361
    .line 362
    invoke-static {v1, v8, v2}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    check-cast v2, Lxl6;

    .line 367
    .line 368
    goto :goto_2

    .line 369
    :cond_5
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 370
    .line 371
    .line 372
    new-instance v1, Lc21;

    .line 373
    .line 374
    invoke-direct/range {v1 .. v7}, Lc21;-><init>(Lxl6;ZZ[II[I)V

    .line 375
    .line 376
    .line 377
    return-object v1

    .line 378
    :pswitch_1e
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    move-object v2, v11

    .line 383
    move-object v3, v2

    .line 384
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-ge v4, v0, :cond_a

    .line 389
    .line 390
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    int-to-char v5, v4

    .line 395
    if-eq v5, v9, :cond_9

    .line 396
    .line 397
    if-eq v5, v8, :cond_8

    .line 398
    .line 399
    if-eq v5, v7, :cond_7

    .line 400
    .line 401
    if-eq v5, v6, :cond_6

    .line 402
    .line 403
    invoke-static {v1, v4}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 404
    .line 405
    .line 406
    goto :goto_3

    .line 407
    :cond_6
    sget-object v3, Lc21;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 408
    .line 409
    invoke-static {v1, v4, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    check-cast v3, Lc21;

    .line 414
    .line 415
    goto :goto_3

    .line 416
    :cond_7
    invoke-static {v1, v4}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    goto :goto_3

    .line 421
    :cond_8
    sget-object v2, Lk82;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 422
    .line 423
    invoke-static {v1, v4, v2}, Lhi5;->V(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    check-cast v2, [Lk82;

    .line 428
    .line 429
    goto :goto_3

    .line 430
    :cond_9
    invoke-static {v1, v4}, Lhi5;->S(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    goto :goto_3

    .line 435
    :cond_a
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 436
    .line 437
    .line 438
    new-instance v0, Lqa9;

    .line 439
    .line 440
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 441
    .line 442
    .line 443
    iput-object v11, v0, Lqa9;->X:Landroid/os/Bundle;

    .line 444
    .line 445
    iput-object v2, v0, Lqa9;->Y:[Lk82;

    .line 446
    .line 447
    iput v10, v0, Lqa9;->Z:I

    .line 448
    .line 449
    iput-object v3, v0, Lqa9;->f0:Lc21;

    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_1f
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    move-object v2, v11

    .line 457
    move-object v3, v2

    .line 458
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-ge v4, v0, :cond_f

    .line 463
    .line 464
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    int-to-char v5, v4

    .line 469
    if-eq v5, v9, :cond_e

    .line 470
    .line 471
    if-eq v5, v8, :cond_d

    .line 472
    .line 473
    if-eq v5, v7, :cond_c

    .line 474
    .line 475
    if-eq v5, v6, :cond_b

    .line 476
    .line 477
    invoke-static {v1, v4}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 478
    .line 479
    .line 480
    goto :goto_4

    .line 481
    :cond_b
    sget-object v3, Lx11;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 482
    .line 483
    invoke-static {v1, v4, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Lx11;

    .line 488
    .line 489
    goto :goto_4

    .line 490
    :cond_c
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 491
    .line 492
    invoke-static {v1, v4, v2}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    check-cast v2, Landroid/app/PendingIntent;

    .line 497
    .line 498
    goto :goto_4

    .line 499
    :cond_d
    invoke-static {v1, v4}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v11

    .line 503
    goto :goto_4

    .line 504
    :cond_e
    invoke-static {v1, v4}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    goto :goto_4

    .line 509
    :cond_f
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 510
    .line 511
    .line 512
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 513
    .line 514
    invoke-direct {v0, v10, v11, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lx11;)V

    .line 515
    .line 516
    .line 517
    return-object v0

    .line 518
    :pswitch_20
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    if-ge v2, v0, :cond_12

    .line 527
    .line 528
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    int-to-char v3, v2

    .line 533
    if-eq v3, v9, :cond_11

    .line 534
    .line 535
    if-eq v3, v8, :cond_10

    .line 536
    .line 537
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 538
    .line 539
    .line 540
    goto :goto_5

    .line 541
    :cond_10
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v11

    .line 545
    goto :goto_5

    .line 546
    :cond_11
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 547
    .line 548
    .line 549
    move-result v10

    .line 550
    goto :goto_5

    .line 551
    :cond_12
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 552
    .line 553
    .line 554
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    .line 555
    .line 556
    invoke-direct {v0, v10, v11}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 557
    .line 558
    .line 559
    return-object v0

    .line 560
    :pswitch_21
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    move v4, v9

    .line 565
    move v2, v10

    .line 566
    move v3, v2

    .line 567
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    if-ge v5, v0, :cond_17

    .line 572
    .line 573
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 574
    .line 575
    .line 576
    move-result v5

    .line 577
    int-to-char v11, v5

    .line 578
    if-eq v11, v9, :cond_16

    .line 579
    .line 580
    if-eq v11, v8, :cond_15

    .line 581
    .line 582
    if-eq v11, v7, :cond_14

    .line 583
    .line 584
    if-eq v11, v6, :cond_13

    .line 585
    .line 586
    invoke-static {v1, v5}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 587
    .line 588
    .line 589
    goto :goto_6

    .line 590
    :cond_13
    invoke-static {v1, v5}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    goto :goto_6

    .line 595
    :cond_14
    invoke-static {v1, v5}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    goto :goto_6

    .line 600
    :cond_15
    invoke-static {v1, v5}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    goto :goto_6

    .line 605
    :cond_16
    invoke-static {v1, v5}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 606
    .line 607
    .line 608
    move-result v10

    .line 609
    goto :goto_6

    .line 610
    :cond_17
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 611
    .line 612
    .line 613
    new-instance v0, Lzx0;

    .line 614
    .line 615
    invoke-direct {v0, v10, v2, v3, v4}, Lzx0;-><init>(IIIZ)V

    .line 616
    .line 617
    .line 618
    return-object v0

    .line 619
    :pswitch_22
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    new-instance v1, Lha9;

    .line 624
    .line 625
    invoke-direct {v1, v0}, Lha9;-><init>(Landroid/os/IBinder;)V

    .line 626
    .line 627
    .line 628
    return-object v1

    .line 629
    :pswitch_23
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    const-wide/16 v2, -0x1

    .line 634
    .line 635
    move-wide v13, v2

    .line 636
    move/from16 v16, v10

    .line 637
    .line 638
    move/from16 v17, v16

    .line 639
    .line 640
    move-object v15, v11

    .line 641
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    if-ge v2, v0, :cond_1c

    .line 646
    .line 647
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    int-to-char v3, v2

    .line 652
    if-eq v3, v9, :cond_1b

    .line 653
    .line 654
    if-eq v3, v8, :cond_1a

    .line 655
    .line 656
    if-eq v3, v7, :cond_19

    .line 657
    .line 658
    if-eq v3, v6, :cond_18

    .line 659
    .line 660
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 661
    .line 662
    .line 663
    goto :goto_7

    .line 664
    :cond_18
    invoke-static {v1, v2}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    move/from16 v16, v2

    .line 669
    .line 670
    goto :goto_7

    .line 671
    :cond_19
    invoke-static {v1, v2, v5}, Lhi5;->D0(Landroid/os/Parcel;II)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 675
    .line 676
    .line 677
    move-result-wide v2

    .line 678
    move-wide v13, v2

    .line 679
    goto :goto_7

    .line 680
    :cond_1a
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    move/from16 v17, v2

    .line 685
    .line 686
    goto :goto_7

    .line 687
    :cond_1b
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    move-object v15, v2

    .line 692
    goto :goto_7

    .line 693
    :cond_1c
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 694
    .line 695
    .line 696
    new-instance v12, Lk82;

    .line 697
    .line 698
    invoke-direct/range {v12 .. v17}, Lk82;-><init>(JLjava/lang/String;ZI)V

    .line 699
    .line 700
    .line 701
    return-object v12

    .line 702
    :pswitch_24
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    move v12, v10

    .line 707
    move v13, v12

    .line 708
    move v14, v13

    .line 709
    move v15, v14

    .line 710
    move/from16 v16, v15

    .line 711
    .line 712
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 713
    .line 714
    .line 715
    move-result v2

    .line 716
    if-ge v2, v0, :cond_22

    .line 717
    .line 718
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 719
    .line 720
    .line 721
    move-result v2

    .line 722
    int-to-char v3, v2

    .line 723
    if-eq v3, v9, :cond_21

    .line 724
    .line 725
    if-eq v3, v8, :cond_20

    .line 726
    .line 727
    if-eq v3, v7, :cond_1f

    .line 728
    .line 729
    if-eq v3, v6, :cond_1e

    .line 730
    .line 731
    if-eq v3, v4, :cond_1d

    .line 732
    .line 733
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 734
    .line 735
    .line 736
    goto :goto_8

    .line 737
    :cond_1d
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 738
    .line 739
    .line 740
    move-result v16

    .line 741
    goto :goto_8

    .line 742
    :cond_1e
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 743
    .line 744
    .line 745
    move-result v15

    .line 746
    goto :goto_8

    .line 747
    :cond_1f
    invoke-static {v1, v2}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 748
    .line 749
    .line 750
    move-result v14

    .line 751
    goto :goto_8

    .line 752
    :cond_20
    invoke-static {v1, v2}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 753
    .line 754
    .line 755
    move-result v13

    .line 756
    goto :goto_8

    .line 757
    :cond_21
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 758
    .line 759
    .line 760
    move-result v12

    .line 761
    goto :goto_8

    .line 762
    :cond_22
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 763
    .line 764
    .line 765
    new-instance v11, Lxl6;

    .line 766
    .line 767
    invoke-direct/range {v11 .. v16}, Lxl6;-><init>(IZZII)V

    .line 768
    .line 769
    .line 770
    return-object v11

    .line 771
    :pswitch_25
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 772
    .line 773
    .line 774
    move-result v0

    .line 775
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 776
    .line 777
    .line 778
    move-result v2

    .line 779
    if-ge v2, v0, :cond_24

    .line 780
    .line 781
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 782
    .line 783
    .line 784
    move-result v2

    .line 785
    int-to-char v3, v2

    .line 786
    if-eq v3, v9, :cond_23

    .line 787
    .line 788
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 789
    .line 790
    .line 791
    goto :goto_9

    .line 792
    :cond_23
    sget-object v3, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 793
    .line 794
    invoke-static {v1, v2, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    move-object v11, v2

    .line 799
    check-cast v11, Landroid/content/Intent;

    .line 800
    .line 801
    goto :goto_9

    .line 802
    :cond_24
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 803
    .line 804
    .line 805
    new-instance v0, Lav0;

    .line 806
    .line 807
    invoke-direct {v0, v11}, Lav0;-><init>(Landroid/content/Intent;)V

    .line 808
    .line 809
    .line 810
    return-object v0

    .line 811
    :pswitch_26
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 812
    .line 813
    .line 814
    move-result v0

    .line 815
    move v13, v10

    .line 816
    move v14, v13

    .line 817
    move-object v15, v11

    .line 818
    move-object/from16 v16, v15

    .line 819
    .line 820
    move-object/from16 v17, v16

    .line 821
    .line 822
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    if-ge v2, v0, :cond_2c

    .line 827
    .line 828
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    int-to-char v3, v2

    .line 833
    if-eq v3, v9, :cond_2b

    .line 834
    .line 835
    if-eq v3, v8, :cond_2a

    .line 836
    .line 837
    if-eq v3, v7, :cond_29

    .line 838
    .line 839
    if-eq v3, v6, :cond_28

    .line 840
    .line 841
    if-eq v3, v4, :cond_25

    .line 842
    .line 843
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 844
    .line 845
    .line 846
    goto :goto_a

    .line 847
    :cond_25
    invoke-static {v1, v2}, Lhi5;->v0(Landroid/os/Parcel;I)I

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    if-nez v2, :cond_26

    .line 852
    .line 853
    move-object/from16 v17, v11

    .line 854
    .line 855
    goto :goto_a

    .line 856
    :cond_26
    if-ne v2, v6, :cond_27

    .line 857
    .line 858
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 859
    .line 860
    .line 861
    move-result v2

    .line 862
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    move-object/from16 v17, v2

    .line 867
    .line 868
    goto :goto_a

    .line 869
    :cond_27
    new-instance v0, Lav6;

    .line 870
    .line 871
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 880
    .line 881
    .line 882
    move-result v4

    .line 883
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v5

    .line 887
    add-int/lit8 v4, v4, 0x13

    .line 888
    .line 889
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 890
    .line 891
    .line 892
    move-result v5

    .line 893
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v7

    .line 897
    add-int/2addr v4, v5

    .line 898
    add-int/2addr v4, v6

    .line 899
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 900
    .line 901
    .line 902
    move-result v5

    .line 903
    add-int/2addr v5, v4

    .line 904
    add-int/2addr v5, v9

    .line 905
    new-instance v4, Ljava/lang/StringBuilder;

    .line 906
    .line 907
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 908
    .line 909
    .line 910
    const-string v5, "Expected size 4 got "

    .line 911
    .line 912
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 916
    .line 917
    .line 918
    const-string v2, " (0x"

    .line 919
    .line 920
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    const-string v2, ")"

    .line 927
    .line 928
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    invoke-direct {v0, v2, v1}, Lav6;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 936
    .line 937
    .line 938
    throw v0

    .line 939
    :cond_28
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v16

    .line 943
    goto :goto_a

    .line 944
    :cond_29
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 945
    .line 946
    invoke-static {v1, v2, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 947
    .line 948
    .line 949
    move-result-object v2

    .line 950
    move-object v15, v2

    .line 951
    check-cast v15, Landroid/app/PendingIntent;

    .line 952
    .line 953
    goto/16 :goto_a

    .line 954
    .line 955
    :cond_2a
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 956
    .line 957
    .line 958
    move-result v14

    .line 959
    goto/16 :goto_a

    .line 960
    .line 961
    :cond_2b
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 962
    .line 963
    .line 964
    move-result v13

    .line 965
    goto/16 :goto_a

    .line 966
    .line 967
    :cond_2c
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 968
    .line 969
    .line 970
    new-instance v12, Lx11;

    .line 971
    .line 972
    invoke-direct/range {v12 .. v17}, Lx11;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 973
    .line 974
    .line 975
    return-object v12

    .line 976
    :pswitch_27
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 977
    .line 978
    .line 979
    move-result v0

    .line 980
    move v13, v10

    .line 981
    move/from16 v16, v13

    .line 982
    .line 983
    move/from16 v17, v16

    .line 984
    .line 985
    move-object v14, v11

    .line 986
    move-object v15, v14

    .line 987
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 988
    .line 989
    .line 990
    move-result v2

    .line 991
    if-ge v2, v0, :cond_33

    .line 992
    .line 993
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 994
    .line 995
    .line 996
    move-result v2

    .line 997
    int-to-char v3, v2

    .line 998
    if-eq v3, v9, :cond_32

    .line 999
    .line 1000
    if-eq v3, v8, :cond_30

    .line 1001
    .line 1002
    if-eq v3, v7, :cond_2f

    .line 1003
    .line 1004
    if-eq v3, v6, :cond_2e

    .line 1005
    .line 1006
    if-eq v3, v4, :cond_2d

    .line 1007
    .line 1008
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_b

    .line 1012
    :cond_2d
    invoke-static {v1, v2}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v17

    .line 1016
    goto :goto_b

    .line 1017
    :cond_2e
    invoke-static {v1, v2}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v16

    .line 1021
    goto :goto_b

    .line 1022
    :cond_2f
    sget-object v3, Lx11;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1023
    .line 1024
    invoke-static {v1, v2, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v2

    .line 1028
    move-object v15, v2

    .line 1029
    check-cast v15, Lx11;

    .line 1030
    .line 1031
    goto :goto_b

    .line 1032
    :cond_30
    invoke-static {v1, v2}, Lhi5;->v0(Landroid/os/Parcel;I)I

    .line 1033
    .line 1034
    .line 1035
    move-result v2

    .line 1036
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1037
    .line 1038
    .line 1039
    move-result v3

    .line 1040
    if-nez v2, :cond_31

    .line 1041
    .line 1042
    move-object v14, v11

    .line 1043
    goto :goto_b

    .line 1044
    :cond_31
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v5

    .line 1048
    add-int/2addr v3, v2

    .line 1049
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1050
    .line 1051
    .line 1052
    move-object v14, v5

    .line 1053
    goto :goto_b

    .line 1054
    :cond_32
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1055
    .line 1056
    .line 1057
    move-result v13

    .line 1058
    goto :goto_b

    .line 1059
    :cond_33
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1060
    .line 1061
    .line 1062
    new-instance v12, Lk99;

    .line 1063
    .line 1064
    invoke-direct/range {v12 .. v17}, Lk99;-><init>(ILandroid/os/IBinder;Lx11;ZZ)V

    .line 1065
    .line 1066
    .line 1067
    return-object v12

    .line 1068
    :pswitch_28
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 1069
    .line 1070
    .line 1071
    move-result v0

    .line 1072
    move v2, v10

    .line 1073
    move-object v3, v11

    .line 1074
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1075
    .line 1076
    .line 1077
    move-result v4

    .line 1078
    if-ge v4, v0, :cond_38

    .line 1079
    .line 1080
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1081
    .line 1082
    .line 1083
    move-result v4

    .line 1084
    int-to-char v5, v4

    .line 1085
    if-eq v5, v9, :cond_37

    .line 1086
    .line 1087
    if-eq v5, v8, :cond_36

    .line 1088
    .line 1089
    if-eq v5, v7, :cond_35

    .line 1090
    .line 1091
    if-eq v5, v6, :cond_34

    .line 1092
    .line 1093
    invoke-static {v1, v4}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_c

    .line 1097
    :cond_34
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1098
    .line 1099
    invoke-static {v1, v4, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v3

    .line 1103
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1104
    .line 1105
    goto :goto_c

    .line 1106
    :cond_35
    invoke-static {v1, v4}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1107
    .line 1108
    .line 1109
    move-result v2

    .line 1110
    goto :goto_c

    .line 1111
    :cond_36
    sget-object v5, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1112
    .line 1113
    invoke-static {v1, v4, v5}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v4

    .line 1117
    move-object v11, v4

    .line 1118
    check-cast v11, Landroid/accounts/Account;

    .line 1119
    .line 1120
    goto :goto_c

    .line 1121
    :cond_37
    invoke-static {v1, v4}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1122
    .line 1123
    .line 1124
    move-result v10

    .line 1125
    goto :goto_c

    .line 1126
    :cond_38
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1127
    .line 1128
    .line 1129
    new-instance v0, Lj99;

    .line 1130
    .line 1131
    invoke-direct {v0, v10, v11, v2, v3}, Lj99;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 1132
    .line 1133
    .line 1134
    return-object v0

    .line 1135
    :pswitch_29
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 1136
    .line 1137
    .line 1138
    move-result v0

    .line 1139
    const/4 v4, -0x1

    .line 1140
    move-wide/from16 v16, v2

    .line 1141
    .line 1142
    move-wide/from16 v18, v16

    .line 1143
    .line 1144
    move/from16 v23, v4

    .line 1145
    .line 1146
    move v13, v10

    .line 1147
    move v14, v13

    .line 1148
    move v15, v14

    .line 1149
    move/from16 v22, v15

    .line 1150
    .line 1151
    move-object/from16 v20, v11

    .line 1152
    .line 1153
    move-object/from16 v21, v20

    .line 1154
    .line 1155
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1156
    .line 1157
    .line 1158
    move-result v2

    .line 1159
    if-ge v2, v0, :cond_39

    .line 1160
    .line 1161
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1162
    .line 1163
    .line 1164
    move-result v2

    .line 1165
    int-to-char v3, v2

    .line 1166
    packed-switch v3, :pswitch_data_4

    .line 1167
    .line 1168
    .line 1169
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1170
    .line 1171
    .line 1172
    goto :goto_d

    .line 1173
    :pswitch_2a
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1174
    .line 1175
    .line 1176
    move-result v2

    .line 1177
    move/from16 v23, v2

    .line 1178
    .line 1179
    goto :goto_d

    .line 1180
    :pswitch_2b
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1181
    .line 1182
    .line 1183
    move-result v2

    .line 1184
    move/from16 v22, v2

    .line 1185
    .line 1186
    goto :goto_d

    .line 1187
    :pswitch_2c
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    move-object/from16 v21, v2

    .line 1192
    .line 1193
    goto :goto_d

    .line 1194
    :pswitch_2d
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v2

    .line 1198
    move-object/from16 v20, v2

    .line 1199
    .line 1200
    goto :goto_d

    .line 1201
    :pswitch_2e
    invoke-static {v1, v2, v5}, Lhi5;->D0(Landroid/os/Parcel;II)V

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1205
    .line 1206
    .line 1207
    move-result-wide v2

    .line 1208
    move-wide/from16 v18, v2

    .line 1209
    .line 1210
    goto :goto_d

    .line 1211
    :pswitch_2f
    invoke-static {v1, v2, v5}, Lhi5;->D0(Landroid/os/Parcel;II)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1215
    .line 1216
    .line 1217
    move-result-wide v2

    .line 1218
    move-wide/from16 v16, v2

    .line 1219
    .line 1220
    goto :goto_d

    .line 1221
    :pswitch_30
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1222
    .line 1223
    .line 1224
    move-result v2

    .line 1225
    move v15, v2

    .line 1226
    goto :goto_d

    .line 1227
    :pswitch_31
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1228
    .line 1229
    .line 1230
    move-result v2

    .line 1231
    move v14, v2

    .line 1232
    goto :goto_d

    .line 1233
    :pswitch_32
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1234
    .line 1235
    .line 1236
    move-result v2

    .line 1237
    move v13, v2

    .line 1238
    goto :goto_d

    .line 1239
    :cond_39
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1240
    .line 1241
    .line 1242
    new-instance v12, Lov4;

    .line 1243
    .line 1244
    invoke-direct/range {v12 .. v23}, Lov4;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 1245
    .line 1246
    .line 1247
    return-object v12

    .line 1248
    :pswitch_33
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 1249
    .line 1250
    .line 1251
    move-result v0

    .line 1252
    move-object v2, v11

    .line 1253
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1254
    .line 1255
    .line 1256
    move-result v3

    .line 1257
    if-ge v3, v0, :cond_3d

    .line 1258
    .line 1259
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1260
    .line 1261
    .line 1262
    move-result v3

    .line 1263
    int-to-char v4, v3

    .line 1264
    if-eq v4, v9, :cond_3c

    .line 1265
    .line 1266
    if-eq v4, v8, :cond_3b

    .line 1267
    .line 1268
    if-eq v4, v7, :cond_3a

    .line 1269
    .line 1270
    invoke-static {v1, v3}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1271
    .line 1272
    .line 1273
    goto :goto_e

    .line 1274
    :cond_3a
    sget-object v2, Lk99;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1275
    .line 1276
    invoke-static {v1, v3, v2}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    check-cast v2, Lk99;

    .line 1281
    .line 1282
    goto :goto_e

    .line 1283
    :cond_3b
    sget-object v4, Lx11;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1284
    .line 1285
    invoke-static {v1, v3, v4}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v3

    .line 1289
    move-object v11, v3

    .line 1290
    check-cast v11, Lx11;

    .line 1291
    .line 1292
    goto :goto_e

    .line 1293
    :cond_3c
    invoke-static {v1, v3}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1294
    .line 1295
    .line 1296
    move-result v10

    .line 1297
    goto :goto_e

    .line 1298
    :cond_3d
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1299
    .line 1300
    .line 1301
    new-instance v0, Le99;

    .line 1302
    .line 1303
    invoke-direct {v0, v10, v11, v2}, Le99;-><init>(ILx11;Lk99;)V

    .line 1304
    .line 1305
    .line 1306
    return-object v0

    .line 1307
    :pswitch_34
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 1308
    .line 1309
    .line 1310
    move-result v0

    .line 1311
    move-object v2, v11

    .line 1312
    move-object v3, v2

    .line 1313
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1314
    .line 1315
    .line 1316
    move-result v4

    .line 1317
    if-ge v4, v0, :cond_41

    .line 1318
    .line 1319
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1320
    .line 1321
    .line 1322
    move-result v4

    .line 1323
    int-to-char v5, v4

    .line 1324
    if-eq v5, v9, :cond_3f

    .line 1325
    .line 1326
    if-eq v5, v8, :cond_3e

    .line 1327
    .line 1328
    invoke-static {v1, v4}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_f

    .line 1332
    :cond_3e
    invoke-static {v1, v4}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v3

    .line 1336
    goto :goto_f

    .line 1337
    :cond_3f
    invoke-static {v1, v4}, Lhi5;->v0(Landroid/os/Parcel;I)I

    .line 1338
    .line 1339
    .line 1340
    move-result v2

    .line 1341
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1342
    .line 1343
    .line 1344
    move-result v4

    .line 1345
    if-nez v2, :cond_40

    .line 1346
    .line 1347
    move-object v2, v11

    .line 1348
    goto :goto_f

    .line 1349
    :cond_40
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v5

    .line 1353
    add-int/2addr v4, v2

    .line 1354
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1355
    .line 1356
    .line 1357
    move-object v2, v5

    .line 1358
    goto :goto_f

    .line 1359
    :cond_41
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1360
    .line 1361
    .line 1362
    new-instance v0, Lw89;

    .line 1363
    .line 1364
    invoke-direct {v0, v3, v2}, Lw89;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1365
    .line 1366
    .line 1367
    return-object v0

    .line 1368
    :pswitch_35
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 1369
    .line 1370
    .line 1371
    move-result v0

    .line 1372
    move-wide v15, v2

    .line 1373
    move v13, v10

    .line 1374
    move/from16 v17, v13

    .line 1375
    .line 1376
    move/from16 v18, v17

    .line 1377
    .line 1378
    move-object v14, v11

    .line 1379
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1380
    .line 1381
    .line 1382
    move-result v2

    .line 1383
    if-ge v2, v0, :cond_47

    .line 1384
    .line 1385
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1386
    .line 1387
    .line 1388
    move-result v2

    .line 1389
    int-to-char v3, v2

    .line 1390
    if-eq v3, v9, :cond_46

    .line 1391
    .line 1392
    if-eq v3, v8, :cond_45

    .line 1393
    .line 1394
    if-eq v3, v7, :cond_44

    .line 1395
    .line 1396
    if-eq v3, v6, :cond_43

    .line 1397
    .line 1398
    if-eq v3, v4, :cond_42

    .line 1399
    .line 1400
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1401
    .line 1402
    .line 1403
    goto :goto_10

    .line 1404
    :cond_42
    invoke-static {v1, v2}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 1405
    .line 1406
    .line 1407
    move-result v2

    .line 1408
    move/from16 v18, v2

    .line 1409
    .line 1410
    goto :goto_10

    .line 1411
    :cond_43
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1412
    .line 1413
    .line 1414
    move-result v2

    .line 1415
    move/from16 v17, v2

    .line 1416
    .line 1417
    goto :goto_10

    .line 1418
    :cond_44
    invoke-static {v1, v2, v5}, Lhi5;->D0(Landroid/os/Parcel;II)V

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1422
    .line 1423
    .line 1424
    move-result-wide v2

    .line 1425
    move-wide v15, v2

    .line 1426
    goto :goto_10

    .line 1427
    :cond_45
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v2

    .line 1431
    move-object v14, v2

    .line 1432
    goto :goto_10

    .line 1433
    :cond_46
    invoke-static {v1, v2}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1434
    .line 1435
    .line 1436
    move-result v2

    .line 1437
    move v13, v2

    .line 1438
    goto :goto_10

    .line 1439
    :cond_47
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1440
    .line 1441
    .line 1442
    new-instance v12, Le89;

    .line 1443
    .line 1444
    invoke-direct/range {v12 .. v18}, Le89;-><init>(ILjava/lang/String;JIZ)V

    .line 1445
    .line 1446
    .line 1447
    return-object v12

    .line 1448
    :pswitch_36
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 1449
    .line 1450
    .line 1451
    move-result v0

    .line 1452
    move-wide/from16 v19, v2

    .line 1453
    .line 1454
    move-object v13, v11

    .line 1455
    move-object v14, v13

    .line 1456
    move-object v15, v14

    .line 1457
    move-object/from16 v16, v15

    .line 1458
    .line 1459
    move-object/from16 v17, v16

    .line 1460
    .line 1461
    move-object/from16 v18, v17

    .line 1462
    .line 1463
    move-object/from16 v21, v18

    .line 1464
    .line 1465
    move-object/from16 v22, v21

    .line 1466
    .line 1467
    move-object/from16 v23, v22

    .line 1468
    .line 1469
    move-object/from16 v24, v23

    .line 1470
    .line 1471
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1472
    .line 1473
    .line 1474
    move-result v2

    .line 1475
    if-ge v2, v0, :cond_49

    .line 1476
    .line 1477
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1478
    .line 1479
    .line 1480
    move-result v2

    .line 1481
    int-to-char v3, v2

    .line 1482
    packed-switch v3, :pswitch_data_5

    .line 1483
    .line 1484
    .line 1485
    invoke-static {v1, v2}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1486
    .line 1487
    .line 1488
    goto :goto_11

    .line 1489
    :pswitch_37
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v24

    .line 1493
    goto :goto_11

    .line 1494
    :pswitch_38
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v23

    .line 1498
    goto :goto_11

    .line 1499
    :pswitch_39
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1500
    .line 1501
    invoke-static {v1, v2}, Lhi5;->v0(Landroid/os/Parcel;I)I

    .line 1502
    .line 1503
    .line 1504
    move-result v2

    .line 1505
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1506
    .line 1507
    .line 1508
    move-result v4

    .line 1509
    if-nez v2, :cond_48

    .line 1510
    .line 1511
    move-object/from16 v22, v11

    .line 1512
    .line 1513
    goto :goto_11

    .line 1514
    :cond_48
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v3

    .line 1518
    add-int/2addr v4, v2

    .line 1519
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1520
    .line 1521
    .line 1522
    move-object/from16 v22, v3

    .line 1523
    .line 1524
    goto :goto_11

    .line 1525
    :pswitch_3a
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v21

    .line 1529
    goto :goto_11

    .line 1530
    :pswitch_3b
    invoke-static {v1, v2, v5}, Lhi5;->D0(Landroid/os/Parcel;II)V

    .line 1531
    .line 1532
    .line 1533
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1534
    .line 1535
    .line 1536
    move-result-wide v2

    .line 1537
    move-wide/from16 v19, v2

    .line 1538
    .line 1539
    goto :goto_11

    .line 1540
    :pswitch_3c
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v18

    .line 1544
    goto :goto_11

    .line 1545
    :pswitch_3d
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1546
    .line 1547
    invoke-static {v1, v2, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v2

    .line 1551
    move-object/from16 v17, v2

    .line 1552
    .line 1553
    check-cast v17, Landroid/net/Uri;

    .line 1554
    .line 1555
    goto :goto_11

    .line 1556
    :pswitch_3e
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v16

    .line 1560
    goto :goto_11

    .line 1561
    :pswitch_3f
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v15

    .line 1565
    goto :goto_11

    .line 1566
    :pswitch_40
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v14

    .line 1570
    goto :goto_11

    .line 1571
    :pswitch_41
    invoke-static {v1, v2}, Lhi5;->U(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v13

    .line 1575
    goto :goto_11

    .line 1576
    :cond_49
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1577
    .line 1578
    .line 1579
    new-instance v12, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1580
    .line 1581
    invoke-direct/range {v12 .. v24}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1582
    .line 1583
    .line 1584
    return-object v12

    .line 1585
    :pswitch_42
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 1586
    .line 1587
    .line 1588
    move-result v0

    .line 1589
    move v2, v10

    .line 1590
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1591
    .line 1592
    .line 1593
    move-result v3

    .line 1594
    if-ge v3, v0, :cond_4d

    .line 1595
    .line 1596
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1597
    .line 1598
    .line 1599
    move-result v3

    .line 1600
    int-to-char v4, v3

    .line 1601
    if-eq v4, v9, :cond_4c

    .line 1602
    .line 1603
    if-eq v4, v8, :cond_4b

    .line 1604
    .line 1605
    if-eq v4, v7, :cond_4a

    .line 1606
    .line 1607
    invoke-static {v1, v3}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1608
    .line 1609
    .line 1610
    goto :goto_12

    .line 1611
    :cond_4a
    sget-object v4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1612
    .line 1613
    invoke-static {v1, v3, v4}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v3

    .line 1617
    move-object v11, v3

    .line 1618
    check-cast v11, Landroid/content/Intent;

    .line 1619
    .line 1620
    goto :goto_12

    .line 1621
    :cond_4b
    invoke-static {v1, v3}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1622
    .line 1623
    .line 1624
    move-result v2

    .line 1625
    goto :goto_12

    .line 1626
    :cond_4c
    invoke-static {v1, v3}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1627
    .line 1628
    .line 1629
    move-result v10

    .line 1630
    goto :goto_12

    .line 1631
    :cond_4d
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1632
    .line 1633
    .line 1634
    new-instance v0, La89;

    .line 1635
    .line 1636
    invoke-direct {v0, v10, v2, v11}, La89;-><init>(IILandroid/content/Intent;)V

    .line 1637
    .line 1638
    .line 1639
    return-object v0

    .line 1640
    :pswitch_43
    invoke-static {v1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 1641
    .line 1642
    .line 1643
    move-result v0

    .line 1644
    :goto_13
    move-object v2, v11

    .line 1645
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1646
    .line 1647
    .line 1648
    move-result v3

    .line 1649
    if-ge v3, v0, :cond_51

    .line 1650
    .line 1651
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1652
    .line 1653
    .line 1654
    move-result v3

    .line 1655
    int-to-char v4, v3

    .line 1656
    if-eq v4, v9, :cond_50

    .line 1657
    .line 1658
    if-eq v4, v8, :cond_4e

    .line 1659
    .line 1660
    invoke-static {v1, v3}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 1661
    .line 1662
    .line 1663
    goto :goto_14

    .line 1664
    :cond_4e
    sget-object v2, Lov4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1665
    .line 1666
    invoke-static {v1, v3}, Lhi5;->v0(Landroid/os/Parcel;I)I

    .line 1667
    .line 1668
    .line 1669
    move-result v3

    .line 1670
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1671
    .line 1672
    .line 1673
    move-result v4

    .line 1674
    if-nez v3, :cond_4f

    .line 1675
    .line 1676
    goto :goto_13

    .line 1677
    :cond_4f
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v2

    .line 1681
    add-int/2addr v4, v3

    .line 1682
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1683
    .line 1684
    .line 1685
    goto :goto_14

    .line 1686
    :cond_50
    invoke-static {v1, v3}, Lhi5;->u0(Landroid/os/Parcel;I)I

    .line 1687
    .line 1688
    .line 1689
    move-result v10

    .line 1690
    goto :goto_14

    .line 1691
    :cond_51
    invoke-static {v1, v0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 1692
    .line 1693
    .line 1694
    new-instance v0, Li28;

    .line 1695
    .line 1696
    invoke-direct {v0, v10, v2}, Li28;-><init>(ILjava/util/List;)V

    .line 1697
    .line 1698
    .line 1699
    return-object v0

    .line 1700
    :pswitch_44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    new-instance v3, Lyp8;

    .line 1704
    .line 1705
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v4

    .line 1709
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v5

    .line 1713
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v6

    .line 1717
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v7

    .line 1721
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v8

    .line 1725
    invoke-direct/range {v3 .. v8}, Lyp8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1726
    .line 1727
    .line 1728
    return-object v3

    .line 1729
    :pswitch_45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1730
    .line 1731
    .line 1732
    new-instance v4, Lzo8;

    .line 1733
    .line 1734
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1735
    .line 1736
    .line 1737
    move-result v5

    .line 1738
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v7

    .line 1742
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v8

    .line 1746
    sget-object v0, Lyp8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1747
    .line 1748
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v0

    .line 1752
    move-object v6, v0

    .line 1753
    check-cast v6, Lyp8;

    .line 1754
    .line 1755
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v9

    .line 1759
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v10

    .line 1763
    invoke-direct/range {v4 .. v10}, Lzo8;-><init>(ILyp8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1764
    .line 1765
    .line 1766
    return-object v4

    .line 1767
    :pswitch_46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v0

    .line 1774
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1775
    .line 1776
    .line 1777
    new-instance v1, Lfg8;

    .line 1778
    .line 1779
    invoke-direct {v1, v0}, Lfg8;-><init>(Ljava/lang/String;)V

    .line 1780
    .line 1781
    .line 1782
    return-object v1

    .line 1783
    :pswitch_47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1784
    .line 1785
    .line 1786
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1787
    .line 1788
    .line 1789
    sget-object v0, Leg8;->X:Leg8;

    .line 1790
    .line 1791
    return-object v0

    .line 1792
    :pswitch_48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1793
    .line 1794
    .line 1795
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v0

    .line 1799
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1800
    .line 1801
    .line 1802
    new-instance v1, Ldg8;

    .line 1803
    .line 1804
    invoke-direct {v1, v0}, Ldg8;-><init>(Ljava/lang/String;)V

    .line 1805
    .line 1806
    .line 1807
    return-object v1

    .line 1808
    :pswitch_49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1809
    .line 1810
    .line 1811
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1812
    .line 1813
    .line 1814
    sget-object v0, Lcg8;->X:Lcg8;

    .line 1815
    .line 1816
    return-object v0

    .line 1817
    :pswitch_4a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1818
    .line 1819
    .line 1820
    new-instance v0, Lsq7;

    .line 1821
    .line 1822
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1823
    .line 1824
    .line 1825
    move-result v2

    .line 1826
    if-nez v2, :cond_53

    .line 1827
    .line 1828
    :cond_52
    :goto_15
    move-object v2, v11

    .line 1829
    goto :goto_16

    .line 1830
    :cond_53
    sget-object v2, Lsu/happ/proxyutility/domain/sub/SubId;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1831
    .line 1832
    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v2

    .line 1836
    check-cast v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 1837
    .line 1838
    if-eqz v2, :cond_52

    .line 1839
    .line 1840
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v11

    .line 1844
    goto :goto_15

    .line 1845
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1846
    .line 1847
    .line 1848
    move-result v3

    .line 1849
    if-eqz v3, :cond_54

    .line 1850
    .line 1851
    move v3, v9

    .line 1852
    goto :goto_17

    .line 1853
    :cond_54
    move v3, v10

    .line 1854
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1855
    .line 1856
    .line 1857
    move-result v4

    .line 1858
    if-eqz v4, :cond_55

    .line 1859
    .line 1860
    move v4, v9

    .line 1861
    goto :goto_18

    .line 1862
    :cond_55
    move v4, v10

    .line 1863
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1864
    .line 1865
    .line 1866
    move-result v5

    .line 1867
    if-eqz v5, :cond_56

    .line 1868
    .line 1869
    move v5, v9

    .line 1870
    goto :goto_19

    .line 1871
    :cond_56
    move v5, v10

    .line 1872
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1873
    .line 1874
    .line 1875
    move-result v6

    .line 1876
    if-eqz v6, :cond_57

    .line 1877
    .line 1878
    move v6, v9

    .line 1879
    goto :goto_1a

    .line 1880
    :cond_57
    move v6, v10

    .line 1881
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1882
    .line 1883
    .line 1884
    move-result v7

    .line 1885
    if-eqz v7, :cond_58

    .line 1886
    .line 1887
    move v7, v9

    .line 1888
    goto :goto_1b

    .line 1889
    :cond_58
    move v7, v10

    .line 1890
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1891
    .line 1892
    .line 1893
    move-result v8

    .line 1894
    if-eqz v8, :cond_59

    .line 1895
    .line 1896
    move v8, v9

    .line 1897
    goto :goto_1c

    .line 1898
    :cond_59
    move v8, v10

    .line 1899
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1900
    .line 1901
    .line 1902
    move-result v11

    .line 1903
    if-eqz v11, :cond_5a

    .line 1904
    .line 1905
    move v11, v9

    .line 1906
    move v12, v10

    .line 1907
    goto :goto_1d

    .line 1908
    :cond_5a
    move v11, v9

    .line 1909
    move v9, v10

    .line 1910
    move v12, v9

    .line 1911
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v10

    .line 1915
    move v13, v11

    .line 1916
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v11

    .line 1920
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1921
    .line 1922
    .line 1923
    move-result v14

    .line 1924
    if-eqz v14, :cond_5b

    .line 1925
    .line 1926
    move v14, v12

    .line 1927
    move v12, v13

    .line 1928
    goto :goto_1e

    .line 1929
    :cond_5b
    move v14, v12

    .line 1930
    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1931
    .line 1932
    .line 1933
    move-result v15

    .line 1934
    if-eqz v15, :cond_5c

    .line 1935
    .line 1936
    move v15, v13

    .line 1937
    goto :goto_1f

    .line 1938
    :cond_5c
    move v15, v13

    .line 1939
    move v13, v14

    .line 1940
    :goto_1f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1941
    .line 1942
    .line 1943
    move-result v1

    .line 1944
    if-eqz v1, :cond_5d

    .line 1945
    .line 1946
    move v14, v15

    .line 1947
    :cond_5d
    move-object v1, v0

    .line 1948
    invoke-direct/range {v1 .. v14}, Lsq7;-><init>(Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZZ)V

    .line 1949
    .line 1950
    .line 1951
    return-object v1

    .line 1952
    :pswitch_4b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1953
    .line 1954
    .line 1955
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v0

    .line 1959
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1960
    .line 1961
    .line 1962
    new-instance v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 1963
    .line 1964
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 1965
    .line 1966
    .line 1967
    return-object v1

    .line 1968
    :pswitch_4c
    move v15, v9

    .line 1969
    move v14, v10

    .line 1970
    new-instance v0, Lmg7;

    .line 1971
    .line 1972
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1973
    .line 1974
    .line 1975
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1976
    .line 1977
    .line 1978
    move-result v2

    .line 1979
    iput v2, v0, Lmg7;->X:I

    .line 1980
    .line 1981
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1982
    .line 1983
    .line 1984
    move-result v2

    .line 1985
    iput v2, v0, Lmg7;->Y:I

    .line 1986
    .line 1987
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1988
    .line 1989
    .line 1990
    move-result v2

    .line 1991
    iput v2, v0, Lmg7;->Z:I

    .line 1992
    .line 1993
    if-lez v2, :cond_5e

    .line 1994
    .line 1995
    new-array v2, v2, [I

    .line 1996
    .line 1997
    iput-object v2, v0, Lmg7;->f0:[I

    .line 1998
    .line 1999
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 2000
    .line 2001
    .line 2002
    :cond_5e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2003
    .line 2004
    .line 2005
    move-result v2

    .line 2006
    iput v2, v0, Lmg7;->g0:I

    .line 2007
    .line 2008
    if-lez v2, :cond_5f

    .line 2009
    .line 2010
    new-array v2, v2, [I

    .line 2011
    .line 2012
    iput-object v2, v0, Lmg7;->h0:[I

    .line 2013
    .line 2014
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 2015
    .line 2016
    .line 2017
    :cond_5f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2018
    .line 2019
    .line 2020
    move-result v2

    .line 2021
    if-ne v2, v15, :cond_60

    .line 2022
    .line 2023
    move v2, v15

    .line 2024
    goto :goto_20

    .line 2025
    :cond_60
    move v2, v14

    .line 2026
    :goto_20
    iput-boolean v2, v0, Lmg7;->j0:Z

    .line 2027
    .line 2028
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2029
    .line 2030
    .line 2031
    move-result v2

    .line 2032
    if-ne v2, v15, :cond_61

    .line 2033
    .line 2034
    move v2, v15

    .line 2035
    goto :goto_21

    .line 2036
    :cond_61
    move v2, v14

    .line 2037
    :goto_21
    iput-boolean v2, v0, Lmg7;->k0:Z

    .line 2038
    .line 2039
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2040
    .line 2041
    .line 2042
    move-result v2

    .line 2043
    if-ne v2, v15, :cond_62

    .line 2044
    .line 2045
    move v9, v15

    .line 2046
    goto :goto_22

    .line 2047
    :cond_62
    move v9, v14

    .line 2048
    :goto_22
    iput-boolean v9, v0, Lmg7;->l0:Z

    .line 2049
    .line 2050
    const-class v2, Lkg7;

    .line 2051
    .line 2052
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v2

    .line 2056
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v1

    .line 2060
    iput-object v1, v0, Lmg7;->i0:Ljava/util/ArrayList;

    .line 2061
    .line 2062
    return-object v0

    .line 2063
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_17
        :pswitch_7
    .end packed-switch

    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_8
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch

    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
    .end packed-switch

    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    :pswitch_data_5
    .packed-switch 0x2
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, Llg7;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Loc6;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lsr2;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lc21;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lqa9;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/common/api/Status;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lzx0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lha9;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lk82;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lxl6;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lav0;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lx11;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lk99;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lj99;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lov4;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Le99;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lw89;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Le89;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [La89;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Li28;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lyp8;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lzo8;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lfg8;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Leg8;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Ldg8;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcg8;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lsq7;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lsu/happ/proxyutility/domain/sub/SubId;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lmg7;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
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
