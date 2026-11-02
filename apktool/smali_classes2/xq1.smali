.class public final Lxq1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/io/ByteArrayOutputStream;

.field public final b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxq1;->a:Ljava/io/ByteArrayOutputStream;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lxq1;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .line 1
    and-int/lit16 p1, p1, 0xff

    .line 2
    .line 3
    iget-object p0, p0, Lxq1;->a:Ljava/io/ByteArrayOutputStream;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(Lbr1;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lbr1;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    new-instance v3, Lbr1;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-interface {p1, v2, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-direct {v3, v5}, Lbr1;-><init>(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const-string v3, "."

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    new-instance v9, Lh80;

    .line 37
    .line 38
    const/16 v3, 0x11

    .line 39
    .line 40
    invoke-direct {v9, v3}, Lh80;-><init>(B)V

    .line 41
    .line 42
    .line 43
    const/16 v10, 0x1e

    .line 44
    .line 45
    const-string v6, "."

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-static/range {v5 .. v10}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :goto_1
    iget-object v4, p0, Lxq1;->b:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    and-int/lit16 v6, v6, 0x3fff

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-ne v6, v7, :cond_1

    .line 74
    .line 75
    const p1, 0xc000

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    or-int/2addr p1, v0

    .line 83
    invoke-virtual {p0, p1}, Lxq1;->d(I)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    iget-object v5, p0, Lxq1;->a:Ljava/io/ByteArrayOutputStream;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v4, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, [B

    .line 105
    .line 106
    array-length v4, v3

    .line 107
    invoke-virtual {p0, v4}, Lxq1;->a(I)V

    .line 108
    .line 109
    .line 110
    array-length v4, v3

    .line 111
    invoke-virtual {v5, v3, v1, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-virtual {p0, v1}, Lxq1;->a(I)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public final c(Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;->c()Lbr1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Lxq1;->b(Lbr1;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;->e()S

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const v1, 0xffff

    .line 16
    .line 17
    .line 18
    and-int/2addr v0, v1

    .line 19
    invoke-virtual {p0, v0}, Lxq1;->d(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;->a()S

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    and-int/2addr v0, v1

    .line 27
    invoke-virtual {p0, v0}, Lxq1;->d(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;->d()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    ushr-int/lit8 v2, v0, 0x18

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lxq1;->a(I)V

    .line 37
    .line 38
    .line 39
    ushr-int/lit8 v2, v0, 0x10

    .line 40
    .line 41
    and-int/lit16 v2, v2, 0xff

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lxq1;->a(I)V

    .line 44
    .line 45
    .line 46
    ushr-int/lit8 v2, v0, 0x8

    .line 47
    .line 48
    and-int/lit16 v2, v2, 0xff

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lxq1;->a(I)V

    .line 51
    .line 52
    .line 53
    and-int/lit16 v0, v0, 0xff

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lxq1;->a(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;->b()[B

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    array-length v0, v0

    .line 63
    if-gt v0, v1, :cond_0

    .line 64
    .line 65
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;->b()[B

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    array-length v0, v0

    .line 70
    invoke-virtual {p0, v0}, Lxq1;->d(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;->b()[B

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    array-length v1, p1

    .line 82
    iget-object p0, p0, Lxq1;->a:Ljava/io/ByteArrayOutputStream;

    .line 83
    .line 84
    invoke-virtual {p0, p1, v0, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_0
    new-instance p0, Lzq1$c;

    .line 89
    .line 90
    invoke-direct {p0}, Lzq1$c;-><init>()V

    .line 91
    .line 92
    .line 93
    throw p0
.end method

.method public final d(I)V
    .locals 1

    .line 1
    shr-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxq1;->a(I)V

    .line 4
    .line 5
    .line 6
    and-int/lit16 p1, p1, 0xff

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lxq1;->a(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
