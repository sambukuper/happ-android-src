.class public final synthetic Lqm1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:Lrm1;

.field public final synthetic Y:B

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lrm1;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqm1;->X:Lrm1;

    .line 5
    .line 6
    iput-byte p2, p0, Lqm1;->Y:B

    .line 7
    .line 8
    iput-object p3, p0, Lqm1;->Z:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqm1;->X:Lrm1;

    .line 2
    .line 3
    iget-object v0, v0, Lrm1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lhw5;

    .line 6
    .line 7
    iget-byte v1, p0, Lqm1;->Y:B

    .line 8
    .line 9
    iget-object p0, p0, Lqm1;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0, v1, p0}, Lhw5;->i(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
