.class public final Ll27;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Lvz7;

.field public final e:Loh7;

.field public final f:Lh76;

.field public g:Log7;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lsu/happ/proxyutility/dto/SocketServerInfo;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lhr5;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lvz7;

    .line 12
    .line 13
    invoke-direct {p1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ll27;->b:Lvz7;

    .line 17
    .line 18
    new-instance p1, Lw76;

    .line 19
    .line 20
    const/16 v0, 0x1b

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lw76;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lvz7;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ll27;->c:Lvz7;

    .line 31
    .line 32
    new-instance p1, Lw76;

    .line 33
    .line 34
    const/16 v0, 0x1c

    .line 35
    .line 36
    invoke-direct {p1, v0}, Lw76;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Lvz7;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Ll27;->d:Lvz7;

    .line 45
    .line 46
    new-instance p1, Le27;

    .line 47
    .line 48
    sget-object v0, Lec7;->Y:Lec7;

    .line 49
    .line 50
    sget-object v1, Lkm5;->f0:Lkm5;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-direct {p1, p2, v0, v1, v2}, Le27;-><init>(Lsu/happ/proxyutility/dto/SocketServerInfo;Lb83;Lc83;Lc83;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Ll27;->e:Loh7;

    .line 61
    .line 62
    invoke-static {p1}, Ljm4;->n(Loh7;)Lh76;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Ll27;->f:Lh76;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final e()Le27;
    .locals 0

    .line 1
    iget-object p0, p0, Ll27;->e:Loh7;

    .line 2
    .line 3
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Le27;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lg27;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lg27;

    .line 7
    .line 8
    iget v1, v0, Lg27;->h0:I

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
    iput v1, v0, Lg27;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lg27;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lg27;-><init>(Ll27;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lg27;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lg27;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    check-cast p1, Lsj6;

    .line 39
    .line 40
    iget-object p0, p1, Lsj6;->X:Ljava/lang/Object;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Ll27;->c:Lvz7;

    .line 53
    .line 54
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lu17;

    .line 59
    .line 60
    invoke-virtual {p0}, Ll27;->e()Le27;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Le27;->a:Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 65
    .line 66
    invoke-virtual {p0}, Ll27;->e()Le27;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget-object p0, p0, Le27;->d:Lc83;

    .line 71
    .line 72
    if-eqz p0, :cond_7

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    new-array v2, v2, [Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {p0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, [Ljava/lang/String;

    .line 82
    .line 83
    array-length v2, p0

    .line 84
    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, [Ljava/lang/String;

    .line 89
    .line 90
    iput v3, v0, Lg27;->h0:I

    .line 91
    .line 92
    invoke-virtual {p1, v1, p0, v0}, Lu17;->a(Lsu/happ/proxyutility/dto/SocketServerInfo;[Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    sget-object p1, Lc71;->X:Lc71;

    .line 97
    .line 98
    if-ne p0, p1, :cond_3

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_3
    :goto_1
    invoke-static {p0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-nez p1, :cond_5

    .line 106
    .line 107
    check-cast p0, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    const/16 p1, 0xc8

    .line 114
    .line 115
    if-ne p0, p1, :cond_4

    .line 116
    .line 117
    sget-object p0, Lp27;->a:Lp27;

    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_4
    new-instance p1, Ln27;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Ln27;-><init>(I)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :cond_5
    sget-object p0, Lss8;->a:Lss8;

    .line 127
    .line 128
    invoke-static {}, Lss8;->x()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_6

    .line 133
    .line 134
    sget-object p0, Lq27;->a:Lq27;

    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_6
    sget-object p0, Lm27;->a:Lm27;

    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_7
    const-string p0, "Required value was null."

    .line 141
    .line 142
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v2
.end method

.method public final g(Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Lh27;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lh27;

    .line 7
    .line 8
    iget v1, v0, Lh27;->h0:I

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
    iput v1, v0, Lh27;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lh27;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lh27;-><init>(Ll27;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lh27;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lh27;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v2, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_9

    .line 44
    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    sget-object p1, Ltp1;->a:Lnf1;

    .line 61
    .line 62
    new-instance v1, Ll40;

    .line 63
    .line 64
    const/16 v6, 0xd

    .line 65
    .line 66
    invoke-direct {v1, p0, v4, v6}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 67
    .line 68
    .line 69
    iput v2, v0, Lh27;->h0:I

    .line 70
    .line 71
    invoke-static {p1, v1, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v5, :cond_4

    .line 76
    .line 77
    goto :goto_8

    .line 78
    :cond_4
    :goto_1
    check-cast p1, Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :goto_2
    instance-of v1, p1, Ljava/lang/InterruptedException;

    .line 82
    .line 83
    if-nez v1, :cond_d

    .line 84
    .line 85
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 86
    .line 87
    if-nez v1, :cond_d

    .line 88
    .line 89
    new-instance v1, Lrj6;

    .line 90
    .line 91
    invoke-direct {v1, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object p1, v1

    .line 95
    :goto_3
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-nez v1, :cond_c

    .line 100
    .line 101
    check-cast p1, Ljava/util/Set;

    .line 102
    .line 103
    :cond_5
    iget-object v1, p0, Ll27;->e:Loh7;

    .line 104
    .line 105
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    move-object v6, v2

    .line 110
    check-cast v6, Le27;

    .line 111
    .line 112
    move-object v7, p1

    .line 113
    check-cast v7, Ljava/lang/Iterable;

    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    instance-of v8, v7, Lc83;

    .line 119
    .line 120
    if-eqz v8, :cond_6

    .line 121
    .line 122
    move-object v8, v7

    .line 123
    check-cast v8, Lc83;

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    move-object v8, v4

    .line 127
    :goto_4
    if-nez v8, :cond_a

    .line 128
    .line 129
    instance-of v8, v7, Lmm5;

    .line 130
    .line 131
    if-eqz v8, :cond_7

    .line 132
    .line 133
    move-object v8, v7

    .line 134
    check-cast v8, Lmm5;

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move-object v8, v4

    .line 138
    :goto_5
    if-eqz v8, :cond_8

    .line 139
    .line 140
    invoke-virtual {v8}, Lmm5;->b()Lkm5;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    goto :goto_6

    .line 145
    :cond_8
    move-object v8, v4

    .line 146
    :goto_6
    if-eqz v8, :cond_9

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_9
    sget-object v8, Lkm5;->f0:Lkm5;

    .line 150
    .line 151
    invoke-static {v8, v7}, Lmb6;->V(Lkm5;Ljava/lang/Iterable;)Lkm5;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    :cond_a
    :goto_7
    const/4 v7, 0x7

    .line 156
    invoke-static {v6, v4, v4, v8, v7}, Le27;->a(Le27;Lb83;Lkm5;Lc83;I)Le27;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v1, v2, v6}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_5

    .line 165
    .line 166
    iput v3, v0, Lh27;->h0:I

    .line 167
    .line 168
    invoke-virtual {p0, p1, v0}, Ll27;->h(Ljava/util/Set;Ls51;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-ne p1, v5, :cond_b

    .line 173
    .line 174
    :goto_8
    return-object v5

    .line 175
    :cond_b
    :goto_9
    check-cast p1, Lr27;

    .line 176
    .line 177
    goto :goto_a

    .line 178
    :cond_c
    sget-object p1, Lq27;->a:Lq27;

    .line 179
    .line 180
    :goto_a
    return-object p1

    .line 181
    :cond_d
    throw p1
.end method

.method public final h(Ljava/util/Set;Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lk27;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lk27;

    .line 7
    .line 8
    iget v1, v0, Lk27;->h0:I

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
    iput v1, v0, Lk27;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk27;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lk27;-><init>(Ll27;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lk27;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lk27;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    check-cast p2, Lsj6;

    .line 38
    .line 39
    iget-object p0, p2, Lsj6;->X:Ljava/lang/Object;

    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Ll27;->e()Le27;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iget-object p2, p2, Le27;->a:Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 58
    .line 59
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/SocketServerInfo;->c()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    sget-object v1, Lss8;->a:Lss8;

    .line 64
    .line 65
    invoke-static {}, Lss8;->l()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-eqz p2, :cond_9

    .line 70
    .line 71
    invoke-virtual {p0}, Ll27;->e()Le27;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget-object v3, v3, Le27;->a:Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 76
    .line 77
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/SocketServerInfo;->d()Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-nez v3, :cond_3

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_3
    if-eqz v1, :cond_8

    .line 85
    .line 86
    invoke-static {p2}, Lwl7;->f0(Ljava/lang/String;)[I

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const/4 v3, 0x0

    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    const/4 v4, 0x3

    .line 94
    invoke-static {v3, v4}, Lx97;->a0(II)Lkf3;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {p2, v5}, Leu;->G0([ILkf3;)[I

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-static {v1}, Lwl7;->f0(Ljava/lang/String;)[I

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    invoke-static {v3, v4}, Lx97;->a0(II)Lkf3;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v1, v4}, Leu;->G0([ILkf3;)[I

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {p2, v1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    goto :goto_1

    .line 121
    :cond_4
    move p2, v3

    .line 122
    :goto_1
    if-nez p2, :cond_5

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    iget-object p2, p0, Ll27;->c:Lvz7;

    .line 126
    .line 127
    invoke-virtual {p2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    check-cast p2, Lu17;

    .line 132
    .line 133
    invoke-virtual {p0}, Ll27;->e()Le27;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iget-object p0, p0, Le27;->a:Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 138
    .line 139
    check-cast p1, Ljava/util/Collection;

    .line 140
    .line 141
    new-array v1, v3, [Ljava/lang/String;

    .line 142
    .line 143
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    check-cast p1, [Ljava/lang/String;

    .line 148
    .line 149
    array-length v1, p1

    .line 150
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, [Ljava/lang/String;

    .line 155
    .line 156
    iput v2, v0, Lk27;->h0:I

    .line 157
    .line 158
    invoke-virtual {p2, p0, p1, v0}, Lu17;->b(Lsu/happ/proxyutility/dto/SocketServerInfo;[Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    sget-object p1, Lc71;->X:Lc71;

    .line 163
    .line 164
    if-ne p0, p1, :cond_6

    .line 165
    .line 166
    return-object p1

    .line 167
    :cond_6
    :goto_2
    invoke-static {p0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-nez p1, :cond_7

    .line 172
    .line 173
    check-cast p0, Ldn8;

    .line 174
    .line 175
    sget-object p0, Lp27;->a:Lp27;

    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_7
    new-instance p0, Lo27;

    .line 179
    .line 180
    sget p1, Ly46;->send_to_tv_failure_timeout:I

    .line 181
    .line 182
    invoke-direct {p0, p1}, Lo27;-><init>(I)V

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :cond_8
    :goto_3
    new-instance p0, Lo27;

    .line 187
    .line 188
    sget p1, Ly46;->send_to_tv_failure_wrong_wifi:I

    .line 189
    .line 190
    invoke-direct {p0, p1}, Lo27;-><init>(I)V

    .line 191
    .line 192
    .line 193
    return-object p0

    .line 194
    :cond_9
    :goto_4
    new-instance p0, Lo27;

    .line 195
    .line 196
    sget p1, Ly46;->send_to_tv_failure_no_wifi:I

    .line 197
    .line 198
    invoke-direct {p0, p1}, Lo27;-><init>(I)V

    .line 199
    .line 200
    .line 201
    return-object p0
.end method
