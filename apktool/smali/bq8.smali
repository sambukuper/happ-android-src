.class public final synthetic Lbq8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Luz7;


# instance fields
.field public final synthetic X:Ljl1;

.field public final synthetic Y:Lqz;

.field public final synthetic Z:I


# direct methods
.method public synthetic constructor <init>(Ljl1;Lqz;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbq8;->X:Ljl1;

    .line 5
    .line 6
    iput-object p2, p0, Lbq8;->Y:Lqz;

    .line 7
    .line 8
    iput p3, p0, Lbq8;->Z:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lbq8;->X:Ljl1;

    .line 2
    .line 3
    iget-object v0, v0, Ljl1;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lf63;

    .line 6
    .line 7
    iget v1, p0, Lbq8;->Z:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object p0, p0, Lbq8;->Y:Lqz;

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1, v2}, Lf63;->z(Lqz;IZ)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method
