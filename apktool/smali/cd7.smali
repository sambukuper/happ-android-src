.class public final Lcd7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lhx1;


# virtual methods
.method public final a(Lug8;)Lju8;
    .locals 0

    .line 1
    new-instance p0, Lf08;

    .line 2
    .line 3
    const/16 p1, 0xb

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lf08;-><init>(B)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final a(Lug8;)Llu8;
    .locals 0

    .line 9
    new-instance p0, Lf08;

    const/16 p1, 0xb

    .line 10
    invoke-direct {p0, p1}, Lf08;-><init>(B)V

    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcd7;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
