.class public final Lpt5;
.super Lxg0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lqd0;

.field public final synthetic b:Lxi0;


# direct methods
.method public constructor <init>(Lqd0;Lxi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpt5;->a:Lqd0;

    .line 5
    .line 6
    iput-object p2, p0, Lpt5;->b:Lxi0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(ILdh0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lpt5;->a:Lqd0;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-virtual {p1, p2}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lpt5;->b:Lxi0;

    .line 8
    .line 9
    check-cast p1, Laj0;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Laj0;->y(Lxg0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
