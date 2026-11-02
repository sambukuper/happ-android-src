.class public final Lokhttp3/internal/IsProbablyUtf8Kt;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lba0;",
        "",
        "codePointLimit",
        "",
        "isProbablyUtf8",
        "(Lba0;J)Z",
        "okhttp"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final isProbablyUtf8(Lba0;J)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p0}, Lba0;->peek()Lj76;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    move-wide v2, v0

    .line 11
    :goto_0
    cmp-long v4, v2, p1

    .line 12
    .line 13
    if-gez v4, :cond_5

    .line 14
    .line 15
    invoke-virtual {p0}, Lj76;->F()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    const-wide/16 v4, 0x1

    .line 23
    .line 24
    invoke-virtual {p0, v4, v5}, Lj76;->T0(J)V

    .line 25
    .line 26
    .line 27
    iget-object v6, p0, Lj76;->Y:Li90;

    .line 28
    .line 29
    invoke-virtual {v6, v0, v1}, Li90;->u(J)B

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    and-int/lit16 v8, v7, 0xe0

    .line 34
    .line 35
    const/16 v9, 0xc0

    .line 36
    .line 37
    if-ne v8, v9, :cond_1

    .line 38
    .line 39
    const-wide/16 v7, 0x2

    .line 40
    .line 41
    invoke-virtual {p0, v7, v8}, Lj76;->T0(J)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    and-int/lit16 v8, v7, 0xf0

    .line 46
    .line 47
    const/16 v9, 0xe0

    .line 48
    .line 49
    if-ne v8, v9, :cond_2

    .line 50
    .line 51
    const-wide/16 v7, 0x3

    .line 52
    .line 53
    invoke-virtual {p0, v7, v8}, Lj76;->T0(J)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    and-int/lit16 v7, v7, 0xf8

    .line 58
    .line 59
    const/16 v8, 0xf0

    .line 60
    .line 61
    if-ne v7, v8, :cond_3

    .line 62
    .line 63
    const-wide/16 v7, 0x4

    .line 64
    .line 65
    invoke-virtual {p0, v7, v8}, Lj76;->T0(J)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    invoke-virtual {v6}, Li90;->a0()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    invoke-static {v6}, Ljava/lang/Character;->isISOControl(I)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 79
    .line 80
    .line 81
    move-result v6
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    if-nez v6, :cond_4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    add-long/2addr v2, v4

    .line 86
    goto :goto_0

    .line 87
    :cond_5
    :goto_2
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :catch_0
    :goto_3
    const/4 p0, 0x0

    .line 90
    return p0
.end method

.method public static synthetic isProbablyUtf8$default(Lba0;JILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-wide p1, 0x7fffffffffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0, p1, p2}, Lokhttp3/internal/IsProbablyUtf8Kt;->isProbablyUtf8(Lba0;J)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method
