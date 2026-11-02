.class public final Lzh4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Z

.field public j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgg4;Lci4;ZLq51;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lzh4;->g0:B

    .line 17
    iput-object p1, p0, Lzh4;->k0:Ljava/lang/Object;

    iput-object p2, p0, Lzh4;->l0:Ljava/lang/Object;

    iput-boolean p3, p0, Lzh4;->i0:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(ZLsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Lg83;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lzh4;->g0:B

    .line 3
    .line 4
    iput-boolean p1, p0, Lzh4;->i0:Z

    .line 5
    .line 6
    iput-object p2, p0, Lzh4;->j0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lzh4;->k0:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lzh4;->l0:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lzh4;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lzh4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lzh4;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lzh4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lzh4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lzh4;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lzh4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    iget-byte p2, p0, Lzh4;->g0:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lzh4;

    .line 7
    .line 8
    iget-object p2, p0, Lzh4;->j0:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p2

    .line 11
    check-cast v2, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 12
    .line 13
    iget-object p2, p0, Lzh4;->k0:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p2

    .line 16
    check-cast v3, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 17
    .line 18
    iget-object p2, p0, Lzh4;->l0:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p2

    .line 21
    check-cast v4, Lg83;

    .line 22
    .line 23
    iget-boolean v1, p0, Lzh4;->i0:Z

    .line 24
    .line 25
    move-object v5, p1

    .line 26
    invoke-direct/range {v0 .. v5}, Lzh4;-><init>(ZLsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Lg83;Lq51;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object v5, p1

    .line 31
    new-instance p1, Lzh4;

    .line 32
    .line 33
    iget-object p2, p0, Lzh4;->k0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p2, Lgg4;

    .line 36
    .line 37
    iget-object v0, p0, Lzh4;->l0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lci4;

    .line 40
    .line 41
    iget-boolean p0, p0, Lzh4;->i0:Z

    .line 42
    .line 43
    invoke-direct {p1, p2, v0, p0, v5}, Lzh4;-><init>(Lgg4;Lci4;ZLq51;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Lzh4;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lzh4;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean v2, p0, Lzh4;->i0:Z

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lc71;->X:Lc71;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, p0, Lzh4;->k0:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 19
    .line 20
    iget-object v0, p0, Lzh4;->j0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 23
    .line 24
    iget-boolean v8, p0, Lzh4;->h0:Z

    .line 25
    .line 26
    if-eqz v8, :cond_2

    .line 27
    .line 28
    if-ne v8, v5, :cond_0

    .line 29
    .line 30
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    move-object v4, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    sget-object p1, Lko1;->B1:Lm51;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lkm4;->x(Lml2;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    sget-object p1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 54
    .line 55
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v2, Luq0;

    .line 64
    .line 65
    const/16 v3, 0x9

    .line 66
    .line 67
    invoke-direct {v2, v6, v3}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v2}, Lkf4;->h(Lgn2;)V

    .line 71
    .line 72
    .line 73
    sget p1, Ly46;->toast_success_sub_update:I

    .line 74
    .line 75
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v0, p1}, Lpu;->R(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    check-cast v1, Lg83;

    .line 94
    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    iput-boolean v5, p0, Lzh4;->h0:Z

    .line 98
    .line 99
    invoke-interface {v1, v5, p0}, Lg83;->t(ZLs51;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, v4, :cond_4

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    :goto_0
    sget-object v4, Ldn8;->a:Ldn8;

    .line 107
    .line 108
    :goto_1
    return-object v4

    .line 109
    :pswitch_0
    const-string v0, ""

    .line 110
    .line 111
    iget-boolean v8, p0, Lzh4;->h0:Z

    .line 112
    .line 113
    if-eqz v8, :cond_6

    .line 114
    .line 115
    if-ne v8, v5, :cond_5

    .line 116
    .line 117
    iget-object p0, p0, Lzh4;->j0:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, Lgg4;

    .line 120
    .line 121
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    move-object v4, v7

    .line 129
    goto/16 :goto_5

    .line 130
    .line 131
    :cond_6
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object p1, v6

    .line 135
    check-cast p1, Lgg4;

    .line 136
    .line 137
    check-cast v1, Lci4;

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    :try_start_1
    iget-object v3, p1, Lgg4;->a:Ljava/lang/String;

    .line 142
    .line 143
    if-eqz v3, :cond_8

    .line 144
    .line 145
    new-instance p0, Ljava/io/File;

    .line 146
    .line 147
    invoke-direct {p0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    if-eqz v2, :cond_7

    .line 151
    .line 152
    invoke-static {p0, v0}, Lda2;->T(Ljava/io/File;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    sget-object v0, Liq0;->a:Ljava/nio/charset/Charset;

    .line 157
    .line 158
    new-instance v1, Ljava/io/InputStreamReader;

    .line 159
    .line 160
    new-instance v2, Ljava/io/FileInputStream;

    .line 161
    .line 162
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v1, v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 166
    .line 167
    .line 168
    new-instance p0, Ljava/io/BufferedReader;

    .line 169
    .line 170
    const/16 v0, 0x2000

    .line 171
    .line 172
    invoke-direct {p0, v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 173
    .line 174
    .line 175
    :try_start_2
    invoke-static {p0}, Ldt7;->e(Ljava/io/Reader;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 179
    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :catchall_0
    move-exception p1

    .line 184
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 185
    :catchall_1
    move-exception v0

    .line 186
    :try_start_5
    invoke-static {p0, p1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_8
    iput-object p1, p0, Lzh4;->j0:Ljava/lang/Object;

    .line 191
    .line 192
    iput-boolean v5, p0, Lzh4;->h0:Z

    .line 193
    .line 194
    invoke-virtual {v1, v2, p0}, Lci4;->h(ZLs51;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    if-ne p0, v4, :cond_9

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    move-object v9, p1

    .line 202
    move-object p1, p0

    .line 203
    move-object p0, v9

    .line 204
    :goto_2
    move-object v0, p1

    .line 205
    check-cast v0, Ljava/lang/String;

    .line 206
    .line 207
    move-object p1, p0

    .line 208
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    const p0, 0xb71b0

    .line 212
    .line 213
    .line 214
    invoke-static {v0, p0, p0, v5}, Lfm7;->T0(Ljava/lang/CharSequence;IIZ)Ljava/util/ArrayList;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-static {p0}, Lmb6;->f0(Ljava/lang/Iterable;)Lj2;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    new-instance v0, Llg4;

    .line 223
    .line 224
    const/4 v1, 0x4

    .line 225
    const/4 v2, 0x0

    .line 226
    invoke-direct {v0, p1, p0, v1, v2}, Llg4;-><init>(Lgg4;Lj2;II)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :catchall_2
    move-exception p0

    .line 231
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 232
    .line 233
    if-nez p1, :cond_a

    .line 234
    .line 235
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 236
    .line 237
    if-nez p1, :cond_a

    .line 238
    .line 239
    new-instance v0, Lrj6;

    .line 240
    .line 241
    invoke-direct {v0, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    :goto_4
    new-instance v4, Lsj6;

    .line 245
    .line 246
    invoke-direct {v4, v0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :goto_5
    return-object v4

    .line 250
    :cond_a
    throw p0

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
