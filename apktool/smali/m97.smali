.class public final Lm97;
.super Le50;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic h0:I


# instance fields
.field public final Y:Lgl;

.field public final Z:Lix5;

.field public final f0:Ljx5;

.field public final g0:Lep3;


# direct methods
.method public constructor <init>(Lm85;Lgl;Ljx5;Lix5;Lep3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lm97;->Y:Lgl;

    .line 5
    .line 6
    iput-object p3, p0, Lm97;->f0:Ljx5;

    .line 7
    .line 8
    if-nez p4, :cond_0

    .line 9
    .line 10
    sget-object p4, Lix5;->i0:Lix5;

    .line 11
    .line 12
    :cond_0
    iput-object p4, p0, Lm97;->Z:Lix5;

    .line 13
    .line 14
    iput-object p5, p0, Lm97;->g0:Lep3;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b()Lep3;
    .locals 0

    .line 1
    iget-object p0, p0, Lm97;->g0:Lep3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Lll;
    .locals 1

    .line 1
    iget-object p0, p0, Lm97;->Y:Lgl;

    .line 2
    .line 3
    instance-of v0, p0, Lll;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lll;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final g()Lel;
    .locals 1

    .line 1
    iget-object p0, p0, Lm97;->Y:Lgl;

    .line 2
    .line 3
    instance-of v0, p0, Lel;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lel;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final h()Lhl;
    .locals 1

    .line 1
    iget-object p0, p0, Lm97;->Y:Lgl;

    .line 2
    .line 3
    instance-of v0, p0, Lhl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lhl;

    .line 8
    .line 9
    invoke-virtual {p0}, Lhl;->G0()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public final i()Lix5;
    .locals 0

    .line 1
    iget-object p0, p0, Lm97;->Z:Lix5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lm97;->f0:Ljx5;

    .line 2
    .line 3
    iget-object p0, p0, Ljx5;->X:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final k()Ldh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lm97;->Y:Lgl;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvj8;->Q()Ldh8;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final l()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lm97;->Y:Lgl;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvj8;->N()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()Lhl;
    .locals 2

    .line 1
    iget-object p0, p0, Lm97;->Y:Lgl;

    .line 2
    .line 3
    instance-of v0, p0, Lhl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lhl;

    .line 8
    .line 9
    invoke-virtual {p0}, Lhl;->G0()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final n()V
    .locals 0

    .line 1
    return-void
.end method
