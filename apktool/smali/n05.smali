.class public final Ln05;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Law3;
.implements Ljava/util/Set;
.implements Lqv3;


# instance fields
.field public final X:Ll05;

.field public final Y:Ll05;


# direct methods
.method public constructor <init>(Ll05;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln05;->X:Ll05;

    .line 5
    .line 6
    iput-object p1, p0, Ln05;->Y:Ll05;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ln05;->Y:Ll05;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll05;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    iget-object p0, p0, Ln05;->Y:Ll05;

    .line 7
    .line 8
    iget v0, p0, Ll05;->g:I

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0, v1}, Ll05;->d(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p0, Ll05;->b:[Ljava/lang/Object;

    .line 29
    .line 30
    aput-object v1, v3, v2

    .line 31
    .line 32
    iget-object v1, p0, Ll05;->c:[J

    .line 33
    .line 34
    iget v3, p0, Ll05;->d:I

    .line 35
    .line 36
    int-to-long v4, v3

    .line 37
    const-wide/32 v6, 0x7fffffff

    .line 38
    .line 39
    .line 40
    and-long/2addr v4, v6

    .line 41
    const-wide v8, 0x3fffffff80000000L    # 1.9999995231628418

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    or-long/2addr v4, v8

    .line 47
    aput-wide v4, v1, v2

    .line 48
    .line 49
    const v4, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-eq v3, v4, :cond_1

    .line 53
    .line 54
    aget-wide v8, v1, v3

    .line 55
    .line 56
    const-wide v10, -0x3fffffff80000001L    # -2.000000953674316

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    and-long/2addr v8, v10

    .line 62
    int-to-long v10, v2

    .line 63
    and-long v5, v10, v6

    .line 64
    .line 65
    const/16 v7, 0x1f

    .line 66
    .line 67
    shl-long/2addr v5, v7

    .line 68
    or-long/2addr v5, v8

    .line 69
    aput-wide v5, v1, v3

    .line 70
    .line 71
    :cond_1
    iput v2, p0, Ll05;->d:I

    .line 72
    .line 73
    iget v1, p0, Ll05;->e:I

    .line 74
    .line 75
    if-ne v1, v4, :cond_0

    .line 76
    .line 77
    iput v2, p0, Ll05;->e:I

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iget p0, p0, Ll05;->g:I

    .line 81
    .line 82
    if-eq v0, p0, :cond_3

    .line 83
    .line 84
    const/4 p0, 0x1

    .line 85
    return p0

    .line 86
    :cond_3
    const/4 p0, 0x0

    .line 87
    return p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Ln05;->Y:Ll05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ll05;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ln05;->X:Ll05;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll05;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Ln05;->X:Ll05;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ll05;->c(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_1
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Ln05;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Ln05;

    .line 17
    .line 18
    iget-object p0, p0, Ln05;->X:Ll05;

    .line 19
    .line 20
    iget-object p1, p1, Ln05;->X:Ll05;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ll05;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ln05;->X:Ll05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ll05;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ln05;->X:Ll05;

    .line 2
    .line 3
    iget p0, p0, Ll05;->g:I

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lfq2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lfq2;-><init>(Ln05;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ln05;->Y:Ll05;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll05;->g(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 18

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v1, v1, Ln05;->Y:Ll05;

    .line 11
    .line 12
    iget v2, v1, Ll05;->g:I

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x1

    .line 23
    const/4 v5, 0x0

    .line 24
    if-eqz v3, :cond_5

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v6, v5

    .line 38
    :goto_1
    const v7, -0x3361d2af    # -8.293031E7f

    .line 39
    .line 40
    .line 41
    mul-int/2addr v6, v7

    .line 42
    shl-int/lit8 v7, v6, 0x10

    .line 43
    .line 44
    xor-int/2addr v6, v7

    .line 45
    and-int/lit8 v7, v6, 0x7f

    .line 46
    .line 47
    iget v8, v1, Ll05;->f:I

    .line 48
    .line 49
    ushr-int/lit8 v6, v6, 0x7

    .line 50
    .line 51
    and-int/2addr v6, v8

    .line 52
    :goto_2
    iget-object v9, v1, Ll05;->a:[J

    .line 53
    .line 54
    shr-int/lit8 v10, v6, 0x3

    .line 55
    .line 56
    and-int/lit8 v11, v6, 0x7

    .line 57
    .line 58
    shl-int/lit8 v11, v11, 0x3

    .line 59
    .line 60
    aget-wide v12, v9, v10

    .line 61
    .line 62
    ushr-long/2addr v12, v11

    .line 63
    add-int/2addr v10, v4

    .line 64
    aget-wide v14, v9, v10

    .line 65
    .line 66
    rsub-int/lit8 v9, v11, 0x40

    .line 67
    .line 68
    shl-long v9, v14, v9

    .line 69
    .line 70
    int-to-long v14, v11

    .line 71
    neg-long v14, v14

    .line 72
    const/16 v11, 0x3f

    .line 73
    .line 74
    shr-long/2addr v14, v11

    .line 75
    and-long/2addr v9, v14

    .line 76
    or-long/2addr v9, v12

    .line 77
    int-to-long v11, v7

    .line 78
    const-wide v13, 0x101010101010101L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    mul-long/2addr v11, v13

    .line 84
    xor-long/2addr v11, v9

    .line 85
    sub-long v13, v11, v13

    .line 86
    .line 87
    not-long v11, v11

    .line 88
    and-long/2addr v11, v13

    .line 89
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    and-long/2addr v11, v13

    .line 95
    :goto_3
    const-wide/16 v15, 0x0

    .line 96
    .line 97
    cmp-long v17, v11, v15

    .line 98
    .line 99
    if-eqz v17, :cond_3

    .line 100
    .line 101
    invoke-static {v11, v12}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    shr-int/lit8 v15, v15, 0x3

    .line 106
    .line 107
    add-int/2addr v15, v6

    .line 108
    and-int/2addr v15, v8

    .line 109
    move/from16 p0, v4

    .line 110
    .line 111
    iget-object v4, v1, Ll05;->b:[Ljava/lang/Object;

    .line 112
    .line 113
    aget-object v4, v4, v15

    .line 114
    .line 115
    invoke-static {v4, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_2

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_2
    const-wide/16 v15, 0x1

    .line 123
    .line 124
    sub-long v15, v11, v15

    .line 125
    .line 126
    and-long/2addr v11, v15

    .line 127
    move/from16 v4, p0

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    move/from16 p0, v4

    .line 131
    .line 132
    not-long v11, v9

    .line 133
    const/4 v4, 0x6

    .line 134
    shl-long/2addr v11, v4

    .line 135
    and-long/2addr v9, v11

    .line 136
    and-long/2addr v9, v13

    .line 137
    cmp-long v4, v9, v15

    .line 138
    .line 139
    if-eqz v4, :cond_4

    .line 140
    .line 141
    const/4 v15, -0x1

    .line 142
    :goto_4
    if-ltz v15, :cond_0

    .line 143
    .line 144
    invoke-virtual {v1, v15}, Ll05;->h(I)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_4
    add-int/lit8 v5, v5, 0x8

    .line 150
    .line 151
    add-int/2addr v6, v5

    .line 152
    and-int/2addr v6, v8

    .line 153
    move/from16 v4, p0

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move/from16 p0, v4

    .line 157
    .line 158
    iget v0, v1, Ll05;->g:I

    .line 159
    .line 160
    if-eq v2, v0, :cond_6

    .line 161
    .line 162
    return p0

    .line 163
    :cond_6
    return v5
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ln05;->Y:Ll05;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ll05;->i(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Ln05;->X:Ll05;

    .line 2
    .line 3
    iget p0, p0, Ll05;->g:I

    .line 4
    .line 5
    return p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-static {p0}, Lwl7;->Z(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lwl7;->a0(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ln05;->X:Ll05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ll05;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
