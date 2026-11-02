.class public final Ljc8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Z

.field public final b:Lm15;

.field public final c:Lb15;

.field public d:Lmm0;


# direct methods
.method public constructor <init>(ZLm15;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ljc8;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Ljc8;->b:Lm15;

    .line 7
    .line 8
    new-instance p1, Lb15;

    .line 9
    .line 10
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lb15;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ljc8;->c:Lb15;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    iget-object v1, p0, Ljc8;->c:Lb15;

    .line 4
    .line 5
    iget-object v1, v1, Lb15;->c:Lrh5;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Ljc8;->a:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Ljc8;->d:Lmm0;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Lmm0;->z(Ljava/lang/Throwable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object p0, p0, Ljc8;->c:Lb15;

    .line 2
    .line 3
    iget-object v0, p0, Lb15;->b:Lrh5;

    .line 4
    .line 5
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lb15;->c:Lrh5;

    .line 18
    .line 19
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final c(Lf15;Luy7;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Lrf0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v6, 0x0

    .line 5
    invoke-direct {v0, p0, v6, v1}, Lrf0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 6
    .line 7
    .line 8
    new-instance v5, Lic8;

    .line 9
    .line 10
    invoke-direct {v5, p0, v0, p1, v6}, Lic8;-><init>(Ljc8;Lrf0;Lf15;Lq51;)V

    .line 11
    .line 12
    .line 13
    iget-object v4, p0, Ljc8;->b:Lm15;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v2, Lkg3;

    .line 19
    .line 20
    const/4 v7, 0x1

    .line 21
    move-object v3, p1

    .line 22
    invoke-direct/range {v2 .. v7}, Lkg3;-><init>(Lf15;Ljava/lang/Object;Lgn2;Lq51;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2, p2}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object p1, Lc71;->X:Lc71;

    .line 30
    .line 31
    if-ne p0, p1, :cond_0

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 35
    .line 36
    return-object p0
.end method
