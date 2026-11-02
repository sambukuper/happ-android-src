.class public final Lk65;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzu3;
.implements Lsw3;
.implements Lmh8;


# static fields
.field public static final Y:Lk65;


# instance fields
.field public final synthetic X:Lzu3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk65;

    .line 2
    .line 3
    invoke-direct {v0}, Lk65;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk65;->Y:Lk65;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Ljava/lang/Void;

    .line 5
    .line 6
    sget-object v1, Lyb6;->a:Lzb6;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lk65;->X:Lzu3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0}, Lzu3;->C()Z

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
    const-string p0, "Nothing"

    .line 2
    .line 3
    return-object p0
.end method

.method public final I()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0}, Lzu3;->I()Z

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
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lzu3;->O(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0}, Lzu3;->P()Ljava/util/Collection;

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
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0}, Lwu3;->Q()Ljava/util/List;

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
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0}, Lzu3;->c()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0}, Lzu3;->getTypeParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final n()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0}, Lzu3;->n()Z

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
    const-string p0, "kotlin.Nothing"

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NothingKClass"

    .line 2
    .line 3
    return-object p0
.end method

.method public final u()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lk65;->X:Lzu3;

    .line 2
    .line 3
    invoke-interface {p0}, Lzu3;->u()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
