.class public final Lrz4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzu3;
.implements Lpz4;


# instance fields
.field public final X:Lev3;

.field public final Y:Lqs0;

.field public final Z:Lg44;

.field public final f0:Lg44;

.field public final g0:Lg44;


# direct methods
.method public constructor <init>(Lev3;Lqs0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrz4;->X:Lev3;

    .line 5
    .line 6
    iput-object p2, p0, Lrz4;->Y:Lqs0;

    .line 7
    .line 8
    new-instance p1, Lqz4;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p0, p2}, Lqz4;-><init>(Lrz4;B)V

    .line 12
    .line 13
    .line 14
    sget-object p2, Lw74;->X:Lw74;

    .line 15
    .line 16
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lrz4;->Z:Lg44;

    .line 21
    .line 22
    new-instance p1, Lqz4;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, v0}, Lqz4;-><init>(Lrz4;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lrz4;->f0:Lg44;

    .line 33
    .line 34
    new-instance p1, Lqz4;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-direct {p1, p0, v0}, Lqz4;-><init>(Lrz4;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lrz4;->g0:Lg44;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lev3;->C()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final E()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->Y:Lqs0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqs0;->f()Lv15;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final I()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lev3;->I()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final O(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lev3;->O(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final P()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lev3;->P()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final Q()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lev3;->Q()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->g0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lpz4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lpz4;

    .line 6
    .line 7
    invoke-interface {p1}, Lpz4;->q()Lzu3;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lev3;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->f0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lli8;

    .line 8
    .line 9
    iget-object p0, p0, Lli8;->a:Ljava/util/List;

    .line 10
    .line 11
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lev3;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final n()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lev3;->n()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final p()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->Y:Lqs0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqs0;->a()Lfk2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 8
    .line 9
    iget-object p0, p0, Lgk2;->a:Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public final q()Lzu3;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MutableCollectionKClass("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final u()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz4;->X:Lev3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lev3;->u()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
