.class public final Lj7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Loq1;

.field public final b:Ljavax/net/SocketFactory;

.field public final c:Ljavax/net/ssl/SSLSocketFactory;

.field public final d:Ljavax/net/ssl/HostnameVerifier;

.field public final e:Lto0;

.field public final f:Ljava/net/Proxy;

.field public final g:Ljava/net/ProxySelector;

.field public final h:Lu23;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILoq1;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lto0;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p3, p0, Lj7;->a:Loq1;

    .line 17
    .line 18
    iput-object p4, p0, Lj7;->b:Ljavax/net/SocketFactory;

    .line 19
    .line 20
    iput-object p5, p0, Lj7;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 21
    .line 22
    iput-object p6, p0, Lj7;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 23
    .line 24
    iput-object p7, p0, Lj7;->e:Lto0;

    .line 25
    .line 26
    iput-object p8, p0, Lj7;->f:Ljava/net/Proxy;

    .line 27
    .line 28
    iput-object p11, p0, Lj7;->g:Ljava/net/ProxySelector;

    .line 29
    .line 30
    new-instance p3, Lt23;

    .line 31
    .line 32
    const/4 p4, 0x0

    .line 33
    invoke-direct {p3, p4}, Lt23;-><init>(B)V

    .line 34
    .line 35
    .line 36
    const-string p6, "http"

    .line 37
    .line 38
    const-string p7, "https"

    .line 39
    .line 40
    if-eqz p5, :cond_0

    .line 41
    .line 42
    move-object p5, p7

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object p5, p6

    .line 45
    :goto_0
    invoke-virtual {p5, p6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result p8

    .line 49
    const/4 p11, 0x0

    .line 50
    if-eqz p8, :cond_1

    .line 51
    .line 52
    iput-object p6, p3, Lt23;->c:Ljava/lang/Object;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {p5, p7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result p6

    .line 59
    if-eqz p6, :cond_4

    .line 60
    .line 61
    iput-object p7, p3, Lt23;->c:Ljava/lang/Object;

    .line 62
    .line 63
    :goto_1
    const/4 p5, 0x7

    .line 64
    invoke-static {p1, p4, p4, p5}, Lk32;->k(Ljava/lang/String;III)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    invoke-static {p4}, Lnr4;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    if-eqz p4, :cond_3

    .line 73
    .line 74
    iput-object p4, p3, Lt23;->f:Ljava/lang/Object;

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    if-gt p1, p2, :cond_2

    .line 78
    .line 79
    const/high16 p1, 0x10000

    .line 80
    .line 81
    if-ge p2, p1, :cond_2

    .line 82
    .line 83
    iput p2, p3, Lt23;->b:I

    .line 84
    .line 85
    invoke-virtual {p3}, Lt23;->b()Lu23;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lj7;->h:Lu23;

    .line 90
    .line 91
    invoke-static {p9}, Lks8;->u(Ljava/util/List;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Lj7;->i:Ljava/util/List;

    .line 96
    .line 97
    invoke-static {p10}, Lks8;->u(Ljava/util/List;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, Lj7;->j:Ljava/util/List;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_2
    const-string p0, "unexpected port: "

    .line 105
    .line 106
    invoke-static {p2, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    throw p11

    .line 114
    :cond_3
    const-string p0, "unexpected host: "

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p11

    .line 124
    :cond_4
    const-string p0, "unexpected scheme: "

    .line 125
    .line 126
    invoke-virtual {p0, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p11
.end method


# virtual methods
.method public final a(Lj7;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lj7;->a:Loq1;

    .line 2
    .line 3
    iget-object v1, p1, Lj7;->a:Loq1;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Loy1;->g0:Loy1;

    .line 12
    .line 13
    iget-object v0, p0, Lj7;->i:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, Lj7;->i:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lj7;->j:Ljava/util/List;

    .line 24
    .line 25
    iget-object v1, p1, Lj7;->j:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lj7;->g:Ljava/net/ProxySelector;

    .line 34
    .line 35
    iget-object v1, p1, Lj7;->g:Ljava/net/ProxySelector;

    .line 36
    .line 37
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, Lj7;->f:Ljava/net/Proxy;

    .line 44
    .line 45
    iget-object v1, p1, Lj7;->f:Ljava/net/Proxy;

    .line 46
    .line 47
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    iget-object v0, p0, Lj7;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 54
    .line 55
    iget-object v1, p1, Lj7;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 56
    .line 57
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    iget-object v0, p0, Lj7;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 64
    .line 65
    iget-object v1, p1, Lj7;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 66
    .line 67
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    iget-object v0, p0, Lj7;->e:Lto0;

    .line 74
    .line 75
    iget-object v1, p1, Lj7;->e:Lto0;

    .line 76
    .line 77
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    iget-object p0, p0, Lj7;->h:Lu23;

    .line 84
    .line 85
    iget p0, p0, Lu23;->e:I

    .line 86
    .line 87
    iget-object p1, p1, Lj7;->h:Lu23;

    .line 88
    .line 89
    iget p1, p1, Lu23;->e:I

    .line 90
    .line 91
    if-ne p0, p1, :cond_0

    .line 92
    .line 93
    const/4 p0, 0x1

    .line 94
    return p0

    .line 95
    :cond_0
    const/4 p0, 0x0

    .line 96
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lj7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lj7;

    .line 6
    .line 7
    iget-object v0, p1, Lj7;->h:Lu23;

    .line 8
    .line 9
    iget-object v1, p0, Lj7;->h:Lu23;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lu23;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lj7;->a(Lj7;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lj7;->h:Lu23;

    .line 2
    .line 3
    iget-object v0, v0, Lu23;->h:Ljava/lang/String;

    .line 4
    .line 5
    const/16 v1, 0x20f

    .line 6
    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    invoke-static {v1, v2, v0}, Lpc6;->e(IILjava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lj7;->a:Loq1;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/2addr v1, v2

    .line 21
    sget-object v0, Loy1;->g0:Loy1;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/2addr v0, v1

    .line 28
    mul-int/2addr v0, v2

    .line 29
    iget-object v1, p0, Lj7;->i:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v0, v2, v1}, Lp61;->f(IILjava/util/List;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v1, p0, Lj7;->j:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v0, v2, v1}, Lp61;->f(IILjava/util/List;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lj7;->g:Ljava/net/ProxySelector;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v1, v0

    .line 48
    mul-int/2addr v1, v2

    .line 49
    iget-object v0, p0, Lj7;->f:Ljava/net/Proxy;

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v1

    .line 56
    mul-int/2addr v0, v2

    .line 57
    iget-object v1, p0, Lj7;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 58
    .line 59
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    add-int/2addr v1, v0

    .line 64
    mul-int/2addr v1, v2

    .line 65
    iget-object v0, p0, Lj7;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/2addr v0, v1

    .line 72
    mul-int/2addr v0, v2

    .line 73
    iget-object p0, p0, Lj7;->e:Lto0;

    .line 74
    .line 75
    invoke-static {p0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    add-int/2addr p0, v0

    .line 80
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Address{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lj7;->h:Lu23;

    .line 9
    .line 10
    iget-object v2, v1, Lu23;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v2, 0x3a

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, v1, Lu23;->e:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lj7;->f:Ljava/net/Proxy;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    new-instance p0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "proxy="

    .line 37
    .line 38
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v2, "proxySelector="

    .line 52
    .line 53
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lj7;->g:Ljava/net/ProxySelector;

    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :goto_0
    const/16 v1, 0x7d

    .line 66
    .line 67
    invoke-static {v0, p0, v1}, Loi0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
