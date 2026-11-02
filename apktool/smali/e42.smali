.class public final Le42;
.super Lg42;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final Z:Lmm0;

.field public final synthetic f0:Li42;


# direct methods
.method public constructor <init>(Li42;JLmm0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le42;->f0:Li42;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lg42;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iput-object p4, p0, Le42;->Z:Lmm0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Le42;->Z:Lmm0;

    .line 2
    .line 3
    iget-object p0, p0, Le42;->f0:Li42;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lmm0;->F(Lu61;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-super {p0}, Lg42;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Le42;->Z:Lmm0;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
