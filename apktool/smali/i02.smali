.class public final Li02;
.super Lcv5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final i0:Lo02;


# direct methods
.method public constructor <init>(Lo02;)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const-string v1, "Empty Process"

    .line 3
    .line 4
    invoke-direct {p0, p1, v0, v1}, Lcv5;-><init>(Lo02;ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Li02;->i0:Lo02;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final k(JLjava/lang/String;J)Lp98;
    .locals 0

    .line 1
    iget-object p0, p0, Li02;->i0:Lo02;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lo02;->g0:Ln02;

    .line 7
    .line 8
    return-object p0
.end method
