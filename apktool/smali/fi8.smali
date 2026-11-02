.class public final Lfi8;
.super Lvh8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final Z:Ll37;

.field public final f0:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g0:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll37;Ldh8;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/HashMap;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lvp4;->Y:Ll20;

    .line 2
    .line 3
    iget-object v0, v0, Ll20;->X:Luh8;

    .line 4
    .line 5
    invoke-direct {p0, p2, v0}, Lvh8;-><init>(Ldh8;Luh8;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lfi8;->Z:Ll37;

    .line 9
    .line 10
    iput-object p3, p0, Lfi8;->f0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    iput-object p4, p0, Lfi8;->g0:Ljava/util/HashMap;

    .line 13
    .line 14
    sget-object p0, Lxp4;->z0:Lxp4;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lvp4;->f(Lxp4;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lfi8;->d(Ljava/lang/Class;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final c(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfi8;->d(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lfi8;->d(Ljava/lang/Class;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final d(Ljava/lang/Class;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p1}, Lvh8;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lfi8;->f0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/lang/String;

    .line 20
    .line 21
    if-nez v3, :cond_5

    .line 22
    .line 23
    iget-object v4, p0, Lvh8;->X:Luh8;

    .line 24
    .line 25
    sget-object v5, Luh8;->f0:Lgh8;

    .line 26
    .line 27
    invoke-virtual {v4, v0, p1, v5}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 32
    .line 33
    sget-object v0, Lxp4;->Z:Lxp4;

    .line 34
    .line 35
    iget-object p0, p0, Lfi8;->Z:Ll37;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lvp4;->f(Lxp4;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v3, p0, Lvp4;->Y:Ll20;

    .line 48
    .line 49
    iget-object v3, v3, Ll20;->Y:Lhi5;

    .line 50
    .line 51
    check-cast v3, Lb30;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0}, Lb30;->E0(Lvp4;Ldh8;)Lz20;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-nez v3, :cond_1

    .line 61
    .line 62
    invoke-static {p0, v0, p0}, Lbl;->g(Lvp4;Ldh8;Lvp4;)Lal;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {p0, v0, v3}, Lz20;->d(Lvp4;Ldh8;Lal;)Lz20;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    :cond_1
    invoke-virtual {p0}, Lvp4;->d()Lm85;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iget-object v0, v3, Lz20;->e:Lal;

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lm85;->K(Lal;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :cond_2
    if-nez v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const/16 p1, 0x2e

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-gez p1, :cond_3

    .line 93
    .line 94
    :goto_0
    move-object v3, p0

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    goto :goto_0

    .line 103
    :cond_4
    :goto_1
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_5
    return-object v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-class v0, Lfi8;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lfi8;->g0:Ljava/util/HashMap;

    .line 8
    .line 9
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "[%s; id-to-type=%s]"

    .line 14
    .line 15
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
