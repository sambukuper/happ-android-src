.class public final Lzm;
.super Lf50;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final t0:Lzl;

.field public final u0:Lgl;

.field public v0:Lar3;

.field public w0:Lsp4;


# direct methods
.method public constructor <init>(Lf50;Lzl;Lgl;Lar3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lf50;-><init>(Lf50;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lzm;->u0:Lgl;

    .line 5
    .line 6
    iput-object p2, p0, Lzm;->t0:Lzl;

    .line 7
    .line 8
    iput-object p4, p0, Lzm;->v0:Lar3;

    .line 9
    .line 10
    instance-of p1, p4, Lsp4;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    check-cast p4, Lsp4;

    .line 15
    .line 16
    iput-object p4, p0, Lzm;->w0:Lsp4;

    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public final h(Ll37;)V
    .locals 1

    .line 1
    sget-object v0, Lxp4;->r0:Lxp4;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lvp4;->f(Lxp4;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p0, p0, Lzm;->u0:Lgl;

    .line 8
    .line 9
    invoke-virtual {p0}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Lit0;->d(Ljava/lang/reflect/Member;Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final k(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lzm;->u0:Lgl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lgl;->C0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    instance-of v1, p1, Ljava/util/Map;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lzm;->w0:Lsp4;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast p1, Ljava/util/Map;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3}, Lsp4;->s(Ljava/util/Map;Lro3;Lt37;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p0, p0, Lzm;->v0:Lar3;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, Lar3;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_2
    invoke-virtual {v0}, Lvj8;->L()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance p2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, "Value returned by \'any-getter\' "

    .line 45
    .line 46
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, "() not java.util.Map but "

    .line 53
    .line 54
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p3, p0}, Lt37;->A(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0
.end method
