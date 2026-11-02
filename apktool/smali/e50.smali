.class public abstract Le50;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final X:Lep3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lep3;->g0:Lep3;

    .line 2
    .line 3
    sput-object v0, Le50;->X:Lep3;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Le50;->f()Lll;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Le50;->m()Lhl;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Le50;->g()Lel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public abstract b()Lep3;
.end method

.method public c()Lr75;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public d()[Ljava/lang/Class;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final e()Lgl;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le50;->h()Lhl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Le50;->g()Lel;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    return-object v0
.end method

.method public abstract f()Lll;
.end method

.method public abstract g()Lel;
.end method

.method public abstract h()Lhl;
.end method

.method public abstract i()Lix5;
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()Ldh8;
.end method

.method public abstract l()Ljava/lang/Class;
.end method

.method public abstract m()Lhl;
.end method

.method public n()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le50;->e()Lgl;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public o()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public p()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
