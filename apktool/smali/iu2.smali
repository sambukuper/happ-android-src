.class public abstract Liu2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:[Ljava/lang/Object;

.field public b:Lq02;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:[Lcb0;

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v0, p0, Liu2;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Liu2;->f:I

    .line 11
    .line 12
    iput v0, p0, Liu2;->g:I

    .line 13
    .line 14
    iput v0, p0, Liu2;->i:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Liu2;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/high16 v0, -0x80000000

    .line 10
    .line 11
    :goto_0
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p0, v0, v1}, Liu2;->b(IZ)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public b(IZ)Z
    .locals 9

    .line 1
    iget-object v0, p0, Liu2;->b:Lq02;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq02;->G()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-nez p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Liu2;->c(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :goto_0
    return v1

    .line 20
    :cond_1
    iget v0, p0, Liu2;->g:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-ltz v0, :cond_2

    .line 24
    .line 25
    add-int/2addr v0, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget v0, p0, Liu2;->i:I

    .line 28
    .line 29
    const/4 v3, -0x1

    .line 30
    if-eq v0, v3, :cond_3

    .line 31
    .line 32
    iget-object v3, p0, Liu2;->b:Lq02;

    .line 33
    .line 34
    invoke-virtual {v3}, Lq02;->G()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    sub-int/2addr v3, v2

    .line 39
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    move v0, v1

    .line 45
    :goto_1
    move v5, v0

    .line 46
    move v0, v1

    .line 47
    :goto_2
    iget-object v3, p0, Liu2;->b:Lq02;

    .line 48
    .line 49
    invoke-virtual {v3}, Lq02;->G()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ge v5, v3, :cond_a

    .line 54
    .line 55
    iget-object v0, p0, Liu2;->b:Lq02;

    .line 56
    .line 57
    iget-object v3, p0, Liu2;->a:[Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v0, v5, v2, v3, v1}, Lq02;->B(IZ[Ljava/lang/Object;Z)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    iget v0, p0, Liu2;->f:I

    .line 64
    .line 65
    if-ltz v0, :cond_6

    .line 66
    .line 67
    iget v0, p0, Liu2;->g:I

    .line 68
    .line 69
    if-gez v0, :cond_4

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_4
    iget-boolean v0, p0, Liu2;->c:Z

    .line 73
    .line 74
    iget-object v4, p0, Liu2;->b:Lq02;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    add-int/lit8 v0, v5, -0x1

    .line 79
    .line 80
    invoke-virtual {v4, v0}, Lq02;->H(I)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    iget-object v7, p0, Liu2;->b:Lq02;

    .line 85
    .line 86
    invoke-virtual {v7, v0}, Lq02;->L(I)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    sub-int/2addr v4, v0

    .line 91
    iget v0, p0, Liu2;->d:I

    .line 92
    .line 93
    sub-int/2addr v4, v0

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    add-int/lit8 v0, v5, -0x1

    .line 96
    .line 97
    invoke-virtual {v4, v0}, Lq02;->H(I)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    iget-object v7, p0, Liu2;->b:Lq02;

    .line 102
    .line 103
    invoke-virtual {v7, v0}, Lq02;->L(I)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    add-int/2addr v0, v4

    .line 108
    iget v4, p0, Liu2;->d:I

    .line 109
    .line 110
    add-int/2addr v4, v0

    .line 111
    :goto_3
    iput v5, p0, Liu2;->g:I

    .line 112
    .line 113
    :goto_4
    move-object v0, v3

    .line 114
    move v8, v4

    .line 115
    goto :goto_8

    .line 116
    :cond_6
    :goto_5
    iget-boolean v0, p0, Liu2;->c:Z

    .line 117
    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    const v0, 0x7fffffff

    .line 121
    .line 122
    .line 123
    :goto_6
    move v4, v0

    .line 124
    goto :goto_7

    .line 125
    :cond_7
    const/high16 v0, -0x80000000

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :goto_7
    iput v5, p0, Liu2;->f:I

    .line 129
    .line 130
    iput v5, p0, Liu2;->g:I

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :goto_8
    iget-object v3, p0, Liu2;->b:Lq02;

    .line 134
    .line 135
    aget-object v4, v0, v1

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    invoke-virtual/range {v3 .. v8}, Lq02;->A(Ljava/lang/Object;IIII)V

    .line 139
    .line 140
    .line 141
    if-nez p2, :cond_9

    .line 142
    .line 143
    invoke-virtual {p0, p1}, Liu2;->c(I)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_8

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 151
    .line 152
    move v0, v2

    .line 153
    goto :goto_2

    .line 154
    :cond_9
    :goto_9
    return v2

    .line 155
    :cond_a
    return v0
.end method

.method public final c(I)Z
    .locals 4

    .line 1
    iget v0, p0, Liu2;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-boolean v0, p0, Liu2;->c:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v3, v2}, Liu2;->i(Z[I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget p0, p0, Liu2;->d:I

    .line 18
    .line 19
    add-int/2addr p1, p0

    .line 20
    if-gt v0, p1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0, v1, v2}, Liu2;->g(Z[I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget p0, p0, Liu2;->d:I

    .line 28
    .line 29
    sub-int/2addr p1, p0

    .line 30
    if-lt v0, p1, :cond_2

    .line 31
    .line 32
    :goto_0
    return v3

    .line 33
    :cond_2
    :goto_1
    return v1
.end method

.method public final d(I)Z
    .locals 4

    .line 1
    iget v0, p0, Liu2;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-boolean v0, p0, Liu2;->c:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1, v2}, Liu2;->g(Z[I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget p0, p0, Liu2;->d:I

    .line 18
    .line 19
    sub-int/2addr p1, p0

    .line 20
    if-lt v0, p1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0, v3, v2}, Liu2;->i(Z[I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget p0, p0, Liu2;->d:I

    .line 28
    .line 29
    add-int/2addr p1, p0

    .line 30
    if-gt v0, p1, :cond_2

    .line 31
    .line 32
    :goto_0
    return v3

    .line 33
    :cond_2
    :goto_1
    return v1
.end method

.method public e(IILxr0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(ZI[I)I
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    aput p1, p3, p1

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    aput p2, p3, p1

    .line 8
    .line 9
    :cond_0
    iget-boolean p1, p0, Liu2;->c:Z

    .line 10
    .line 11
    iget-object p3, p0, Liu2;->b:Lq02;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p3, p2}, Lq02;->H(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    invoke-virtual {p3, p2}, Lq02;->H(I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object p0, p0, Liu2;->b:Lq02;

    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lq02;->L(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, p1

    .line 31
    return p0
.end method

.method public final g(Z[I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Liu2;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Liu2;->f:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Liu2;->g:I

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0, p1, v0, p2}, Liu2;->f(ZI[I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public h(ZI[I)I
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    aput p1, p3, p1

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    aput p2, p3, p1

    .line 8
    .line 9
    :cond_0
    iget-boolean p1, p0, Liu2;->c:Z

    .line 10
    .line 11
    iget-object p3, p0, Liu2;->b:Lq02;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p3, p2}, Lq02;->H(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object p0, p0, Liu2;->b:Lq02;

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Lq02;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    sub-int/2addr p1, p0

    .line 26
    return p1

    .line 27
    :cond_1
    invoke-virtual {p3, p2}, Lq02;->H(I)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final i(Z[I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Liu2;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Liu2;->g:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Liu2;->f:I

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0, p1, v0, p2}, Liu2;->h(ZI[I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public j(II)[Lcb0;
    .locals 2

    .line 1
    iget-object v0, p0, Liu2;->h:[Lcb0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iput v1, v0, Lcb0;->Y:I

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcb0;->b(I)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Liu2;->h:[Lcb0;

    .line 12
    .line 13
    aget-object p1, p1, v1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcb0;->b(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Liu2;->h:[Lcb0;

    .line 19
    .line 20
    return-object p0
.end method

.method public abstract k(I)Lr75;
.end method

.method public l(I)V
    .locals 2

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget v0, p0, Liu2;->g:I

    .line 5
    .line 6
    if-gez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    if-lt v0, p1, :cond_2

    .line 10
    .line 11
    add-int/lit8 v0, p1, -0x1

    .line 12
    .line 13
    iput v0, p0, Liu2;->g:I

    .line 14
    .line 15
    :cond_2
    iget v1, p0, Liu2;->f:I

    .line 16
    .line 17
    if-ge v0, v1, :cond_3

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Liu2;->g:I

    .line 21
    .line 22
    iput v1, p0, Liu2;->f:I

    .line 23
    .line 24
    :cond_3
    if-gez v1, :cond_4

    .line 25
    .line 26
    iput p1, p0, Liu2;->i:I

    .line 27
    .line 28
    :cond_4
    :goto_0
    return-void
.end method

.method public abstract m(IZ)Z
.end method

.method public final n(I)V
    .locals 5

    .line 1
    if-lez p1, :cond_3

    .line 2
    .line 3
    iget v0, p0, Liu2;->e:I

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iput p1, p0, Liu2;->e:I

    .line 9
    .line 10
    new-array p1, p1, [Lcb0;

    .line 11
    .line 12
    iput-object p1, p0, Liu2;->h:[Lcb0;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget v0, p0, Liu2;->e:I

    .line 16
    .line 17
    if-ge p1, v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Liu2;->h:[Lcb0;

    .line 20
    .line 21
    new-instance v1, Lcb0;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, v2}, Lcb0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Integer;->bitCount(I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eq v3, v4, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x7

    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    shl-int/2addr v2, v4

    .line 42
    :cond_1
    add-int/lit8 v3, v2, -0x1

    .line 43
    .line 44
    iput v3, v1, Lcb0;->Z:I

    .line 45
    .line 46
    new-array v2, v2, [I

    .line 47
    .line 48
    iput-object v2, v1, Lcb0;->f0:Ljava/lang/Object;

    .line 49
    .line 50
    aput-object v1, v0, p1

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    return-void

    .line 56
    :cond_3
    invoke-static {}, Lkp5;->e()V

    .line 57
    .line 58
    .line 59
    return-void
.end method
