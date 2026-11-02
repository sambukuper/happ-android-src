.class public final Lba8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final a:Lba8;

.field public static final b:Lg44;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lba8;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lba8;->a:Lba8;

    .line 7
    .line 8
    new-instance v0, Lmq7;

    .line 9
    .line 10
    const/16 v1, 0x1c

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lw74;->X:Lw74;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lba8;->b:Lg44;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lnc1;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lba8;->d()Le37;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1, p0}, Lol7;->a(Le37;)Lol7;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, Lba8;->a:Lba8;

    .line 15
    .line 16
    invoke-virtual {v0}, Lba8;->d()Le37;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-wide v1, p2, Lnc1;->b:J

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-virtual {p1, v0, p2, v1, v2}, Lol7;->n(Le37;IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lol7;->v(Le37;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lba8;->d()Le37;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Lrd1;->t(Le37;)Lf01;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v1, 0x0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    move v4, v1

    .line 13
    :goto_0
    sget-object v5, Lba8;->a:Lba8;

    .line 14
    .line 15
    invoke-virtual {v5}, Lba8;->d()Le37;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-interface {p1, v6}, Lf01;->e(Le37;)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const/4 v7, -0x1

    .line 24
    if-eq v6, v7, :cond_1

    .line 25
    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    invoke-virtual {v5}, Lba8;->d()Le37;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {p1, v2, v1}, Lf01;->D(Le37;I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    const/4 v4, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v6}, Lci8;->O(I)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    throw p0

    .line 43
    :cond_1
    invoke-interface {p1, v0}, Lf01;->n(Le37;)V

    .line 44
    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    new-instance p0, Lnc1;

    .line 49
    .line 50
    invoke-direct {p0, v2, v3}, Lnc1;-><init>(J)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    new-instance p1, Lcw4;

    .line 55
    .line 56
    invoke-virtual {p0}, Lba8;->d()Le37;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, Le37;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v0, "nanoseconds"

    .line 65
    .line 66
    invoke-direct {p1, v0, p0}, Lcw4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lba8;->b:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Le37;

    .line 8
    .line 9
    return-object p0
.end method
