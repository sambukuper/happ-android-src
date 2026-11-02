.class public final Lhu3;
.super Lup2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lou4;


# instance fields
.field public Y:I

.field public Z:I

.field public f0:I

.field public g0:Ljava/lang/Object;

.field public h0:Liu3;

.field public i0:Ljava/util/List;

.field public j0:Ljava/util/List;


# direct methods
.method public static g()Lhu3;
    .locals 2

    .line 1
    new-instance v0, Lhu3;

    .line 2
    .line 3
    invoke-direct {v0}, Lup2;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput v1, v0, Lhu3;->Z:I

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    iput-object v1, v0, Lhu3;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object v1, Liu3;->Y:Liu3;

    .line 14
    .line 15
    iput-object v1, v0, Lhu3;->h0:Liu3;

    .line 16
    .line 17
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    iput-object v1, v0, Lhu3;->i0:Ljava/util/List;

    .line 20
    .line 21
    iput-object v1, v0, Lhu3;->j0:Ljava/util/List;

    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public final b()Ld2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhu3;->f()Lju3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lju3;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lxm8;

    .line 13
    .line 14
    invoke-direct {p0}, Lxm8;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public final c(Liv0;Lr62;)Lup2;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lju3;->p0:Lau3;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lju3;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lju3;-><init>(Liv0;)V
    :try_end_0
    .catch Lrh3; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lhu3;->h(Lju3;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    iget-object v0, p1, Lrh3;->X:Ld2;

    .line 20
    .line 21
    check-cast v0, Lju3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    move-object p2, v0

    .line 26
    :goto_0
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lhu3;->h(Lju3;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lhu3;->g()Lhu3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lhu3;->f()Lju3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lhu3;->h(Lju3;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge synthetic e(Lbq2;)Lup2;
    .locals 0

    .line 1
    check-cast p1, Lju3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lhu3;->h(Lju3;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final f()Lju3;
    .locals 5

    .line 1
    new-instance v0, Lju3;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lju3;-><init>(Lhu3;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lhu3;->Y:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :goto_0
    iget v2, p0, Lhu3;->Z:I

    .line 16
    .line 17
    iput v2, v0, Lju3;->Z:I

    .line 18
    .line 19
    and-int/lit8 v2, v1, 0x2

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-ne v2, v4, :cond_1

    .line 23
    .line 24
    or-int/lit8 v3, v3, 0x2

    .line 25
    .line 26
    :cond_1
    iget v2, p0, Lhu3;->f0:I

    .line 27
    .line 28
    iput v2, v0, Lju3;->f0:I

    .line 29
    .line 30
    and-int/lit8 v2, v1, 0x4

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    if-ne v2, v4, :cond_2

    .line 34
    .line 35
    or-int/lit8 v3, v3, 0x4

    .line 36
    .line 37
    :cond_2
    iget-object v2, p0, Lhu3;->g0:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v2, v0, Lju3;->g0:Ljava/lang/Object;

    .line 40
    .line 41
    and-int/lit8 v2, v1, 0x8

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    if-ne v2, v4, :cond_3

    .line 46
    .line 47
    or-int/lit8 v3, v3, 0x8

    .line 48
    .line 49
    :cond_3
    iget-object v2, p0, Lhu3;->h0:Liu3;

    .line 50
    .line 51
    iput-object v2, v0, Lju3;->h0:Liu3;

    .line 52
    .line 53
    and-int/lit8 v2, v1, 0x10

    .line 54
    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    if-ne v2, v4, :cond_4

    .line 58
    .line 59
    iget-object v1, p0, Lhu3;->i0:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput-object v1, p0, Lhu3;->i0:Ljava/util/List;

    .line 66
    .line 67
    iget v1, p0, Lhu3;->Y:I

    .line 68
    .line 69
    and-int/lit8 v1, v1, -0x11

    .line 70
    .line 71
    iput v1, p0, Lhu3;->Y:I

    .line 72
    .line 73
    :cond_4
    iget-object v2, p0, Lhu3;->i0:Ljava/util/List;

    .line 74
    .line 75
    iput-object v2, v0, Lju3;->i0:Ljava/util/List;

    .line 76
    .line 77
    const/16 v2, 0x20

    .line 78
    .line 79
    and-int/2addr v1, v2

    .line 80
    if-ne v1, v2, :cond_5

    .line 81
    .line 82
    iget-object v1, p0, Lhu3;->j0:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, Lhu3;->j0:Ljava/util/List;

    .line 89
    .line 90
    iget v1, p0, Lhu3;->Y:I

    .line 91
    .line 92
    and-int/lit8 v1, v1, -0x21

    .line 93
    .line 94
    iput v1, p0, Lhu3;->Y:I

    .line 95
    .line 96
    :cond_5
    iget-object p0, p0, Lhu3;->j0:Ljava/util/List;

    .line 97
    .line 98
    iput-object p0, v0, Lju3;->k0:Ljava/util/List;

    .line 99
    .line 100
    iput v3, v0, Lju3;->Y:I

    .line 101
    .line 102
    return-object v0
.end method

.method public final h(Lju3;)V
    .locals 4

    .line 1
    sget-object v0, Lju3;->o0:Lju3;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Lju3;->Y:I

    .line 7
    .line 8
    and-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    iget v1, p1, Lju3;->Z:I

    .line 14
    .line 15
    iget v3, p0, Lhu3;->Y:I

    .line 16
    .line 17
    or-int/2addr v2, v3

    .line 18
    iput v2, p0, Lhu3;->Y:I

    .line 19
    .line 20
    iput v1, p0, Lhu3;->Z:I

    .line 21
    .line 22
    :cond_1
    and-int/lit8 v1, v0, 0x2

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p1, Lju3;->f0:I

    .line 28
    .line 29
    iget v3, p0, Lhu3;->Y:I

    .line 30
    .line 31
    or-int/2addr v2, v3

    .line 32
    iput v2, p0, Lhu3;->Y:I

    .line 33
    .line 34
    iput v1, p0, Lhu3;->f0:I

    .line 35
    .line 36
    :cond_2
    and-int/lit8 v1, v0, 0x4

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    if-ne v1, v2, :cond_3

    .line 40
    .line 41
    iget v1, p0, Lhu3;->Y:I

    .line 42
    .line 43
    or-int/2addr v1, v2

    .line 44
    iput v1, p0, Lhu3;->Y:I

    .line 45
    .line 46
    iget-object v1, p1, Lju3;->g0:Ljava/lang/Object;

    .line 47
    .line 48
    iput-object v1, p0, Lhu3;->g0:Ljava/lang/Object;

    .line 49
    .line 50
    :cond_3
    const/16 v1, 0x8

    .line 51
    .line 52
    and-int/2addr v0, v1

    .line 53
    if-ne v0, v1, :cond_4

    .line 54
    .line 55
    iget-object v0, p1, Lju3;->h0:Liu3;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget v2, p0, Lhu3;->Y:I

    .line 61
    .line 62
    or-int/2addr v1, v2

    .line 63
    iput v1, p0, Lhu3;->Y:I

    .line 64
    .line 65
    iput-object v0, p0, Lhu3;->h0:Liu3;

    .line 66
    .line 67
    :cond_4
    iget-object v0, p1, Lju3;->i0:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    iget-object v0, p0, Lhu3;->i0:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    iget-object v0, p1, Lju3;->i0:Ljava/util/List;

    .line 84
    .line 85
    iput-object v0, p0, Lhu3;->i0:Ljava/util/List;

    .line 86
    .line 87
    iget v0, p0, Lhu3;->Y:I

    .line 88
    .line 89
    and-int/lit8 v0, v0, -0x11

    .line 90
    .line 91
    iput v0, p0, Lhu3;->Y:I

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    iget v0, p0, Lhu3;->Y:I

    .line 95
    .line 96
    const/16 v1, 0x10

    .line 97
    .line 98
    and-int/2addr v0, v1

    .line 99
    if-eq v0, v1, :cond_6

    .line 100
    .line 101
    new-instance v0, Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object v2, p0, Lhu3;->i0:Ljava/util/List;

    .line 104
    .line 105
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lhu3;->i0:Ljava/util/List;

    .line 109
    .line 110
    iget v0, p0, Lhu3;->Y:I

    .line 111
    .line 112
    or-int/2addr v0, v1

    .line 113
    iput v0, p0, Lhu3;->Y:I

    .line 114
    .line 115
    :cond_6
    iget-object v0, p0, Lhu3;->i0:Ljava/util/List;

    .line 116
    .line 117
    iget-object v1, p1, Lju3;->i0:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 120
    .line 121
    .line 122
    :cond_7
    :goto_0
    iget-object v0, p1, Lju3;->k0:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_a

    .line 129
    .line 130
    iget-object v0, p0, Lhu3;->j0:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    iget-object v0, p1, Lju3;->k0:Ljava/util/List;

    .line 139
    .line 140
    iput-object v0, p0, Lhu3;->j0:Ljava/util/List;

    .line 141
    .line 142
    iget v0, p0, Lhu3;->Y:I

    .line 143
    .line 144
    and-int/lit8 v0, v0, -0x21

    .line 145
    .line 146
    iput v0, p0, Lhu3;->Y:I

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_8
    iget v0, p0, Lhu3;->Y:I

    .line 150
    .line 151
    const/16 v1, 0x20

    .line 152
    .line 153
    and-int/2addr v0, v1

    .line 154
    if-eq v0, v1, :cond_9

    .line 155
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    .line 157
    .line 158
    iget-object v2, p0, Lhu3;->j0:Ljava/util/List;

    .line 159
    .line 160
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 161
    .line 162
    .line 163
    iput-object v0, p0, Lhu3;->j0:Ljava/util/List;

    .line 164
    .line 165
    iget v0, p0, Lhu3;->Y:I

    .line 166
    .line 167
    or-int/2addr v0, v1

    .line 168
    iput v0, p0, Lhu3;->Y:I

    .line 169
    .line 170
    :cond_9
    iget-object v0, p0, Lhu3;->j0:Ljava/util/List;

    .line 171
    .line 172
    iget-object v1, p1, Lju3;->k0:Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 175
    .line 176
    .line 177
    :cond_a
    :goto_1
    iget-object v0, p0, Lup2;->X:Ljb0;

    .line 178
    .line 179
    iget-object p1, p1, Lju3;->X:Ljb0;

    .line 180
    .line 181
    invoke-virtual {v0, p1}, Ljb0;->b(Ljb0;)Ljb0;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iput-object p1, p0, Lup2;->X:Ljb0;

    .line 186
    .line 187
    return-void
.end method
