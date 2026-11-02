.class public abstract Lvp4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrs0;
.implements Ljava/io/Serializable;


# instance fields
.field public final X:J

.field public final Y:Ll20;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lep3;->g0:Lep3;

    .line 2
    .line 3
    sget-object v0, Lno3;->k0:Lno3;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Ll20;J)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lvp4;->Y:Ll20;

    .line 13
    iput-wide p2, p0, Lvp4;->X:J

    return-void
.end method

.method public constructor <init>(Lwp4;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lvp4;->Y:Ll20;

    .line 5
    .line 6
    iput-object p1, p0, Lvp4;->Y:Ll20;

    .line 7
    .line 8
    iput-wide p2, p0, Lvp4;->X:J

    .line 9
    .line 10
    return-void
.end method

.method public static b(Ljava/lang/Class;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [Ljava/lang/Enum;

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    aget-object v3, p0, v1

    .line 13
    .line 14
    check-cast v3, Lm11;

    .line 15
    .line 16
    invoke-interface {v3}, Lm11;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    invoke-interface {v3}, Lm11;->b()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    or-int/2addr v2, v3

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v2
.end method


# virtual methods
.method public final c(Ljava/lang/Class;)Ldh8;
    .locals 2

    .line 1
    iget-object p0, p0, Lvp4;->Y:Ll20;

    .line 2
    .line 3
    iget-object p0, p0, Ll20;->X:Luh8;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sget-object v1, Luh8;->f0:Lgh8;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1, v1}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final d()Lm85;
    .locals 1

    .line 1
    sget-object v0, Lxp4;->Z:Lxp4;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lvp4;->f(Lxp4;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lvp4;->Y:Ll20;

    .line 10
    .line 11
    iget-object p0, p0, Ll20;->Z:Lfj3;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lz55;->X:Lz55;

    .line 15
    .line 16
    return-object p0
.end method

.method public abstract e(Lnb1;)Z
.end method

.method public final f(Lxp4;)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lvp4;->X:J

    .line 2
    .line 3
    iget-wide p0, p1, Lxp4;->Y:J

    .line 4
    .line 5
    and-long/2addr p0, v0

    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long p0, p0, v0

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method
