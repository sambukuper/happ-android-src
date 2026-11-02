.class public final Ll66;
.super Lm66;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Serializable;


# virtual methods
.method public final c(II)I
    .locals 0

    .line 1
    sget-object p0, Lm66;->Y:Ll2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lm66;->c(II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final e(J)J
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f([B)[B
    .locals 0

    .line 1
    sget-object p0, Lm66;->Y:Ll2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ll2;->f()Ljava/util/Random;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Ljava/util/Random;->nextBytes([B)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method
