.class public final Lhm4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzl8;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ly42;


# direct methods
.method public synthetic constructor <init>(Ly42;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lhm4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lhm4;->Y:Ly42;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final y(I)V
    .locals 7

    .line 1
    iget-byte v0, p0, Lhm4;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    sget-object v2, Lho1;->X:Lho1;

    .line 6
    .line 7
    sget-object v3, Lho1;->Y:Lho1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object p0, p0, Lhm4;->Y:Ly42;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Ly42;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ldw7;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p0, p1}, Ldw7;->l(I)Lpv7;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget-object v0, p0, Ldw7;->l:Lvj4;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, v0, Lvj4;->a:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 34
    .line 35
    iget-object p1, p1, Lpv7;->a:Lsu/happ/proxyutility/dto/ServerCache;

    .line 36
    .line 37
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v5, Lkw2;->a:Lkw2;

    .line 45
    .line 46
    invoke-static {v0, p1}, Lkw2;->l(Landroid/content/Context;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/16 v5, 0x38

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v0, p1, v2, v4, v5}, Lra;->n(Lsu/happ/proxyutility/ui/BaseActivity;Lml2;Lho1;Landroid/graphics/Bitmap;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {v0, p1, v3, v4, v5}, Lra;->n(Lsu/happ/proxyutility/ui/BaseActivity;Lml2;Lho1;Landroid/graphics/Bitmap;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    move-object v1, v4

    .line 73
    goto :goto_1

    .line 74
    :goto_0
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 75
    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 79
    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    new-instance v1, Lrj6;

    .line 83
    .line 84
    invoke-direct {v1, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-static {v1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    iget-object p0, p0, Ldw7;->l:Lvj4;

    .line 94
    .line 95
    if-eqz p0, :cond_3

    .line 96
    .line 97
    invoke-static {p0, v3}, Lvj4;->a(Lvj4;Lho1;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_2
    return-void

    .line 101
    :cond_4
    throw p1

    .line 102
    :pswitch_0
    iget-object p0, p0, Ly42;->p:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Ldw7;

    .line 105
    .line 106
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 107
    .line 108
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->L0:Lu5;

    .line 113
    .line 114
    iget-object v0, v0, Lu5;->Y:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Landroid/app/Activity;

    .line 117
    .line 118
    if-eqz v0, :cond_c

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Ldw7;->l(I)Lpv7;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-nez p1, :cond_5

    .line 128
    .line 129
    goto/16 :goto_7

    .line 130
    .line 131
    :cond_5
    :try_start_1
    sget-object v5, Lkw2;->a:Lkw2;

    .line 132
    .line 133
    iget-object p1, p1, Lpv7;->a:Lsu/happ/proxyutility/dto/ServerCache;

    .line 134
    .line 135
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 140
    .line 141
    .line 142
    const/4 v5, -0x1

    .line 143
    :try_start_2
    invoke-static {p1}, Lkw2;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_6

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_6
    invoke-static {v0, p1}, Lss8;->E(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 155
    .line 156
    .line 157
    move-object v0, v1

    .line 158
    goto :goto_3

    .line 159
    :catchall_1
    move-exception p1

    .line 160
    :try_start_3
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 161
    .line 162
    if-nez v0, :cond_a

    .line 163
    .line 164
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 165
    .line 166
    if-nez v0, :cond_a

    .line 167
    .line 168
    new-instance v0, Lrj6;

    .line 169
    .line 170
    invoke-direct {v0, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :goto_3
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-nez p1, :cond_7

    .line 178
    .line 179
    check-cast v0, Ldn8;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 180
    .line 181
    const/4 v5, 0x0

    .line 182
    :cond_7
    :goto_4
    iget-object p1, p0, Ldw7;->l:Lvj4;

    .line 183
    .line 184
    if-nez v5, :cond_9

    .line 185
    .line 186
    if-eqz p1, :cond_8

    .line 187
    .line 188
    :try_start_4
    invoke-static {p1, v2}, Lvj4;->a(Lvj4;Lho1;)V

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :catchall_2
    move-exception p1

    .line 193
    goto :goto_5

    .line 194
    :cond_8
    move-object v1, v4

    .line 195
    goto :goto_6

    .line 196
    :cond_9
    if-eqz p1, :cond_8

    .line 197
    .line 198
    invoke-static {p1, v3}, Lvj4;->a(Lvj4;Lho1;)V

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_a
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 203
    :goto_5
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 204
    .line 205
    if-nez v0, :cond_b

    .line 206
    .line 207
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 208
    .line 209
    if-nez v0, :cond_b

    .line 210
    .line 211
    new-instance v1, Lrj6;

    .line 212
    .line 213
    invoke-direct {v1, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    :goto_6
    invoke-static {v1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    if-eqz p1, :cond_d

    .line 221
    .line 222
    iget-object p0, p0, Ldw7;->l:Lvj4;

    .line 223
    .line 224
    if-eqz p0, :cond_d

    .line 225
    .line 226
    invoke-static {p0, v3}, Lvj4;->a(Lvj4;Lho1;)V

    .line 227
    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_b
    throw p1

    .line 231
    :cond_c
    const-string p0, "Required value was null."

    .line 232
    .line 233
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :cond_d
    :goto_7
    return-void

    .line 237
    :pswitch_1
    iget-object p0, p0, Ly42;->p:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p0, Ldw7;

    .line 240
    .line 241
    invoke-virtual {p0, p1}, Ldw7;->l(I)Lpv7;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    if-nez p1, :cond_e

    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_e
    iget-object p0, p0, Ldw7;->m:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 249
    .line 250
    if-eqz p0, :cond_f

    .line 251
    .line 252
    iget-object p1, p1, Lpv7;->a:Lsu/happ/proxyutility/dto/ServerCache;

    .line 253
    .line 254
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 262
    .line 263
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    sget-object v1, Ltp1;->a:Lnf1;

    .line 268
    .line 269
    sget-object v1, Lye1;->Z:Lye1;

    .line 270
    .line 271
    new-instance v2, Lbk4;

    .line 272
    .line 273
    const/4 v3, 0x1

    .line 274
    invoke-direct {v2, p0, p1, v4, v3}, Lbk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 275
    .line 276
    .line 277
    const/4 p0, 0x2

    .line 278
    invoke-static {v0, v1, v2, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 279
    .line 280
    .line 281
    :cond_f
    :goto_8
    return-void

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
