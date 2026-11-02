.class public final synthetic Lvb;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lvb;->X:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lmo2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public W(Ljava/lang/String;Ljava/lang/String;Lq51;)Ljava/io/Serializable;
    .locals 8

    .line 1
    iget-byte v0, p0, Lvb;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    sget-object v3, Lc71;->X:Lc71;

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    instance-of v0, p3, Lyn;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p3

    .line 19
    check-cast v0, Lyn;

    .line 20
    .line 21
    iget v6, v0, Lyn;->h0:I

    .line 22
    .line 23
    and-int v7, v6, v4

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v6, v4

    .line 28
    iput v6, v0, Lyn;->h0:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Lyn;

    .line 32
    .line 33
    invoke-direct {v0, p0, p3}, Lyn;-><init>(Lvb;Lq51;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p3, v0, Lyn;->f0:Ljava/lang/Object;

    .line 37
    .line 38
    iget v4, v0, Lyn;->h0:I

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    if-ne v4, v5, :cond_1

    .line 43
    .line 44
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast p3, Lsj6;

    .line 48
    .line 49
    iget-object p0, p3, Lsj6;->X:Ljava/lang/Object;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Lqo;

    .line 62
    .line 63
    iput v5, v0, Lyn;->h0:I

    .line 64
    .line 65
    invoke-virtual {p0, p1, p2, v0}, Lqo;->d(Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, v3, :cond_3

    .line 70
    .line 71
    move-object v1, v3

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    new-instance v1, Lsj6;

    .line 74
    .line 75
    invoke-direct {v1, p0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    return-object v1

    .line 79
    :pswitch_0
    instance-of v0, p3, Lxn;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    move-object v0, p3

    .line 84
    check-cast v0, Lxn;

    .line 85
    .line 86
    iget v6, v0, Lxn;->h0:I

    .line 87
    .line 88
    and-int v7, v6, v4

    .line 89
    .line 90
    if-eqz v7, :cond_4

    .line 91
    .line 92
    sub-int/2addr v6, v4

    .line 93
    iput v6, v0, Lxn;->h0:I

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    new-instance v0, Lxn;

    .line 97
    .line 98
    invoke-direct {v0, p0, p3}, Lxn;-><init>(Lvb;Lq51;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    iget-object p3, v0, Lxn;->f0:Ljava/lang/Object;

    .line 102
    .line 103
    iget v4, v0, Lxn;->h0:I

    .line 104
    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    if-ne v4, v5, :cond_5

    .line 108
    .line 109
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    check-cast p3, Lsj6;

    .line 113
    .line 114
    iget-object p0, p3, Lsj6;->X:Ljava/lang/Object;

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_5
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, Lqo;

    .line 127
    .line 128
    iput v5, v0, Lxn;->h0:I

    .line 129
    .line 130
    invoke-virtual {p0, p1, p2, v0}, Lqo;->e(Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    if-ne p0, v3, :cond_7

    .line 135
    .line 136
    move-object v1, v3

    .line 137
    goto :goto_5

    .line 138
    :cond_7
    :goto_4
    new-instance v1, Lsj6;

    .line 139
    .line 140
    invoke-direct {v1, p0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :goto_5
    return-object v1

    .line 144
    :pswitch_1
    instance-of v0, p3, Lwn;

    .line 145
    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    move-object v0, p3

    .line 149
    check-cast v0, Lwn;

    .line 150
    .line 151
    iget v6, v0, Lwn;->h0:I

    .line 152
    .line 153
    and-int v7, v6, v4

    .line 154
    .line 155
    if-eqz v7, :cond_8

    .line 156
    .line 157
    sub-int/2addr v6, v4

    .line 158
    iput v6, v0, Lwn;->h0:I

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_8
    new-instance v0, Lwn;

    .line 162
    .line 163
    invoke-direct {v0, p0, p3}, Lwn;-><init>(Lvb;Lq51;)V

    .line 164
    .line 165
    .line 166
    :goto_6
    iget-object p3, v0, Lwn;->f0:Ljava/lang/Object;

    .line 167
    .line 168
    iget v4, v0, Lwn;->h0:I

    .line 169
    .line 170
    if-eqz v4, :cond_a

    .line 171
    .line 172
    if-ne v4, v5, :cond_9

    .line 173
    .line 174
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    check-cast p3, Lsj6;

    .line 178
    .line 179
    iget-object p0, p3, Lsj6;->X:Ljava/lang/Object;

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_9
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_a
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p0, Lqo;

    .line 192
    .line 193
    iput v5, v0, Lwn;->h0:I

    .line 194
    .line 195
    invoke-virtual {p0, p1, p2, v0}, Lqo;->d(Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-ne p0, v3, :cond_b

    .line 200
    .line 201
    move-object v1, v3

    .line 202
    goto :goto_8

    .line 203
    :cond_b
    :goto_7
    new-instance v1, Lsj6;

    .line 204
    .line 205
    invoke-direct {v1, p0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :goto_8
    return-object v1

    .line 209
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lvb;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Llv7;

    .line 11
    .line 12
    iget-object p1, v0, Llv7;->a:Ljava/lang/String;

    .line 13
    .line 14
    move-object v3, p2

    .line 15
    check-cast v3, Lmv7;

    .line 16
    .line 17
    iget-object p1, v3, Lmv7;->a:Ljava/lang/String;

    .line 18
    .line 19
    check-cast p3, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ll27;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v5, p0, Ll27;->e:Loh7;

    .line 36
    .line 37
    :cond_0
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    move-object p1, p0

    .line 42
    check-cast p1, Le27;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    iget-object p2, p1, Le27;->c:Lc83;

    .line 47
    .line 48
    invoke-static {p2, v0}, Loc;->z(Lc83;Ljava/lang/Object;)Lkm5;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object p2, p1, Le27;->c:Lc83;

    .line 54
    .line 55
    invoke-static {p2, v0}, Loc;->x(Lc83;Ljava/lang/Object;)Lkm5;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-static {p2, v3}, Loc;->x(Lc83;Ljava/lang/Object;)Lkm5;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    :goto_0
    const/16 p3, 0xb

    .line 64
    .line 65
    invoke-static {p1, v2, p2, v2, p3}, Le27;->a(Le27;Lb83;Lkm5;Lc83;I)Le27;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v5, p0, p1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 77
    .line 78
    check-cast p2, Lup0;

    .line 79
    .line 80
    iget-object p1, p2, Lup0;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p3, Ls61;

    .line 83
    .line 84
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Lx90;

    .line 87
    .line 88
    iget-object p0, p0, Lx90;->Y:Lgn2;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lup0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {p0, p1, p3}, Ljm4;->s(Lgn2;Ljava/lang/Object;Ls61;)V

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 105
    .line 106
    check-cast p3, Ls61;

    .line 107
    .line 108
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lx90;

    .line 111
    .line 112
    iget-object p0, p0, Lx90;->Y:Lgn2;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {p0, p2, p3}, Ljm4;->s(Lgn2;Ljava/lang/Object;Ls61;)V

    .line 118
    .line 119
    .line 120
    return-object v1

    .line 121
    :pswitch_2
    check-cast p1, Lsu/happ/proxyutility/dto/InstallId;

    .line 122
    .line 123
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/InstallId;->c()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p2, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 128
    .line 129
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/HashedDomain;->c()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    check-cast p3, Lq51;

    .line 134
    .line 135
    invoke-virtual {p0, p1, p2, p3}, Lvb;->W(Ljava/lang/String;Ljava/lang/String;Lq51;)Ljava/io/Serializable;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    :pswitch_3
    check-cast p1, Lsu/happ/proxyutility/dto/InstallId;

    .line 141
    .line 142
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/InstallId;->c()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p2, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 147
    .line 148
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/HashedDomain;->c()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    check-cast p3, Lq51;

    .line 153
    .line 154
    invoke-virtual {p0, p1, p2, p3}, Lvb;->W(Ljava/lang/String;Ljava/lang/String;Lq51;)Ljava/io/Serializable;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_4
    check-cast p1, Lsu/happ/proxyutility/dto/InstallId;

    .line 160
    .line 161
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/InstallId;->c()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p2, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 166
    .line 167
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/HashedDomain;->c()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    check-cast p3, Lq51;

    .line 172
    .line 173
    invoke-virtual {p0, p1, p2, p3}, Lvb;->W(Ljava/lang/String;Ljava/lang/String;Lq51;)Ljava/io/Serializable;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :pswitch_5
    if-nez p1, :cond_2

    .line 179
    .line 180
    check-cast p2, Lua7;

    .line 181
    .line 182
    iget-wide p1, p2, Lua7;->a:J

    .line 183
    .line 184
    check-cast p3, Lgn2;

    .line 185
    .line 186
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 189
    .line 190
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->J1:Ljava/lang/Class;

    .line 191
    .line 192
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 211
    .line 212
    new-instance v3, Lii1;

    .line 213
    .line 214
    invoke-direct {v3, v1, v0}, Lii1;-><init>(FF)V

    .line 215
    .line 216
    .line 217
    new-instance v0, Lhz0;

    .line 218
    .line 219
    invoke-direct {v0, v3, p1, p2, p3}, Lhz0;-><init>(Lii1;JLgn2;)V

    .line 220
    .line 221
    .line 222
    sget-object p1, Ljc;->a:Ljc;

    .line 223
    .line 224
    invoke-virtual {p1, p0, v2, v0}, Ljc;->a(Landroid/view/View;Lyt1;Lhz0;)Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    goto :goto_1

    .line 233
    :cond_2
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 234
    .line 235
    .line 236
    :goto_1
    return-object v2

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
