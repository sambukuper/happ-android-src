.class public abstract Luf5;
.super Lhd1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltf5;


# instance fields
.field public final i0:Lfk2;

.field public final j0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvx4;Lfk2;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Loy1;->f0:Lrm;

    .line 8
    .line 9
    iget-object v1, p2, Lfk2;->a:Lgk2;

    .line 10
    .line 11
    invoke-virtual {v1}, Lgk2;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v1, Lgk2;->e:Lv15;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v1}, Lgk2;->g()Lv15;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    sget-object v2, Lke7;->G:Lg55;

    .line 25
    .line 26
    invoke-direct {p0, p1, v0, v1, v2}, Lhd1;-><init>(Led1;Lsm;Lv15;Lke7;)V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Luf5;->i0:Lfk2;

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, "package "

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p2, " of "

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Luf5;->j0:Ljava/lang/String;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final H0()Lvx4;
    .locals 0

    .line 1
    invoke-super {p0}, Lhd1;->p()Led1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, Lvx4;

    .line 9
    .line 10
    return-object p0
.end method

.method public final J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lid1;->s(Luf5;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getSource()Lke7;
    .locals 0

    .line 1
    sget-object p0, Lke7;->G:Lg55;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic p()Led1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Luf5;->H0()Lvx4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Luf5;->j0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
