.class public final Lel4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lsu/happ/proxyutility/feature/main/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lel4;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lel4;->i0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lel4;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lel4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lel4;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lel4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lqm4;

    .line 23
    .line 24
    check-cast p2, Lq51;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lel4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lel4;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lel4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    check-cast p1, Lsu/happ/proxyutility/dto/ServerConfig;

    .line 37
    .line 38
    check-cast p2, Lq51;

    .line 39
    .line 40
    invoke-virtual {p0, p2, p1}, Lel4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lel4;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lel4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_2
    check-cast p1, Lqg5;

    .line 51
    .line 52
    check-cast p2, Lq51;

    .line 53
    .line 54
    invoke-virtual {p0, p2, p1}, Lel4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lel4;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lel4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Lel4;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lel4;->i0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lel4;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p1, v1}, Lel4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 12
    .line 13
    .line 14
    iput-object p2, v0, Lel4;->h0:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lel4;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p1, v1}, Lel4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 21
    .line 22
    .line 23
    iput-object p2, v0, Lel4;->h0:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, Lel4;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p1, v1}, Lel4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 30
    .line 31
    .line 32
    iput-object p2, v0, Lel4;->h0:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, Lel4;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p1, v1}, Lel4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 39
    .line 40
    .line 41
    iput-object p2, v0, Lel4;->h0:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lel4;->g0:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v3, v0, Lel4;->i0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v6, "binding"

    .line 11
    .line 12
    sget-object v7, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lel4;->h0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Long;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v1, v1, Lb6;->k0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 30
    .line 31
    sget-object v2, Lzl7;->a:Lkc6;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-wide/16 v2, 0x0

    .line 41
    .line 42
    :goto_0
    invoke-static {v2, v3}, Lzl7;->a(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    return-object v7

    .line 50
    :cond_1
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v5

    .line 54
    :pswitch_0
    iget-object v0, v0, Lel4;->h0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lqm4;

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_8

    .line 66
    .line 67
    if-eq v0, v8, :cond_5

    .line 68
    .line 69
    if-ne v0, v2, :cond_4

    .line 70
    .line 71
    iget-object v0, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    iget-object v0, v0, Lb6;->n0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 76
    .line 77
    invoke-static {v0, v8}, Lrp7;->e(Landroid/view/View;Z)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    iget-object v0, v0, Lb6;->n0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 85
    .line 86
    sget v1, Lq36;->ic_remote_message_new:I

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageResource(I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v5

    .line 96
    :cond_3
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v5

    .line 100
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    iget-object v0, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 105
    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    iget-object v0, v0, Lb6;->n0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 109
    .line 110
    invoke-static {v0, v8}, Lrp7;->e(Landroid/view/View;Z)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    iget-object v0, v0, Lb6;->n0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 118
    .line 119
    sget v1, Lq36;->ic_remote_message:I

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageResource(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_6
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v5

    .line 129
    :cond_7
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v5

    .line 133
    :cond_8
    iget-object v0, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 134
    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    iget-object v0, v0, Lb6;->n0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 138
    .line 139
    invoke-static {v0, v4}, Lrp7;->e(Landroid/view/View;Z)V

    .line 140
    .line 141
    .line 142
    :goto_1
    move-object v5, v7

    .line 143
    :goto_2
    return-object v5

    .line 144
    :cond_9
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v5

    .line 148
    :pswitch_1
    iget-object v0, v0, Lel4;->h0:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Lsu/happ/proxyutility/dto/ServerConfig;

    .line 151
    .line 152
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 156
    .line 157
    if-eqz v1, :cond_10

    .line 158
    .line 159
    iget-object v1, v1, Lb6;->x0:Landroid/widget/LinearLayout;

    .line 160
    .line 161
    if-eqz v1, :cond_b

    .line 162
    .line 163
    if-eqz v0, :cond_a

    .line 164
    .line 165
    move v4, v8

    .line 166
    :cond_a
    invoke-static {v1, v4}, Lrp7;->e(Landroid/view/View;Z)V

    .line 167
    .line 168
    .line 169
    :cond_b
    if-eqz v0, :cond_f

    .line 170
    .line 171
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 172
    .line 173
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    iget-object v1, v1, Lsu/happ/proxyutility/HappApplication;->F0:Lvz7;

    .line 178
    .line 179
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Lq72;

    .line 184
    .line 185
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v1, v0}, Lq72;->a(Ljava/lang/String;)Lqg5;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iget-object v1, v0, Lqg5;->X:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v1, Ljava/lang/String;

    .line 196
    .line 197
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Ljava/lang/Number;

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    iget-object v2, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 206
    .line 207
    if-eqz v2, :cond_e

    .line 208
    .line 209
    iget-object v2, v2, Lb6;->F0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 210
    .line 211
    if-eqz v2, :cond_c

    .line 212
    .line 213
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    :cond_c
    iget-object v1, v3, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 217
    .line 218
    if-eqz v1, :cond_d

    .line 219
    .line 220
    iget-object v1, v1, Lb6;->r0:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 221
    .line 222
    if-eqz v1, :cond_f

    .line 223
    .line 224
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_d
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v5

    .line 232
    :cond_e
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v5

    .line 236
    :cond_f
    :goto_3
    return-object v7

    .line 237
    :cond_10
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v5

    .line 241
    :pswitch_2
    iget-object v1, v0, Lel4;->h0:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v1, Lqg5;

    .line 244
    .line 245
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    iget-object v3, v1, Lqg5;->X:Ljava/lang/Object;

    .line 249
    .line 250
    move-object v11, v3

    .line 251
    check-cast v11, Ljava/util/List;

    .line 252
    .line 253
    iget-object v1, v1, Lqg5;->Y:Ljava/lang/Object;

    .line 254
    .line 255
    move-object v12, v1

    .line 256
    check-cast v12, La45;

    .line 257
    .line 258
    iget-object v10, v0, Lel4;->i0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 259
    .line 260
    iget-object v0, v10, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 261
    .line 262
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->A()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    iget-object v1, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->x:Lh76;

    .line 274
    .line 275
    iget-object v1, v1, Lh76;->X:Loh7;

    .line 276
    .line 277
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    check-cast v1, Lxm4;

    .line 282
    .line 283
    iget-boolean v1, v1, Lxm4;->e:Z

    .line 284
    .line 285
    const/16 v3, 0x8

    .line 286
    .line 287
    const/4 v13, 0x0

    .line 288
    if-nez v1, :cond_12

    .line 289
    .line 290
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 291
    .line 292
    if-eqz v1, :cond_11

    .line 293
    .line 294
    iget-object v1, v1, Lb6;->I0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 295
    .line 296
    if-eqz v1, :cond_12

    .line 297
    .line 298
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 299
    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_11
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v13

    .line 306
    :cond_12
    :goto_4
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    sget-object v5, Ltp1;->a:Lnf1;

    .line 311
    .line 312
    sget-object v5, Ldm4;->a:Lhv2;

    .line 313
    .line 314
    new-instance v9, Lqk4;

    .line 315
    .line 316
    const/4 v14, 0x0

    .line 317
    invoke-direct/range {v9 .. v14}, Lqk4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 318
    .line 319
    .line 320
    invoke-static {v1, v5, v9, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 321
    .line 322
    .line 323
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-virtual {v5}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    if-nez v5, :cond_13

    .line 336
    .line 337
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    iget-object v5, v5, Lsu/happ/proxyutility/feature/main/MainViewModel;->x:Lh76;

    .line 342
    .line 343
    iget-object v5, v5, Lh76;->X:Loh7;

    .line 344
    .line 345
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    check-cast v5, Lxm4;

    .line 350
    .line 351
    iget-boolean v5, v5, Lxm4;->q:Z

    .line 352
    .line 353
    if-nez v5, :cond_13

    .line 354
    .line 355
    invoke-virtual {v10, v4}, Lsu/happ/proxyutility/feature/main/MainActivity;->b0(Z)V

    .line 356
    .line 357
    .line 358
    :cond_13
    const/4 v5, 0x4

    .line 359
    const-wide/16 v14, 0x12c

    .line 360
    .line 361
    if-eqz v1, :cond_1e

    .line 362
    .line 363
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 364
    .line 365
    if-eqz v1, :cond_1d

    .line 366
    .line 367
    iget-object v1, v1, Lb6;->v0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 368
    .line 369
    if-eqz v1, :cond_14

    .line 370
    .line 371
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 372
    .line 373
    .line 374
    :cond_14
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 375
    .line 376
    if-eqz v1, :cond_1c

    .line 377
    .line 378
    iget-object v1, v1, Lb6;->Y:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;

    .line 379
    .line 380
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 381
    .line 382
    .line 383
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 384
    .line 385
    if-eqz v1, :cond_1b

    .line 386
    .line 387
    iget-object v1, v1, Lb6;->J0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 388
    .line 389
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 390
    .line 391
    .line 392
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 393
    .line 394
    if-eqz v1, :cond_1a

    .line 395
    .line 396
    iget-object v1, v1, Lb6;->y0:Landroid/widget/LinearLayout;

    .line 397
    .line 398
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 399
    .line 400
    .line 401
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 402
    .line 403
    if-eqz v1, :cond_19

    .line 404
    .line 405
    iget-object v1, v1, Lb6;->A0:Landroid/view/View;

    .line 406
    .line 407
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 408
    .line 409
    new-instance v2, Lvl4;

    .line 410
    .line 411
    invoke-direct {v2, v10, v4}, Lvl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1, v2, v14, v15}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 415
    .line 416
    .line 417
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 418
    .line 419
    if-eqz v1, :cond_18

    .line 420
    .line 421
    iget-object v1, v1, Lb6;->I0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 422
    .line 423
    if-eqz v1, :cond_15

    .line 424
    .line 425
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 426
    .line 427
    .line 428
    :cond_15
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 429
    .line 430
    if-eqz v1, :cond_17

    .line 431
    .line 432
    iget-object v1, v1, Lb6;->L0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 433
    .line 434
    if-eqz v1, :cond_16

    .line 435
    .line 436
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 437
    .line 438
    .line 439
    :cond_16
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->a0()V

    .line 440
    .line 441
    .line 442
    goto :goto_6

    .line 443
    :cond_17
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    throw v13

    .line 447
    :cond_18
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw v13

    .line 451
    :cond_19
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    throw v13

    .line 455
    :cond_1a
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    throw v13

    .line 459
    :cond_1b
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v13

    .line 463
    :cond_1c
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v13

    .line 467
    :cond_1d
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v13

    .line 471
    :cond_1e
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    sget-object v9, Lye1;->Z:Lye1;

    .line 476
    .line 477
    new-instance v12, Lqk4;

    .line 478
    .line 479
    invoke-direct {v12, v13, v10, v13}, Lqk4;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;)V

    .line 480
    .line 481
    .line 482
    invoke-static {v1, v9, v12, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 483
    .line 484
    .line 485
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 486
    .line 487
    if-eqz v1, :cond_29

    .line 488
    .line 489
    iget-object v1, v1, Lb6;->J0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 490
    .line 491
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 492
    .line 493
    .line 494
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 495
    .line 496
    if-eqz v1, :cond_28

    .line 497
    .line 498
    iget-object v1, v1, Lb6;->y0:Landroid/widget/LinearLayout;

    .line 499
    .line 500
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 501
    .line 502
    .line 503
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 504
    .line 505
    if-eqz v1, :cond_27

    .line 506
    .line 507
    iget-object v1, v1, Lb6;->Y:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;

    .line 508
    .line 509
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 510
    .line 511
    .line 512
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 513
    .line 514
    if-eqz v1, :cond_26

    .line 515
    .line 516
    iget-object v1, v1, Lb6;->A0:Landroid/view/View;

    .line 517
    .line 518
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 519
    .line 520
    new-instance v2, Lvl4;

    .line 521
    .line 522
    invoke-direct {v2, v10, v8}, Lvl4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1, v2, v14, v15}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 526
    .line 527
    .line 528
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 529
    .line 530
    if-eqz v1, :cond_25

    .line 531
    .line 532
    iget-object v1, v1, Lb6;->L0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 533
    .line 534
    if-eqz v1, :cond_20

    .line 535
    .line 536
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-virtual {v2}, Lsu/happ/proxyutility/feature/main/MainViewModel;->u()Z

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    if-nez v2, :cond_1f

    .line 545
    .line 546
    goto :goto_5

    .line 547
    :cond_1f
    move v5, v4

    .line 548
    :goto_5
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 549
    .line 550
    .line 551
    :cond_20
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->a0()V

    .line 552
    .line 553
    .line 554
    :goto_6
    invoke-static {v10}, Lue3;->y(Landroid/content/Context;)Z

    .line 555
    .line 556
    .line 557
    move-result v1

    .line 558
    if-eqz v1, :cond_23

    .line 559
    .line 560
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 561
    .line 562
    .line 563
    move-result v1

    .line 564
    if-eqz v1, :cond_23

    .line 565
    .line 566
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 567
    .line 568
    .line 569
    sget-object v1, Lkw4;->a:Lkw4;

    .line 570
    .line 571
    invoke-static {}, Lkw4;->h()Lcom/tencent/mmkv/MMKV;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    const-string v2, "HAPP_CONFIGS"

    .line 576
    .line 577
    invoke-virtual {v1, v2}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    if-eqz v1, :cond_22

    .line 582
    .line 583
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    if-eqz v2, :cond_21

    .line 588
    .line 589
    goto :goto_7

    .line 590
    :cond_21
    sget-object v2, Lyw2;->c:Lcom/google/gson/a;

    .line 591
    .line 592
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    new-instance v3, Lyi8;

    .line 596
    .line 597
    const-class v5, [Ljava/lang/String;

    .line 598
    .line 599
    invoke-direct {v3, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v1, v3}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    check-cast v1, [Ljava/lang/Object;

    .line 607
    .line 608
    array-length v1, v1

    .line 609
    goto :goto_8

    .line 610
    :cond_22
    :goto_7
    move v1, v4

    .line 611
    :goto_8
    if-ge v1, v8, :cond_23

    .line 612
    .line 613
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->Z()V

    .line 614
    .line 615
    .line 616
    :cond_23
    iget-object v1, v10, Lsu/happ/proxyutility/feature/main/MainActivity;->m1:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 617
    .line 618
    sget-boolean v2, Lsu/happ/proxyutility/HappApplication;->P0:Z

    .line 619
    .line 620
    if-eqz v2, :cond_24

    .line 621
    .line 622
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    iget-object v2, v2, Lsu/happ/proxyutility/feature/main/MainViewModel;->H:Lh76;

    .line 627
    .line 628
    iget-object v2, v2, Lh76;->X:Loh7;

    .line 629
    .line 630
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    check-cast v2, Ljava/util/Collection;

    .line 635
    .line 636
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    if-nez v2, :cond_24

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-nez v2, :cond_24

    .line 647
    .line 648
    sput-boolean v4, Lsu/happ/proxyutility/HappApplication;->P0:Z

    .line 649
    .line 650
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 651
    .line 652
    .line 653
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    new-instance v1, Lwj4;

    .line 658
    .line 659
    invoke-direct {v1, v10, v13, v8}, Lwj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 660
    .line 661
    .line 662
    const/4 v2, 0x3

    .line 663
    invoke-static {v0, v13, v1, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 664
    .line 665
    .line 666
    :cond_24
    return-object v7

    .line 667
    :cond_25
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    throw v13

    .line 671
    :cond_26
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    throw v13

    .line 675
    :cond_27
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    throw v13

    .line 679
    :cond_28
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    throw v13

    .line 683
    :cond_29
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    throw v13

    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
