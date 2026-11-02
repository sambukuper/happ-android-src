.class public final Lw70;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lch1;


# virtual methods
.method public final create(Ljavax/net/ssl/SSLSocket;)Lzd7;
    .locals 0

    .line 1
    new-instance p0, Lx70;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final matchesSocket(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    .line 1
    sget-boolean p0, Lv70;->d:Z

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0
.end method
