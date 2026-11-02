.class public final La93;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lcom/tencent/mmkv/MMKV;

.field public final b:Lcom/tencent/mmkv/MMKV;

.field public final c:Lm51;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lkw4;->a:Lkw4;

    .line 2
    .line 3
    invoke-static {}, Lkw4;->h()Lcom/tencent/mmkv/MMKV;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La93;->a:Lcom/tencent/mmkv/MMKV;

    .line 18
    .line 19
    iput-object v1, p0, La93;->b:Lcom/tencent/mmkv/MMKV;

    .line 20
    .line 21
    invoke-static {}, Lpw7;->b()Low7;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Ltp1;->a:Lnf1;

    .line 26
    .line 27
    sget-object v1, Lye1;->Z:Lye1;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La93;->c:Lm51;

    .line 38
    .line 39
    return-void
.end method

.method public static a(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Lpr;)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, Lc12;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    :try_start_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    const-string v1, "key"

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    instance-of v1, p0, Ljava/lang/InterruptedException;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    instance-of v1, p0, Ljava/util/concurrent/CancellationException;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Lrj6;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    throw p0

    .line 35
    :cond_1
    move-object p0, v0

    .line 36
    :goto_0
    move-object v1, p0

    .line 37
    :goto_1
    nop

    .line 38
    instance-of p0, v1, Lrj6;

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    move-object v1, v0

    .line 43
    :cond_2
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    iget-object p0, p2, Lpr;->b:Ljava/util/Map;

    .line 46
    .line 47
    iget-object p2, p2, Lpr;->a:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz p0, :cond_d

    .line 50
    .line 51
    const-string v0, "Encrypt-Tag"

    .line 52
    .line 53
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ljava/lang/String;

    .line 58
    .line 59
    const-string v0, ""

    .line 60
    .line 61
    if-nez p0, :cond_3

    .line 62
    .line 63
    move-object p0, v0

    .line 64
    :cond_3
    const/4 v2, 0x1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->p()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-ne p1, v2, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    if-eqz v1, :cond_c

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_5
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-lez p1, :cond_c

    .line 89
    .line 90
    sget-object p1, Lc12;->a:Ljava/util/ArrayList;

    .line 91
    .line 92
    if-nez v1, :cond_6

    .line 93
    .line 94
    move-object v1, v0

    .line 95
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    sget-object p1, Lc12;->a:Ljava/util/ArrayList;

    .line 99
    .line 100
    const/16 v3, 0xa

    .line 101
    .line 102
    invoke-static {p1, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-static {v3}, Laq4;->G(I)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    const/16 v4, 0x10

    .line 111
    .line 112
    if-ge v3, v4, :cond_7

    .line 113
    .line 114
    move v3, v4

    .line 115
    :cond_7
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object v5, v3

    .line 135
    check-cast v5, Ljava/lang/String;

    .line 136
    .line 137
    new-array v6, v2, [C

    .line 138
    .line 139
    const/16 v7, 0x3a

    .line 140
    .line 141
    const/4 v8, 0x0

    .line 142
    aput-char v7, v6, v8

    .line 143
    .line 144
    invoke-static {v5, v6}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-static {v5}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_8
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 159
    .line 160
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_a

    .line 176
    .line 177
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Ljava/util/Map$Entry;

    .line 182
    .line 183
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    check-cast v4, Ljava/lang/String;

    .line 188
    .line 189
    if-eqz v4, :cond_9

    .line 190
    .line 191
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {p1, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_a
    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    check-cast p1, Ljava/lang/String;

    .line 208
    .line 209
    if-nez p1, :cond_b

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_b
    move-object v0, p1

    .line 213
    :goto_5
    invoke-static {p2, v0, p0}, Lc12;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    :cond_c
    :goto_6
    return-object p2

    .line 218
    :cond_d
    const-string p0, "Required value was null."

    .line 219
    .line 220
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;ZLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLs51;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p8

    .line 6
    .line 7
    instance-of v3, v2, Lz83;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lz83;

    .line 13
    .line 14
    iget v4, v3, Lz83;->q0:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lz83;->q0:I

    .line 24
    .line 25
    :goto_0
    move-object v11, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lz83;

    .line 28
    .line 29
    invoke-direct {v3, v0, v2}, Lz83;-><init>(La93;Ls51;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v11, Lz83;->o0:Ljava/lang/Object;

    .line 34
    .line 35
    iget v3, v11, Lz83;->q0:I

    .line 36
    .line 37
    const-string v12, "Required value was null."

    .line 38
    .line 39
    const/4 v13, 0x2

    .line 40
    const/4 v14, 0x1

    .line 41
    const/4 v15, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    sget-object v5, Lc71;->X:Lc71;

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    if-eq v3, v14, :cond_2

    .line 48
    .line 49
    if-ne v3, v13, :cond_1

    .line 50
    .line 51
    iget v1, v11, Lz83;->n0:I

    .line 52
    .line 53
    iget v3, v11, Lz83;->m0:I

    .line 54
    .line 55
    iget-object v5, v11, Lz83;->j0:Lq23;

    .line 56
    .line 57
    iget-object v6, v11, Lz83;->i0:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v7, v11, Lz83;->h0:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lpr;

    .line 62
    .line 63
    iget-object v8, v11, Lz83;->g0:Lea6;

    .line 64
    .line 65
    iget-object v9, v11, Lz83;->f0:Ljava/lang/String;

    .line 66
    .line 67
    :try_start_0
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    move v12, v14

    .line 71
    goto/16 :goto_13

    .line 72
    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto/16 :goto_16

    .line 75
    .line 76
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v4

    .line 82
    :cond_2
    iget v3, v11, Lz83;->m0:I

    .line 83
    .line 84
    iget-boolean v1, v11, Lz83;->l0:Z

    .line 85
    .line 86
    iget-boolean v6, v11, Lz83;->k0:Z

    .line 87
    .line 88
    iget-object v7, v11, Lz83;->h0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, Ljava/lang/String;

    .line 91
    .line 92
    iget-object v8, v11, Lz83;->g0:Lea6;

    .line 93
    .line 94
    iget-object v9, v11, Lz83;->f0:Ljava/lang/String;

    .line 95
    .line 96
    :try_start_1
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    check-cast v2, Lsj6;

    .line 100
    .line 101
    iget-object v2, v2, Lsj6;->X:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    move-object/from16 v19, v2

    .line 104
    .line 105
    move v2, v1

    .line 106
    move-object v1, v4

    .line 107
    move-object/from16 v4, v19

    .line 108
    .line 109
    move-object/from16 v19, v5

    .line 110
    .line 111
    move v5, v3

    .line 112
    move-object/from16 v3, v19

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_3
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :try_start_2
    new-instance v2, Lea6;

    .line 120
    .line 121
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    sget-object v3, Lkw4;->a:Lkw4;

    .line 125
    .line 126
    invoke-static/range {p2 .. p2}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iput-object v3, v2, Lea6;->X:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 131
    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    :try_start_3
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-static {v3, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_4

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 148
    .line 149
    const-string v1, "Subscription is not allowed to renew"

    .line 150
    .line 151
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    move v3, v15

    .line 157
    goto/16 :goto_16

    .line 158
    .line 159
    :cond_5
    :goto_2
    :try_start_4
    iget-object v3, v2, Lea6;->X:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v3, Lsu/happ/proxyutility/dto/SubscriptionItem;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 162
    .line 163
    if-eqz v3, :cond_6

    .line 164
    .line 165
    :try_start_5
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 169
    goto :goto_3

    .line 170
    :cond_6
    move-object v3, v4

    .line 171
    :goto_3
    :try_start_6
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 175
    if-eqz v3, :cond_8

    .line 176
    .line 177
    :try_start_7
    iget-object v3, v2, Lea6;->X:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v3, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 180
    .line 181
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_8

    .line 186
    .line 187
    iget-object v3, v2, Lea6;->X:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v3, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 190
    .line 191
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->y()Lb12;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    if-eqz v3, :cond_7

    .line 196
    .line 197
    invoke-static {v1, v3}, Li21;->u(Ljava/lang/String;Lb12;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_8

    .line 206
    .line 207
    sget-object v0, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->Companion:Ly83;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->a()Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0

    .line 217
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 218
    .line 219
    invoke-direct {v0, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 223
    :cond_8
    :try_start_8
    iget-object v3, v0, La93;->b:Lcom/tencent/mmkv/MMKV;

    .line 224
    .line 225
    const-string v6, "pref_use_legacy_okhttp"

    .line 226
    .line 227
    invoke-virtual {v3, v6}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-ne v3, v14, :cond_9

    .line 232
    .line 233
    sget-object v3, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 234
    .line 235
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    iget-object v3, v3, Lsu/happ/proxyutility/HappApplication;->B0:Lvz7;

    .line 240
    .line 241
    invoke-virtual {v3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, Lf84;

    .line 246
    .line 247
    :goto_4
    move-object/from16 v6, p2

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_9
    if-nez v3, :cond_a

    .line 251
    .line 252
    sget-object v3, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 253
    .line 254
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    iget-object v3, v3, Lsu/happ/proxyutility/HappApplication;->A0:Lvz7;

    .line 259
    .line 260
    invoke-virtual {v3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    check-cast v3, Loq7;

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_a
    invoke-static {}, Lb61;->c()V

    .line 268
    .line 269
    .line 270
    move-object/from16 v6, p2

    .line 271
    .line 272
    move-object v3, v4

    .line 273
    :goto_5
    iput-object v6, v11, Lz83;->f0:Ljava/lang/String;

    .line 274
    .line 275
    iput-object v2, v11, Lz83;->g0:Lea6;

    .line 276
    .line 277
    iput-object v1, v11, Lz83;->h0:Ljava/lang/Object;

    .line 278
    .line 279
    move/from16 v7, p3

    .line 280
    .line 281
    iput-boolean v7, v11, Lz83;->k0:Z

    .line 282
    .line 283
    move/from16 v10, p7

    .line 284
    .line 285
    iput-boolean v10, v11, Lz83;->l0:Z

    .line 286
    .line 287
    iput v15, v11, Lz83;->m0:I

    .line 288
    .line 289
    iput v14, v11, Lz83;->q0:I

    .line 290
    .line 291
    move-object v7, v5

    .line 292
    move-object v5, v1

    .line 293
    move-object v1, v4

    .line 294
    move-object v4, v3

    .line 295
    move-object v3, v7

    .line 296
    move-object/from16 v7, p4

    .line 297
    .line 298
    move-object/from16 v8, p5

    .line 299
    .line 300
    move-object/from16 v9, p6

    .line 301
    .line 302
    invoke-interface/range {v4 .. v11}, Lzr7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 306
    if-ne v4, v3, :cond_b

    .line 307
    .line 308
    goto/16 :goto_12

    .line 309
    .line 310
    :cond_b
    move-object/from16 v9, p2

    .line 311
    .line 312
    move/from16 v6, p3

    .line 313
    .line 314
    move-object v8, v2

    .line 315
    move-object v7, v5

    .line 316
    move v5, v15

    .line 317
    move/from16 v2, p7

    .line 318
    .line 319
    :goto_6
    :try_start_9
    invoke-static {v4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    check-cast v4, Lpr;

    .line 323
    .line 324
    iget-object v10, v0, La93;->a:Lcom/tencent/mmkv/MMKV;

    .line 325
    .line 326
    const-string v13, "SELECTED_SERVER"

    .line 327
    .line 328
    invoke-virtual {v10, v13}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v13

    .line 332
    if-eqz v13, :cond_c

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_c
    move-object v13, v1

    .line 336
    :goto_7
    if-eqz v13, :cond_d

    .line 337
    .line 338
    sget-object v16, Lkw4;->a:Lkw4;

    .line 339
    .line 340
    invoke-static {v13}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    goto :goto_8

    .line 345
    :cond_d
    move-object v13, v1

    .line 346
    :goto_8
    if-eqz v13, :cond_e

    .line 347
    .line 348
    invoke-virtual {v13}, Lsu/happ/proxyutility/dto/ServerConfig;->i()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v16

    .line 352
    move-object/from16 v1, v16

    .line 353
    .line 354
    :cond_e
    if-nez v1, :cond_f

    .line 355
    .line 356
    move v1, v15

    .line 357
    goto :goto_9

    .line 358
    :cond_f
    invoke-virtual {v1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    :goto_9
    if-eqz v1, :cond_10

    .line 363
    .line 364
    const-string v1, "REMOVED_SERVER"

    .line 365
    .line 366
    sget-object v17, Lkw4;->a:Lkw4;

    .line 367
    .line 368
    invoke-static {}, Lkw4;->g()Lcom/google/gson/a;

    .line 369
    .line 370
    .line 371
    move-result-object v15

    .line 372
    invoke-virtual {v15, v13}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    invoke-virtual {v10, v1, v13}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    :cond_10
    const/16 v1, 0xc8

    .line 380
    .line 381
    const/16 v10, 0x12c

    .line 382
    .line 383
    invoke-static {v1, v10}, Lx97;->a0(II)Lkf3;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    iget-object v10, v4, Lpr;->c:Ljava/lang/Integer;

    .line 388
    .line 389
    if-eqz v10, :cond_12

    .line 390
    .line 391
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    iget v13, v1, Lif3;->X:I

    .line 396
    .line 397
    if-gt v13, v10, :cond_11

    .line 398
    .line 399
    iget v1, v1, Lif3;->Y:I

    .line 400
    .line 401
    if-gt v10, v1, :cond_11

    .line 402
    .line 403
    move v1, v14

    .line 404
    goto :goto_a

    .line 405
    :cond_11
    const/4 v1, 0x0

    .line 406
    :goto_a
    if-eqz v1, :cond_12

    .line 407
    .line 408
    sget-object v1, Lkw4;->a:Lkw4;

    .line 409
    .line 410
    invoke-static {v9}, Lkw4;->r(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    goto :goto_b

    .line 414
    :catchall_2
    move-exception v0

    .line 415
    move v3, v5

    .line 416
    goto/16 :goto_16

    .line 417
    .line 418
    :cond_12
    :goto_b
    sget-object v1, Lkw4;->a:Lkw4;

    .line 419
    .line 420
    invoke-static {v9}, Lkw4;->a(Ljava/lang/String;)I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    sget-object v10, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 425
    .line 426
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 427
    .line 428
    .line 429
    move-result-object v10

    .line 430
    invoke-virtual {v10}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 431
    .line 432
    .line 433
    move-result-object v10

    .line 434
    new-instance v13, Lux2;

    .line 435
    .line 436
    invoke-direct {v13, v14, v1, v8, v4}, Lux2;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v10, v13}, Lkf4;->h(Lgn2;)V

    .line 440
    .line 441
    .line 442
    iget-object v1, v4, Lpr;->b:Ljava/util/Map;

    .line 443
    .line 444
    if-eqz v1, :cond_1f

    .line 445
    .line 446
    iget-object v10, v8, Lea6;->X:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v10, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 449
    .line 450
    invoke-static {v7, v10, v4}, La93;->a(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Lpr;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    invoke-static {v1}, Loz2;->a(Ljava/util/Map;)Lsu/happ/proxyutility/dto/MetaParams;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    new-instance v13, Lhu;

    .line 462
    .line 463
    const/4 v15, 0x6

    .line 464
    invoke-direct {v13, v7, v15}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 465
    .line 466
    .line 467
    new-instance v15, Ly2;

    .line 468
    .line 469
    const/16 v14, 0x1b

    .line 470
    .line 471
    invoke-direct {v15, v14}, Ly2;-><init>(B)V

    .line 472
    .line 473
    .line 474
    new-instance v14, Lla2;

    .line 475
    .line 476
    move-object/from16 v18, v12

    .line 477
    .line 478
    const/4 v12, 0x1

    .line 479
    invoke-direct {v14, v13, v12, v15}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 480
    .line 481
    .line 482
    sget-object v12, Lp60;->X:Lp60;

    .line 483
    .line 484
    invoke-static {v14, v12}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 485
    .line 486
    .line 487
    move-result-object v13

    .line 488
    sget-object v14, Lq60;->X:Lq60;

    .line 489
    .line 490
    invoke-static {v13, v14}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 491
    .line 492
    .line 493
    move-result-object v13

    .line 494
    invoke-static {v13}, Lw27;->n0(Lu27;)Ljava/util/List;

    .line 495
    .line 496
    .line 497
    move-result-object v13

    .line 498
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 499
    .line 500
    .line 501
    move-result v15

    .line 502
    if-nez v15, :cond_13

    .line 503
    .line 504
    sget-object v12, Lsu/happ/proxyutility/dto/MetaParams;->Companion:Lsu/happ/proxyutility/dto/MetaParams$Companion;

    .line 505
    .line 506
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    const/4 v12, 0x0

    .line 510
    invoke-static {v13, v12}, Lsu/happ/proxyutility/dto/MetaParams$Companion;->a(Ljava/util/List;Z)Lsu/happ/proxyutility/dto/MetaParams;

    .line 511
    .line 512
    .line 513
    move-result-object v13

    .line 514
    move-object/from16 p1, v3

    .line 515
    .line 516
    goto :goto_c

    .line 517
    :cond_13
    sget-object v13, Lss8;->a:Lss8;

    .line 518
    .line 519
    invoke-static {v7}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v13

    .line 523
    sget-object v15, Lsu/happ/proxyutility/dto/MetaParams;->Companion:Lsu/happ/proxyutility/dto/MetaParams$Companion;

    .line 524
    .line 525
    move-object/from16 p3, v15

    .line 526
    .line 527
    new-instance v15, Lhu;

    .line 528
    .line 529
    const/4 v0, 0x6

    .line 530
    invoke-direct {v15, v13, v0}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 531
    .line 532
    .line 533
    new-instance v0, Ly2;

    .line 534
    .line 535
    const/16 v13, 0x1b

    .line 536
    .line 537
    invoke-direct {v0, v13}, Ly2;-><init>(B)V

    .line 538
    .line 539
    .line 540
    new-instance v13, Lla2;

    .line 541
    .line 542
    move-object/from16 p1, v3

    .line 543
    .line 544
    const/4 v3, 0x1

    .line 545
    invoke-direct {v13, v15, v3, v0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 546
    .line 547
    .line 548
    invoke-static {v13, v12}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-static {v0, v14}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-static {v0}, Lw27;->n0(Lu27;)Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    const/4 v12, 0x0

    .line 564
    invoke-static {v0, v12}, Lsu/happ/proxyutility/dto/MetaParams$Companion;->a(Ljava/util/List;Z)Lsu/happ/proxyutility/dto/MetaParams;

    .line 565
    .line 566
    .line 567
    move-result-object v13

    .line 568
    :goto_c
    invoke-static {v10, v13}, Llj6;->a(Lsu/happ/proxyutility/dto/MetaParams;Lsu/happ/proxyutility/dto/MetaParams;)Lsu/happ/proxyutility/dto/MetaParams;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    new-instance v3, Lsu/happ/proxyutility/dto/MetaParams;

    .line 573
    .line 574
    const/4 v10, -0x1

    .line 575
    const/4 v12, 0x0

    .line 576
    invoke-direct {v3, v12, v10}, Lsu/happ/proxyutility/dto/MetaParams;-><init>(Ljava/lang/Boolean;I)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0, v3}, Lsu/happ/proxyutility/dto/MetaParams;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    if-eqz v3, :cond_14

    .line 584
    .line 585
    const/4 v1, 0x0

    .line 586
    const/4 v12, 0x1

    .line 587
    goto :goto_f

    .line 588
    :cond_14
    invoke-static {v9}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    if-nez v3, :cond_15

    .line 593
    .line 594
    const/4 v3, 0x0

    .line 595
    const/4 v12, 0x1

    .line 596
    goto :goto_e

    .line 597
    :cond_15
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 598
    .line 599
    .line 600
    move-result-object v10

    .line 601
    if-eqz v10, :cond_16

    .line 602
    .line 603
    invoke-static {v0, v10, v6}, Lsu/happ/proxyutility/dto/MetaParams$Companion;->c(Lsu/happ/proxyutility/dto/MetaParams;Lsu/happ/proxyutility/dto/MetaParams;Z)Lsu/happ/proxyutility/dto/MetaParams;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    :cond_16
    invoke-virtual {v3, v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->r0(Lsu/happ/proxyutility/dto/MetaParams;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->p()Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    if-nez v0, :cond_17

    .line 615
    .line 616
    const-string v0, "Encrypt-Tag"

    .line 617
    .line 618
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    if-eqz v0, :cond_17

    .line 623
    .line 624
    const/4 v12, 0x1

    .line 625
    invoke-virtual {v3, v12}, Lsu/happ/proxyutility/dto/SubscriptionItem;->i0(Z)V

    .line 626
    .line 627
    .line 628
    goto :goto_d

    .line 629
    :cond_17
    const/4 v12, 0x1

    .line 630
    :goto_d
    invoke-static {v3, v9}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    :goto_e
    iput-object v3, v8, Lea6;->X:Ljava/lang/Object;

    .line 634
    .line 635
    move v1, v12

    .line 636
    :goto_f
    sget-object v0, Lq23;->Z:Lk42;

    .line 637
    .line 638
    iget-object v3, v4, Lpr;->c:Ljava/lang/Integer;

    .line 639
    .line 640
    if-eqz v3, :cond_1e

    .line 641
    .line 642
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    sget-object v0, Lq23;->h0:Ln22;

    .line 650
    .line 651
    invoke-virtual {v0}, Lz1;->iterator()Ljava/util/Iterator;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 656
    .line 657
    .line 658
    move-result v10

    .line 659
    if-eqz v10, :cond_19

    .line 660
    .line 661
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v10

    .line 665
    move-object v13, v10

    .line 666
    check-cast v13, Lq23;

    .line 667
    .line 668
    iget-short v13, v13, Lq23;->X:S

    .line 669
    .line 670
    if-ne v13, v3, :cond_18

    .line 671
    .line 672
    goto :goto_10

    .line 673
    :cond_19
    const/4 v10, 0x0

    .line 674
    :goto_10
    move-object v0, v10

    .line 675
    check-cast v0, Lq23;

    .line 676
    .line 677
    iget-object v3, v8, Lea6;->X:Ljava/lang/Object;

    .line 678
    .line 679
    if-eqz v3, :cond_1c

    .line 680
    .line 681
    sget-object v3, Lkw4;->a:Lkw4;

    .line 682
    .line 683
    invoke-static {v9}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    if-nez v3, :cond_1a

    .line 688
    .line 689
    const/4 v3, 0x0

    .line 690
    goto :goto_11

    .line 691
    :cond_1a
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->g()V

    .line 692
    .line 693
    .line 694
    invoke-static {v3, v9}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    :goto_11
    iput-object v3, v8, Lea6;->X:Ljava/lang/Object;

    .line 698
    .line 699
    sget-object v3, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 700
    .line 701
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    iget-object v3, v3, Lsu/happ/proxyutility/HappApplication;->m0:Lvz7;

    .line 706
    .line 707
    invoke-virtual {v3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    check-cast v3, Lus;

    .line 712
    .line 713
    iput-object v9, v11, Lz83;->f0:Ljava/lang/String;

    .line 714
    .line 715
    iput-object v8, v11, Lz83;->g0:Lea6;

    .line 716
    .line 717
    iput-object v4, v11, Lz83;->h0:Ljava/lang/Object;

    .line 718
    .line 719
    iput-object v7, v11, Lz83;->i0:Ljava/lang/String;

    .line 720
    .line 721
    iput-object v0, v11, Lz83;->j0:Lq23;

    .line 722
    .line 723
    iput-boolean v6, v11, Lz83;->k0:Z

    .line 724
    .line 725
    iput-boolean v2, v11, Lz83;->l0:Z

    .line 726
    .line 727
    iput v5, v11, Lz83;->m0:I

    .line 728
    .line 729
    iput v1, v11, Lz83;->n0:I

    .line 730
    .line 731
    const/4 v2, 0x2

    .line 732
    iput v2, v11, Lz83;->q0:I

    .line 733
    .line 734
    invoke-virtual {v3, v9, v11}, Lus;->a(Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 738
    move-object/from16 v3, p1

    .line 739
    .line 740
    if-ne v2, v3, :cond_1b

    .line 741
    .line 742
    :goto_12
    return-object v3

    .line 743
    :cond_1b
    move v3, v5

    .line 744
    move-object v6, v7

    .line 745
    move-object v5, v0

    .line 746
    move-object v7, v4

    .line 747
    move-object/from16 v0, p0

    .line 748
    .line 749
    :goto_13
    :try_start_a
    iget-object v0, v0, La93;->c:Lm51;

    .line 750
    .line 751
    new-instance v2, Ly9;

    .line 752
    .line 753
    const/4 v4, 0x5

    .line 754
    const/4 v10, 0x0

    .line 755
    invoke-direct {v2, v8, v9, v10, v4}, Ly9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 756
    .line 757
    .line 758
    const/4 v4, 0x3

    .line 759
    invoke-static {v0, v10, v2, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 760
    .line 761
    .line 762
    move-object v0, v5

    .line 763
    move-object v4, v7

    .line 764
    move-object v7, v6

    .line 765
    goto :goto_14

    .line 766
    :cond_1c
    move v3, v5

    .line 767
    :goto_14
    new-instance v2, Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 768
    .line 769
    new-instance v5, Lpr;

    .line 770
    .line 771
    iget-object v6, v4, Lpr;->b:Ljava/util/Map;

    .line 772
    .line 773
    iget-object v4, v4, Lpr;->c:Ljava/lang/Integer;

    .line 774
    .line 775
    invoke-direct {v5, v7, v6, v4}, Lpr;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)V

    .line 776
    .line 777
    .line 778
    if-eqz v1, :cond_1d

    .line 779
    .line 780
    move v14, v12

    .line 781
    goto :goto_15

    .line 782
    :cond_1d
    const/4 v14, 0x0

    .line 783
    :goto_15
    invoke-direct {v2, v5, v14, v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;-><init>(Lpr;ZLq23;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 784
    .line 785
    .line 786
    return-object v2

    .line 787
    :cond_1e
    :try_start_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 788
    .line 789
    move-object/from16 v1, v18

    .line 790
    .line 791
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    throw v0

    .line 795
    :cond_1f
    move-object v1, v12

    .line 796
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 797
    .line 798
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 802
    :catchall_3
    move-exception v0

    .line 803
    const/4 v3, 0x0

    .line 804
    :goto_16
    if-eqz v3, :cond_20

    .line 805
    .line 806
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    const-string v2, "util.protection"

    .line 811
    .line 812
    const/4 v12, 0x0

    .line 813
    invoke-static {v1, v2, v12}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    if-nez v1, :cond_20

    .line 818
    .line 819
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 820
    .line 821
    .line 822
    :cond_20
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 823
    .line 824
    if-nez v1, :cond_21

    .line 825
    .line 826
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 827
    .line 828
    if-nez v1, :cond_21

    .line 829
    .line 830
    new-instance v1, Lrj6;

    .line 831
    .line 832
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 833
    .line 834
    .line 835
    return-object v1

    .line 836
    :cond_21
    throw v0
.end method
