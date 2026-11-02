.class public final Lgo0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lhi8;


# instance fields
.field public final X:Lhi8;

.field public final Y:Led1;

.field public final Z:I


# direct methods
.method public constructor <init>(Lhi8;Led1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgo0;->X:Lhi8;

    .line 5
    .line 6
    iput-object p2, p0, Lgo0;->Y:Led1;

    .line 7
    .line 8
    iput p3, p0, Lgo0;->Z:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final D()Lrt8;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lhi8;->D()Lrt8;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Led1;->J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final Q()Lve4;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lhi8;->Q()Lve4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final U()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final X()Laa7;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lot0;->X()Laa7;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final a()Led1;
    .locals 0

    .line 8
    iget-object p0, p0, Lgo0;->X:Lhi8;

    invoke-interface {p0}, Lhi8;->a()Lhi8;

    move-result-object p0

    return-object p0
.end method

.method public final a()Lhi8;
    .locals 0

    .line 9
    iget-object p0, p0, Lgo0;->X:Lhi8;

    invoke-interface {p0}, Lhi8;->a()Lhi8;

    move-result-object p0

    return-object p0
.end method

.method public final a()Lot0;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lhi8;->a()Lhi8;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getAnnotations()Lsm;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lzk;->getAnnotations()Lsm;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {v0}, Lhi8;->getIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lgo0;->Z:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final getName()Lv15;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Led1;->getName()Lv15;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final getSource()Lke7;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lgd1;->getSource()Lke7;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final getUpperBounds()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lhi8;->getUpperBounds()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final l()Llh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lhi8;->l()Llh8;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final p()Led1;
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->Y:Led1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, "[inner-copy]"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final y()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgo0;->X:Lhi8;

    .line 2
    .line 3
    invoke-interface {p0}, Lhi8;->y()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
