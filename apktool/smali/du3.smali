.class public final Ldu3;
.super Lbq2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final i0:Ldu3;

.field public static final j0:Lau3;


# instance fields
.field public final X:Ljb0;

.field public Y:I

.field public Z:I

.field public f0:I

.field public g0:B

.field public h0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lau3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lau3;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldu3;->j0:Lau3;

    .line 8
    .line 9
    new-instance v0, Ldu3;

    .line 10
    .line 11
    invoke-direct {v0}, Ldu3;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldu3;->i0:Ldu3;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, v0, Ldu3;->Z:I

    .line 18
    .line 19
    iput v1, v0, Ldu3;->f0:I

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 132
    iput-byte v0, p0, Ldu3;->g0:B

    .line 133
    iput v0, p0, Ldu3;->h0:I

    .line 134
    sget-object v0, Ljb0;->X:Lmc4;

    iput-object v0, p0, Ldu3;->X:Ljb0;

    return-void
.end method

.method public constructor <init>(Lbu3;)V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 136
    iput-byte v0, p0, Ldu3;->g0:B

    .line 137
    iput v0, p0, Ldu3;->h0:I

    .line 138
    iget-object p1, p1, Lup2;->X:Ljb0;

    .line 139
    iput-object p1, p0, Ldu3;->X:Ljb0;

    return-void
.end method

.method public constructor <init>(Liv0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Ldu3;->g0:B

    .line 6
    .line 7
    iput v0, p0, Ldu3;->h0:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Ldu3;->Z:I

    .line 11
    .line 12
    iput v0, p0, Ldu3;->f0:I

    .line 13
    .line 14
    new-instance v1, Lib0;

    .line 15
    .line 16
    invoke-direct {v1}, Lib0;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {v1, v2}, Lnv0;->G(Ljava/io/OutputStream;I)Lnv0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 25
    .line 26
    :try_start_0
    invoke-virtual {p1}, Liv0;->n()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    const/16 v5, 0x8

    .line 33
    .line 34
    if-eq v4, v5, :cond_3

    .line 35
    .line 36
    const/16 v5, 0x10

    .line 37
    .line 38
    if-eq v4, v5, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1, v4, v3}, Liv0;->q(ILnv0;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    :cond_1
    move v0, v2

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :catch_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :catch_1
    move-exception p1

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    iget v4, p0, Ldu3;->Y:I

    .line 55
    .line 56
    or-int/lit8 v4, v4, 0x2

    .line 57
    .line 58
    iput v4, p0, Ldu3;->Y:I

    .line 59
    .line 60
    invoke-virtual {p1}, Liv0;->k()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iput v4, p0, Ldu3;->f0:I

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    iget v4, p0, Ldu3;->Y:I

    .line 68
    .line 69
    or-int/2addr v4, v2

    .line 70
    iput v4, p0, Ldu3;->Y:I

    .line 71
    .line 72
    invoke-virtual {p1}, Liv0;->k()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    iput v4, p0, Ldu3;->Z:I
    :try_end_0
    .catch Lrh3; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :goto_1
    :try_start_1
    new-instance v0, Lrh3;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {v0, p1}, Lrh3;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object p0, v0, Lrh3;->X:Ld2;

    .line 89
    .line 90
    throw v0

    .line 91
    :goto_2
    iput-object p0, p1, Lrh3;->X:Ld2;

    .line 92
    .line 93
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    :goto_3
    :try_start_2
    invoke-virtual {v3}, Lnv0;->R()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    .line 96
    .line 97
    :catch_2
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Ldu3;->X:Ljb0;

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :catchall_1
    move-exception p1

    .line 105
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Ldu3;->X:Ljb0;

    .line 110
    .line 111
    throw p1

    .line 112
    :goto_4
    throw p1

    .line 113
    :cond_4
    :try_start_3
    invoke-virtual {v3}, Lnv0;->R()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 114
    .line 115
    .line 116
    :catch_3
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput-object p1, p0, Ldu3;->X:Ljb0;

    .line 121
    .line 122
    return-void

    .line 123
    :catchall_2
    move-exception p1

    .line 124
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Ldu3;->X:Ljb0;

    .line 129
    .line 130
    throw p1
.end method

.method public static i(Ldu3;)Lbu3;
    .locals 2

    .line 1
    new-instance v0, Lbu3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lbu3;-><init>(B)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lbu3;->i(Ldu3;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 3

    .line 1
    iget v0, p0, Ldu3;->h0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Ldu3;->Y:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Ldu3;->Z:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lnv0;->l(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, Ldu3;->Y:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, Ldu3;->f0:I

    .line 28
    .line 29
    invoke-static {v2, v1}, Lnv0;->l(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget-object v1, p0, Ldu3;->X:Ljb0;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljb0;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    iput v1, p0, Ldu3;->h0:I

    .line 42
    .line 43
    return v1
.end method

.method public final c()Lup2;
    .locals 1

    .line 1
    new-instance p0, Lbu3;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0}, Lbu3;-><init>(B)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Ldu3;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iput-byte v1, p0, Ldu3;->g0:B

    .line 12
    .line 13
    return v1
.end method

.method public final e()Lup2;
    .locals 0

    .line 1
    invoke-static {p0}, Ldu3;->i(Ldu3;)Lbu3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final f(Lnv0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldu3;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ldu3;->Y:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Ldu3;->Z:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lnv0;->V(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Ldu3;->Y:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Ldu3;->f0:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lnv0;->V(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Ldu3;->X:Ljb0;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lnv0;->a0(Ljb0;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
