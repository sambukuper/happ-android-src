.class public final Lr13;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lo42;


# instance fields
.field public final a:Ll95;

.field public final b:Lp76;

.field public final c:Lba0;

.field public final d:Laa0;

.field public e:B

.field public final f:Lkr0;

.field public g:Lnz2;


# direct methods
.method public constructor <init>(Ll95;Lp76;Lj76;Li76;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lr13;->a:Ll95;

    .line 11
    .line 12
    iput-object p2, p0, Lr13;->b:Lp76;

    .line 13
    .line 14
    iput-object p3, p0, Lr13;->c:Lba0;

    .line 15
    .line 16
    iput-object p4, p0, Lr13;->d:Laa0;

    .line 17
    .line 18
    new-instance p1, Lkr0;

    .line 19
    .line 20
    invoke-direct {p1, p3}, Lkr0;-><init>(Lba0;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lr13;->f:Lkr0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lzf6;)Lje7;
    .locals 9

    .line 1
    invoke-static {p1}, Ls23;->a(Lzf6;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lr13;->e(J)Lp13;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v0, "Transfer-Encoding"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "chunked"

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    const-string v2, "state: "

    .line 28
    .line 29
    const/4 v3, 0x5

    .line 30
    const/4 v4, 0x4

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object p1, p1, Lzf6;->X:Ly5;

    .line 34
    .line 35
    iget-object p1, p1, Ly5;->Y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lu23;

    .line 38
    .line 39
    iget-byte v0, p0, Lr13;->e:B

    .line 40
    .line 41
    if-ne v0, v4, :cond_1

    .line 42
    .line 43
    iput-byte v3, p0, Lr13;->e:B

    .line 44
    .line 45
    new-instance v0, Lo13;

    .line 46
    .line 47
    invoke-direct {v0, p0, p1}, Lo13;-><init>(Lr13;Lu23;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    iget-byte p0, p0, Lr13;->e:B

    .line 52
    .line 53
    invoke-static {p0, v2}, Lkp5;->p(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_2
    invoke-static {p1}, Lks8;->i(Lzf6;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    const-wide/16 v7, -0x1

    .line 62
    .line 63
    cmp-long p1, v5, v7

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0, v5, v6}, Lr13;->e(J)Lp13;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_3
    iget-byte p1, p0, Lr13;->e:B

    .line 73
    .line 74
    if-ne p1, v4, :cond_4

    .line 75
    .line 76
    iput-byte v3, p0, Lr13;->e:B

    .line 77
    .line 78
    iget-object p1, p0, Lr13;->b:Lp76;

    .line 79
    .line 80
    invoke-virtual {p1}, Lp76;->k()V

    .line 81
    .line 82
    .line 83
    new-instance p1, Lq13;

    .line 84
    .line 85
    invoke-direct {p1, p0}, Ln13;-><init>(Lr13;)V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_4
    iget-byte p0, p0, Lr13;->e:B

    .line 90
    .line 91
    invoke-static {p0, v2}, Lkp5;->p(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v1
.end method

.method public final b(Lzf6;)J
    .locals 1

    .line 1
    invoke-static {p1}, Ls23;->a(Lzf6;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    const-string p0, "Transfer-Encoding"

    .line 11
    .line 12
    invoke-static {p1, p0}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "chunked"

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    const-wide/16 p0, -0x1

    .line 25
    .line 26
    return-wide p0

    .line 27
    :cond_1
    invoke-static {p1}, Lks8;->i(Lzf6;)J

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0
.end method

.method public final c()Lp76;
    .locals 0

    .line 1
    iget-object p0, p0, Lr13;->b:Lp76;

    .line 2
    .line 3
    return-object p0
.end method

.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lr13;->b:Lp76;

    .line 2
    .line 3
    iget-object p0, p0, Lp76;->c:Ljava/net/Socket;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lks8;->d(Ljava/net/Socket;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final d(Ly5;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr13;->b:Lp76;

    .line 2
    .line 3
    iget-object v0, v0, Lp76;->b:Lmm6;

    .line 4
    .line 5
    iget-object v0, v0, Lmm6;->b:Ljava/net/Proxy;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p1, Ly5;->Z:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v2, 0x20

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v2, p1, Ly5;->Y:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Lu23;

    .line 34
    .line 35
    iget-boolean v3, v2, Lu23;->i:Z

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 40
    .line 41
    if-ne v0, v3, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v2}, Lu23;->b()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v2}, Lu23;->d()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/16 v0, 0x3f

    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    :goto_0
    const-string v0, " HTTP/1.1"

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object p1, p1, Ly5;->g0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Lnz2;

    .line 89
    .line 90
    invoke-virtual {p0, p1, v0}, Lr13;->f(Lnz2;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final e(J)Lp13;
    .locals 2

    .line 1
    iget-byte v0, p0, Lr13;->e:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput-byte v0, p0, Lr13;->e:B

    .line 8
    .line 9
    new-instance v0, Lp13;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lp13;-><init>(Lr13;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string p1, "state: "

    .line 16
    .line 17
    iget-byte p0, p0, Lr13;->e:B

    .line 18
    .line 19
    invoke-static {p0, p1}, Lkp5;->p(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final f(Lnz2;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-byte v0, p0, Lr13;->e:B

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lr13;->d:Laa0;

    .line 6
    .line 7
    invoke-interface {v0, p2}, Laa0;->f0(Ljava/lang/String;)Laa0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v1, "\r\n"

    .line 12
    .line 13
    invoke-interface {p2, v1}, Laa0;->f0(Ljava/lang/String;)Laa0;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lnz2;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Lnz2;->b(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v0, v3}, Laa0;->f0(Ljava/lang/String;)Laa0;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, ": "

    .line 32
    .line 33
    invoke-interface {v3, v4}, Laa0;->f0(Ljava/lang/String;)Laa0;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p1, v2}, Lnz2;->e(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v3, v4}, Laa0;->f0(Ljava/lang/String;)Laa0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3, v1}, Laa0;->f0(Ljava/lang/String;)Laa0;

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-interface {v0, v1}, Laa0;->f0(Ljava/lang/String;)Laa0;

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    iput-byte p1, p0, Lr13;->e:B

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    const-string p1, "state: "

    .line 59
    .line 60
    iget-byte p0, p0, Lr13;->e:B

    .line 61
    .line 62
    invoke-static {p0, p1}, Lkp5;->p(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final finishRequest()V
    .locals 0

    .line 1
    iget-object p0, p0, Lr13;->d:Laa0;

    .line 2
    .line 3
    invoke-interface {p0}, Laa0;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final flushRequest()V
    .locals 0

    .line 1
    iget-object p0, p0, Lr13;->d:Laa0;

    .line 2
    .line 3
    invoke-interface {p0}, Laa0;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final readResponseHeaders(Z)Lyf6;
    .locals 9

    .line 1
    iget-object v0, p0, Lr13;->f:Lkr0;

    .line 2
    .line 3
    iget-byte v1, p0, Lr13;->e:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x3

    .line 8
    if-eq v1, v2, :cond_1

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    if-ne v1, v4, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, "state: "

    .line 17
    .line 18
    iget-byte p0, p0, Lr13;->e:B

    .line 19
    .line 20
    invoke-static {p0, p1}, Lkp5;->p(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, v0, Lkr0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lba0;

    .line 27
    .line 28
    iget-wide v5, v0, Lkr0;->b:J

    .line 29
    .line 30
    invoke-interface {v1, v5, v6}, Lba0;->V(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-wide v5, v0, Lkr0;->b:J

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    int-to-long v7, v2

    .line 41
    sub-long/2addr v5, v7

    .line 42
    iput-wide v5, v0, Lkr0;->b:J

    .line 43
    .line 44
    invoke-static {v1}, Ljb5;->D(Ljava/lang/String;)Lne;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget v2, v1, Lne;->b:I

    .line 49
    .line 50
    new-instance v5, Lyf6;

    .line 51
    .line 52
    invoke-direct {v5}, Lyf6;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v6, v1, Lne;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v6, Lp06;

    .line 58
    .line 59
    iput-object v6, v5, Lyf6;->b:Lp06;

    .line 60
    .line 61
    iput v2, v5, Lyf6;->c:I

    .line 62
    .line 63
    iget-object v1, v1, Lne;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    iput-object v1, v5, Lyf6;->d:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0}, Lkr0;->h()Lnz2;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lnz2;->c()Lps;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, v5, Lyf6;->f:Lps;

    .line 78
    .line 79
    const/16 v0, 0x64

    .line 80
    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    if-ne v2, v0, :cond_2

    .line 84
    .line 85
    return-object v3

    .line 86
    :cond_2
    if-ne v2, v0, :cond_3

    .line 87
    .line 88
    iput-byte v4, p0, Lr13;->e:B

    .line 89
    .line 90
    return-object v5

    .line 91
    :catch_0
    move-exception p1

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const/16 p1, 0x66

    .line 94
    .line 95
    if-gt p1, v2, :cond_4

    .line 96
    .line 97
    const/16 p1, 0xc8

    .line 98
    .line 99
    if-ge v2, p1, :cond_4

    .line 100
    .line 101
    iput-byte v4, p0, Lr13;->e:B

    .line 102
    .line 103
    return-object v5

    .line 104
    :cond_4
    const/4 p1, 0x4

    .line 105
    iput-byte p1, p0, Lr13;->e:B
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    return-object v5

    .line 108
    :goto_1
    iget-object p0, p0, Lr13;->b:Lp76;

    .line 109
    .line 110
    iget-object p0, p0, Lp76;->b:Lmm6;

    .line 111
    .line 112
    iget-object p0, p0, Lmm6;->a:Lj7;

    .line 113
    .line 114
    iget-object p0, p0, Lj7;->h:Lu23;

    .line 115
    .line 116
    const-string v0, "/..."

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    :try_start_1
    new-instance v2, Lt23;

    .line 120
    .line 121
    invoke-direct {v2, v1}, Lt23;-><init>(B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, p0, v0}, Lt23;->f(Lu23;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 125
    .line 126
    .line 127
    move-object v3, v2

    .line 128
    :catch_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const-string p0, ""

    .line 132
    .line 133
    const/16 v0, 0xfb

    .line 134
    .line 135
    const-string v2, " \"\':;<=>@[]^`{}|/\\?#"

    .line 136
    .line 137
    invoke-static {p0, v1, v1, v0, v2}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iput-object v4, v3, Lt23;->d:Ljava/io/Serializable;

    .line 142
    .line 143
    invoke-static {p0, v1, v1, v0, v2}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    iput-object p0, v3, Lt23;->e:Ljava/io/Serializable;

    .line 148
    .line 149
    invoke-virtual {v3}, Lt23;->b()Lu23;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    iget-object p0, p0, Lu23;->h:Ljava/lang/String;

    .line 154
    .line 155
    new-instance v0, Ljava/io/IOException;

    .line 156
    .line 157
    const-string v1, "unexpected end of stream on "

    .line 158
    .line 159
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    throw v0
.end method
