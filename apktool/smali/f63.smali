.class public final Lf63;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmd3;
.implements Lov8;
.implements Lr85;
.implements Lg83;
.implements Lf91;
.implements Lxo2;
.implements Lv06;


# instance fields
.field public final synthetic X:B

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/lang/Object;

.field public f0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, Lf63;->X:B

    sparse-switch p1, :sswitch_data_0

    .line 517
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 518
    new-instance p1, Lmi3;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lmi3;-><init>(I)V

    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 519
    new-instance p1, Lmi3;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lmi3;-><init>(I)V

    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 520
    iput-object p1, p0, Lf63;->f0:Ljava/lang/Object;

    return-void

    .line 521
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 522
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 523
    sget-object v0, Lmb6;->i0:Ll98;

    .line 524
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 525
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 526
    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    return-void

    .line 527
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 528
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 529
    sget-object p1, Luw6;->a:[J

    .line 530
    new-instance p1, Ls05;

    invoke-direct {p1}, Ls05;-><init>()V

    .line 531
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    return-void

    .line 532
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 533
    new-instance p1, Lyz4;

    .line 534
    invoke-direct {p1}, Lqc4;-><init>()V

    .line 535
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 536
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_3
        0x14 -> :sswitch_2
        0x16 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lf63;->X:B

    .line 571
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 572
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 573
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 574
    sget-object p1, Lt63;->o:Lt63;

    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 575
    new-instance p1, Lr72;

    invoke-direct {p1}, Lr72;-><init>()V

    iput-object p1, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;III)V
    .locals 8

    const/16 v0, 0x12

    iput-byte v0, p0, Lf63;->X:B

    .line 576
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 577
    new-instance v4, Lnt4;

    invoke-direct {v4, p1}, Lnt4;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lf63;->Y:Ljava/lang/Object;

    .line 578
    new-instance v0, Llr5;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 579
    iput-object v0, v4, Lnt4;->e:Llt4;

    .line 580
    new-instance v1, Ldu4;

    const/4 v7, 0x0

    move-object v5, p1

    move-object v6, p2

    move v2, p4

    move v3, p5

    invoke-direct/range {v1 .. v7}, Ldu4;-><init>(IILnt4;Landroid/content/Context;Landroid/view/View;Z)V

    iput-object v1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 581
    iput p3, v1, Ldu4;->g:I

    .line 582
    new-instance p0, Lmr5;

    .line 583
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 584
    iput-object p0, v1, Ldu4;->k:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, Lf63;->X:B

    .line 559
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 560
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 561
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 562
    iput-object p2, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x3

    iput-byte v0, p0, Lf63;->X:B

    .line 555
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 556
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 557
    new-instance v0, Ltb2;

    const/16 v1, 0xe

    invoke-direct {v0, p0, v1}, Ltb2;-><init>(Ljava/lang/Object;B)V

    sget-object v1, Lw74;->Y:Lw74;

    invoke-static {v1, v0}, Lx97;->P(Lw74;Ldn2;)Lg44;

    move-result-object v0

    iput-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 558
    new-instance v0, Llr5;

    invoke-direct {v0, p1}, Llr5;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/LifecycleService;)V
    .locals 2

    const/16 v0, 0x19

    iput-byte v0, p0, Lf63;->X:B

    .line 512
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 513
    new-instance v0, Lg94;

    const/4 v1, 0x1

    .line 514
    invoke-direct {v0, p1, v1}, Lg94;-><init>(Ld94;Z)V

    .line 515
    iput-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 516
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldw7;Lyv7;Lc6;)V
    .locals 1

    const/16 v0, 0x1d

    iput-byte v0, p0, Lf63;->X:B

    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lf63;->f0:Ljava/lang/Object;

    .line 618
    invoke-direct {p0, p3, v0}, Lf63;-><init>(Lov8;B)V

    return-void
.end method

.method public constructor <init>(Lin5;Lhn5;Lqi3;)V
    .locals 1

    const/16 v0, 0x11

    iput-byte v0, p0, Lf63;->X:B

    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lf63;->f0:Ljava/lang/Object;

    .line 586
    invoke-direct {p0, p3, v0}, Lf63;-><init>(Lov8;B)V

    return-void
.end method

.method public constructor <init>(Liq4;Landroid/view/View;)V
    .locals 2

    const/16 v0, 0xc

    iput-byte v0, p0, Lf63;->X:B

    .line 546
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 547
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 548
    new-instance v0, Llq4;

    .line 549
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    .line 550
    new-instance v0, Ljq4;

    .line 551
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 552
    :goto_0
    iput-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 553
    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 554
    iput-object p2, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 502
    iput-byte p4, p0, Lf63;->X:B

    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lf63;->Z:Ljava/lang/Object;

    iput-object p3, p0, Lf63;->f0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, Lf63;->X:B

    .line 567
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 568
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 569
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 570
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk86;)V
    .locals 2

    const/16 v0, 0xf

    iput-byte v0, p0, Lf63;->X:B

    .line 506
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 507
    new-instance v0, Lrv;

    const/4 v1, 0x0

    .line 508
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 509
    iput-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 510
    new-instance v0, Ly5;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ly5;-><init>(B)V

    iput-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 511
    new-instance v0, La23;

    const/16 v1, 0x9

    invoke-direct {v0, p0, p1, v1}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    iput-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm70;Lav8;Lvv4;)V
    .locals 15

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    const/16 v0, 0xe

    iput-byte v0, p0, Lf63;->X:B

    .line 588
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v6, p0, Lf63;->f0:Ljava/lang/Object;

    .line 589
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    const/4 v8, 0x0

    move-object/from16 v9, p3

    move v0, v8

    move v2, v0

    .line 590
    :goto_0
    sget-object v10, Lgx4;->j0:Lgx4;

    const/4 v11, 0x1

    if-eqz v9, :cond_7

    iget v4, v9, Lvv4;->c:I

    .line 591
    iget v3, v9, Lvv4;->d:I

    add-int v5, v0, v3

    .line 592
    iget-object v12, v9, Lvv4;->e:Lvv4;

    move v0, v2

    .line 593
    iget-object v2, v9, Lvv4;->a:Lgx4;

    .line 594
    sget-object v3, Lgx4;->i0:Lgx4;

    if-ne v2, v3, :cond_0

    if-nez v12, :cond_0

    if-nez v4, :cond_1

    :cond_0
    if-eqz v12, :cond_2

    .line 595
    iget v3, v12, Lvv4;->c:I

    if-eq v4, v3, :cond_2

    :cond_1
    move v13, v11

    goto :goto_1

    :cond_2
    move v13, v8

    :goto_1
    if-eqz v13, :cond_3

    goto :goto_2

    :cond_3
    move v11, v0

    :goto_2
    if-eqz v12, :cond_5

    .line 596
    iget-object v0, v12, Lvv4;->a:Lgx4;

    if-ne v0, v2, :cond_5

    if-eqz v13, :cond_4

    goto :goto_3

    :cond_4
    move v14, v5

    goto :goto_4

    .line 597
    :cond_5
    :goto_3
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/util/ArrayList;

    new-instance v0, Lwv4;

    .line 598
    iget v3, v9, Lvv4;->b:I

    move-object v1, p0

    .line 599
    invoke-direct/range {v0 .. v5}, Lwv4;-><init>(Lf63;Lgx4;III)V

    invoke-virtual {v14, v8, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move v14, v8

    :goto_4
    if-eqz v13, :cond_6

    .line 600
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ljava/util/ArrayList;

    new-instance v0, Lwv4;

    .line 601
    iget v3, v9, Lvv4;->b:I

    .line 602
    iget v4, v9, Lvv4;->c:I

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, v10

    .line 603
    invoke-direct/range {v0 .. v5}, Lwv4;-><init>(Lf63;Lgx4;III)V

    invoke-virtual {v13, v8, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_6
    move v2, v11

    move-object v9, v12

    move v0, v14

    goto :goto_0

    :cond_7
    move v0, v2

    move-object v2, v10

    .line 604
    iget-boolean v3, v6, Lm70;->c:Z

    iget v6, v6, Lm70;->b:I

    if-eqz v3, :cond_a

    .line 605
    iget-object v3, p0, Lf63;->Y:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwv4;

    if-eqz v3, :cond_8

    .line 606
    iget-object v3, v3, Lwv4;->a:Lgx4;

    if-eq v3, v2, :cond_8

    if-eqz v0, :cond_8

    .line 607
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/util/ArrayList;

    new-instance v0, Lwv4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lwv4;-><init>(Lf63;Lgx4;III)V

    invoke-virtual {v9, v8, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 608
    :cond_8
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwv4;

    .line 609
    iget-object v3, p0, Lf63;->Y:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Ljava/util/ArrayList;

    .line 610
    iget-object v0, v0, Lwv4;->a:Lgx4;

    if-eq v0, v2, :cond_9

    goto :goto_5

    :cond_9
    move v8, v11

    .line 611
    :goto_5
    new-instance v0, Lwv4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v2, Lgx4;->l0:Lgx4;

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lwv4;-><init>(Lf63;Lgx4;III)V

    invoke-virtual {v9, v8, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 612
    :cond_a
    iget-byte v0, v7, Lav8;->a:B

    const/16 v2, 0x1a

    const/16 v3, 0x9

    if-gt v0, v3, :cond_b

    move v4, v11

    goto :goto_6

    :cond_b
    if-gt v0, v2, :cond_c

    const/4 v4, 0x2

    goto :goto_6

    :cond_c
    const/4 v4, 0x3

    .line 613
    :goto_6
    invoke-static {v4}, Lp61;->B(I)I

    move-result v4

    if-eqz v4, :cond_e

    if-eq v4, v11, :cond_d

    const/16 v11, 0x1b

    const/16 v2, 0x28

    goto :goto_7

    :cond_d
    const/16 v11, 0xa

    goto :goto_7

    :cond_e
    move v2, v3

    .line 614
    :goto_7
    invoke-virtual {p0, v7}, Lf63;->r(Lav8;)I

    move-result v3

    :goto_8
    if-ge v0, v2, :cond_f

    .line 615
    invoke-static {v0}, Lav8;->c(I)Lav8;

    move-result-object v4

    invoke-static {v3, v4, v6}, Lt02;->c(ILav8;I)Z

    move-result v4

    if-nez v4, :cond_f

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_f
    :goto_9
    if-le v0, v11, :cond_10

    add-int/lit8 v2, v0, -0x1

    .line 616
    invoke-static {v2}, Lav8;->c(I)Lav8;

    move-result-object v2

    invoke-static {v3, v2, v6}, Lt02;->c(ILav8;I)Z

    move-result v2

    if-eqz v2, :cond_10

    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    .line 617
    :cond_10
    invoke-static {v0}, Lav8;->c(I)Lav8;

    move-result-object v0

    iput-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lov8;B)V
    .locals 0

    .line 585
    iput-byte p2, p0, Lf63;->X:B

    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lpt0;Ljava/util/List;Lf63;)V
    .locals 1

    const/16 v0, 0x13

    iput-byte v0, p0, Lf63;->X:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 564
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 565
    iput-object p2, p0, Lf63;->Z:Ljava/lang/Object;

    .line 566
    iput-object p3, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqe5;)V
    .locals 1

    const/16 v0, 0x1b

    iput-byte v0, p0, Lf63;->X:B

    .line 537
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 538
    invoke-static {p1}, Lnr4;->f(I)Lqv;

    move-result-object p1

    iput-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 539
    sget-object p1, Lzu0;->a:Lzu0;

    invoke-static {p1}, Lnr4;->g(Ljava/lang/Object;)Ltv;

    move-result-object p1

    iput-object p1, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqt5;Ljava/util/ArrayList;Lxi0;)V
    .locals 1

    const/16 v0, 0x15

    iput-byte v0, p0, Lf63;->X:B

    .line 587
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf63;->f0:Ljava/lang/Object;

    iput-object p2, p0, Lf63;->Y:Ljava/lang/Object;

    iput-object p3, p0, Lf63;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly53;Landroid/util/Size;Landroid/hardware/camera2/CameraCharacteristics;Z)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v8, 0x1

    .line 6
    iput-byte v8, v0, Lf63;->X:B

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ls08;->b()V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lf63;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object v2, Ler8;->O:Lzx;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    invoke-interface {v1, v2, v9}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lql0;

    .line 24
    .line 25
    if-eqz v2, :cond_c

    .line 26
    .line 27
    new-instance v3, Lxm0;

    .line 28
    .line 29
    invoke-direct {v3}, Lxm0;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v1, v3}, Lql0;->a(Ly53;Lxm0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Lxm0;->e()Lym0;

    .line 36
    .line 37
    .line 38
    new-instance v10, Llr;

    .line 39
    .line 40
    const/16 v2, 0x10

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    invoke-direct {v10, v2, v11}, Llr;-><init>(BZ)V

    .line 44
    .line 45
    .line 46
    iput-object v10, v0, Lf63;->Z:Ljava/lang/Object;

    .line 47
    .line 48
    new-instance v12, Lo8;

    .line 49
    .line 50
    invoke-static {}, Lki3;->a()Ljava/util/concurrent/Executor;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v3, Lji3;->C:Lzx;

    .line 55
    .line 56
    invoke-interface {v1, v3, v2}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-object/from16 v3, p3

    .line 66
    .line 67
    invoke-direct {v12, v2, v3}, Lo8;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;)V

    .line 68
    .line 69
    .line 70
    new-instance v4, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    sget-object v2, Le63;->q:Lzx;

    .line 76
    .line 77
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v1, v2, v3}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    const/16 v13, 0x100

    .line 92
    .line 93
    const/16 v14, 0x20

    .line 94
    .line 95
    if-eqz v2, :cond_0

    .line 96
    .line 97
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_0
    sget-object v2, Ly53;->f0:Lzx;

    .line 113
    .line 114
    invoke-interface {v1, v2, v9}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, Ljava/lang/Integer;

    .line 119
    .line 120
    if-eqz v2, :cond_1

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    goto :goto_0

    .line 127
    :cond_1
    sget-object v2, Le63;->p:Lzx;

    .line 128
    .line 129
    invoke-interface {v1, v2, v9}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Ljava/lang/Integer;

    .line 134
    .line 135
    if-eqz v2, :cond_2

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    const/16 v5, 0x1005

    .line 142
    .line 143
    if-ne v3, v5, :cond_2

    .line 144
    .line 145
    move v2, v5

    .line 146
    goto :goto_0

    .line 147
    :cond_2
    if-eqz v2, :cond_3

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-ne v2, v14, :cond_3

    .line 154
    .line 155
    move v2, v14

    .line 156
    goto :goto_0

    .line 157
    :cond_3
    move v2, v13

    .line 158
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    :goto_1
    invoke-virtual {v1}, Ly53;->n()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    sget-object v2, Ly53;->h0:Lzx;

    .line 170
    .line 171
    invoke-interface {v1, v2, v9}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    if-nez v1, :cond_b

    .line 176
    .line 177
    new-instance v1, Lxx;

    .line 178
    .line 179
    new-instance v6, Lay1;

    .line 180
    .line 181
    invoke-direct {v6}, Lay1;-><init>()V

    .line 182
    .line 183
    .line 184
    new-instance v7, Lay1;

    .line 185
    .line 186
    invoke-direct {v7}, Lay1;-><init>()V

    .line 187
    .line 188
    .line 189
    move-object/from16 v2, p2

    .line 190
    .line 191
    move/from16 v5, p4

    .line 192
    .line 193
    invoke-direct/range {v1 .. v7}, Lxx;-><init>(Landroid/util/Size;ILjava/util/ArrayList;ZLay1;Lay1;)V

    .line 194
    .line 195
    .line 196
    iput-object v1, v0, Lf63;->f0:Ljava/lang/Object;

    .line 197
    .line 198
    iget-object v0, v10, Llr;->f0:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Lxx;

    .line 201
    .line 202
    if-nez v0, :cond_4

    .line 203
    .line 204
    iget-object v0, v10, Llr;->Y:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Lz76;

    .line 207
    .line 208
    if-nez v0, :cond_4

    .line 209
    .line 210
    move v0, v8

    .line 211
    goto :goto_2

    .line 212
    :cond_4
    move v0, v11

    .line 213
    :goto_2
    const-string v5, "CaptureNode does not support recreation yet."

    .line 214
    .line 215
    invoke-static {v5, v0}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 216
    .line 217
    .line 218
    iput-object v1, v10, Llr;->f0:Ljava/lang/Object;

    .line 219
    .line 220
    new-instance v0, Ldn0;

    .line 221
    .line 222
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-le v4, v8, :cond_5

    .line 230
    .line 231
    move v4, v8

    .line 232
    goto :goto_3

    .line 233
    :cond_5
    move v4, v11

    .line 234
    :goto_3
    const/4 v5, 0x2

    .line 235
    const/4 v15, 0x4

    .line 236
    if-nez p4, :cond_7

    .line 237
    .line 238
    if-eqz v4, :cond_6

    .line 239
    .line 240
    new-instance v9, Lcv4;

    .line 241
    .line 242
    move/from16 v16, v8

    .line 243
    .line 244
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    move/from16 v17, v11

    .line 249
    .line 250
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    invoke-direct {v9, v8, v11, v13, v15}, Lcv4;-><init>(IIII)V

    .line 255
    .line 256
    .line 257
    new-array v8, v5, [Lxg0;

    .line 258
    .line 259
    aput-object v0, v8, v17

    .line 260
    .line 261
    iget-object v11, v9, Lcv4;->Y:Lyg0;

    .line 262
    .line 263
    aput-object v11, v8, v16

    .line 264
    .line 265
    invoke-static {v8}, Ljb5;->j([Lxg0;)Lxg0;

    .line 266
    .line 267
    .line 268
    new-instance v8, Lcv4;

    .line 269
    .line 270
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 275
    .line 276
    .line 277
    move-result v13

    .line 278
    invoke-direct {v8, v11, v13, v14, v15}, Lcv4;-><init>(IIII)V

    .line 279
    .line 280
    .line 281
    new-array v11, v5, [Lxg0;

    .line 282
    .line 283
    aput-object v0, v11, v17

    .line 284
    .line 285
    iget-object v0, v8, Lcv4;->Y:Lyg0;

    .line 286
    .line 287
    aput-object v0, v11, v16

    .line 288
    .line 289
    invoke-static {v11}, Ljb5;->j([Lxg0;)Lxg0;

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_6
    move/from16 v16, v8

    .line 294
    .line 295
    move/from16 v17, v11

    .line 296
    .line 297
    new-instance v8, Lcv4;

    .line 298
    .line 299
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 304
    .line 305
    .line 306
    move-result v13

    .line 307
    invoke-direct {v8, v11, v13, v3, v15}, Lcv4;-><init>(IIII)V

    .line 308
    .line 309
    .line 310
    new-array v11, v5, [Lxg0;

    .line 311
    .line 312
    aput-object v0, v11, v17

    .line 313
    .line 314
    iget-object v0, v8, Lcv4;->Y:Lyg0;

    .line 315
    .line 316
    aput-object v0, v11, v16

    .line 317
    .line 318
    invoke-static {v11}, Ljb5;->j([Lxg0;)Lxg0;

    .line 319
    .line 320
    .line 321
    move-object/from16 v18, v9

    .line 322
    .line 323
    move-object v9, v8

    .line 324
    move-object/from16 v8, v18

    .line 325
    .line 326
    :goto_4
    new-instance v0, Lbn0;

    .line 327
    .line 328
    move/from16 v11, v17

    .line 329
    .line 330
    invoke-direct {v0, v10, v11}, Lbn0;-><init>(Llr;B)V

    .line 331
    .line 332
    .line 333
    move/from16 v13, v16

    .line 334
    .line 335
    goto :goto_5

    .line 336
    :cond_7
    move/from16 v16, v8

    .line 337
    .line 338
    new-instance v0, Ly45;

    .line 339
    .line 340
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 345
    .line 346
    .line 347
    move-result v13

    .line 348
    invoke-static {v8, v13, v3, v15}, Lz68;->x(IIII)Lo8;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-direct {v0, v8}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    new-instance v8, Lbn0;

    .line 356
    .line 357
    move/from16 v13, v16

    .line 358
    .line 359
    invoke-direct {v8, v10, v13}, Lbn0;-><init>(Llr;B)V

    .line 360
    .line 361
    .line 362
    move-object/from16 v18, v9

    .line 363
    .line 364
    move-object v9, v0

    .line 365
    move-object v0, v8

    .line 366
    move-object/from16 v8, v18

    .line 367
    .line 368
    :goto_5
    invoke-interface {v9}, Lq63;->getSurface()Landroid/view/Surface;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    iget-object v15, v1, Lxx;->a:Lv73;

    .line 376
    .line 377
    if-nez v15, :cond_8

    .line 378
    .line 379
    move v15, v13

    .line 380
    goto :goto_6

    .line 381
    :cond_8
    move v15, v11

    .line 382
    :goto_6
    const-string v11, "The surface is already set."

    .line 383
    .line 384
    invoke-static {v11, v15}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 385
    .line 386
    .line 387
    new-instance v11, Lv73;

    .line 388
    .line 389
    invoke-direct {v11, v14, v2, v3}, Lv73;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 390
    .line 391
    .line 392
    iput-object v11, v1, Lxx;->a:Lv73;

    .line 393
    .line 394
    new-instance v11, Lz76;

    .line 395
    .line 396
    invoke-direct {v11, v9}, Lz76;-><init>(Lq63;)V

    .line 397
    .line 398
    .line 399
    iput-object v11, v10, Llr;->Y:Ljava/lang/Object;

    .line 400
    .line 401
    new-instance v11, Lom0;

    .line 402
    .line 403
    invoke-direct {v11, v10}, Lom0;-><init>(Llr;)V

    .line 404
    .line 405
    .line 406
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 407
    .line 408
    .line 409
    move-result-object v14

    .line 410
    invoke-interface {v9, v11, v14}, Lq63;->p(Lp63;Ljava/util/concurrent/Executor;)V

    .line 411
    .line 412
    .line 413
    if-eqz v4, :cond_a

    .line 414
    .line 415
    if-eqz v8, :cond_a

    .line 416
    .line 417
    invoke-virtual {v8}, Lcv4;->getSurface()Landroid/view/Surface;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    iget-object v9, v1, Lxx;->b:Lv73;

    .line 422
    .line 423
    if-nez v9, :cond_9

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_9
    const/4 v13, 0x0

    .line 427
    :goto_7
    const-string v9, "The secondary surface is already set."

    .line 428
    .line 429
    invoke-static {v9, v13}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 430
    .line 431
    .line 432
    new-instance v9, Lv73;

    .line 433
    .line 434
    invoke-direct {v9, v4, v2, v3}, Lv73;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 435
    .line 436
    .line 437
    iput-object v9, v1, Lxx;->b:Lv73;

    .line 438
    .line 439
    new-instance v1, Lz76;

    .line 440
    .line 441
    invoke-direct {v1, v8}, Lz76;-><init>(Lq63;)V

    .line 442
    .line 443
    .line 444
    iput-object v1, v10, Llr;->Z:Ljava/lang/Object;

    .line 445
    .line 446
    new-instance v1, Lom0;

    .line 447
    .line 448
    invoke-direct {v1, v10}, Lom0;-><init>(Llr;)V

    .line 449
    .line 450
    .line 451
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-virtual {v8, v1, v2}, Lcv4;->p(Lp63;Ljava/util/concurrent/Executor;)V

    .line 456
    .line 457
    .line 458
    :cond_a
    iput-object v0, v6, Lay1;->b:Ljava/lang/Object;

    .line 459
    .line 460
    new-instance v0, Lbn0;

    .line 461
    .line 462
    invoke-direct {v0, v10, v5}, Lbn0;-><init>(Llr;B)V

    .line 463
    .line 464
    .line 465
    iput-object v0, v7, Lay1;->b:Ljava/lang/Object;

    .line 466
    .line 467
    iget-object v0, v12, Lo8;->f0:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, Li26;

    .line 470
    .line 471
    const-class v1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 472
    .line 473
    invoke-virtual {v0, v1}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    check-cast v0, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 478
    .line 479
    return-void

    .line 480
    :cond_b
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 481
    .line 482
    .line 483
    throw v9

    .line 484
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    sget-object v2, Lu18;->I:Lzx;

    .line 489
    .line 490
    invoke-interface {v1, v2, v0}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    check-cast v0, Ljava/lang/String;

    .line 495
    .line 496
    const-string v1, "Implementation is missing option unpacker for "

    .line 497
    .line 498
    invoke-static {v0, v1}, Lbt;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    throw v9
.end method

.method public constructor <init>(Lz47;Lki8;)V
    .locals 1

    const/4 v0, 0x6

    iput-byte v0, p0, Lf63;->X:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 541
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 542
    iput-object p2, p0, Lf63;->Z:Ljava/lang/Object;

    .line 543
    new-instance p1, Lwe5;

    const/16 p2, 0x9

    .line 544
    invoke-direct {p1, p2}, Lwe5;-><init>(B)V

    .line 545
    new-instance p2, Lxd6;

    invoke-direct {p2, p1}, Lxd6;-><init>(Lwe5;)V

    iput-object p2, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzl1;Ly45;)V
    .locals 1

    const/16 v0, 0x10

    iput-byte v0, p0, Lf63;->X:B

    .line 503
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 504
    iput-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lf63;->Z:Ljava/lang/Object;

    .line 505
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lf63;->f0:Ljava/lang/Object;

    return-void
.end method

.method public static n(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)Lf63;
    .locals 5

    .line 1
    new-instance v0, Lf63;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lf63;-><init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-object p1, v0, Lf63;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object p1, v0, Lf63;->Y:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/SharedPreferences;

    .line 21
    .line 22
    const-string v1, "topic_operation_queue"

    .line 23
    .line 24
    const-string v2, ""

    .line 25
    .line 26
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    const-string v1, ","

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_0
    const-string v1, ","

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    array-length v1, p1

    .line 53
    array-length v1, p1

    .line 54
    const/4 v2, 0x0

    .line 55
    :goto_0
    if-ge v2, v1, :cond_2

    .line 56
    .line 57
    aget-object v3, p1, v2

    .line 58
    .line 59
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_1

    .line 64
    .line 65
    iget-object v4, v0, Lf63;->Z:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Ljava/util/ArrayDeque;

    .line 68
    .line 69
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto :goto_3

    .line 75
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    monitor-exit p0

    .line 79
    return-object v0

    .line 80
    :cond_3
    :goto_2
    monitor-exit p0

    .line 81
    return-object v0

    .line 82
    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw p1
.end method

.method public static p(Lct6;Ljava/lang/String;)Let6;
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Let6;

    .line 3
    .line 4
    iget-object v1, v0, Let6;->c:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-interface {p0}, Lct6;->g()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lgt6;

    .line 32
    .line 33
    instance-of v1, v0, Let6;

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v1, v0

    .line 39
    check-cast v1, Let6;

    .line 40
    .line 41
    iget-object v2, v1, Let6;->c:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_3
    instance-of v1, v0, Lct6;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    check-cast v0, Lct6;

    .line 55
    .line 56
    invoke-static {v0, p1}, Lf63;->p(Lct6;Ljava/lang/String;)Let6;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_4
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method


# virtual methods
.method public A(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-static {}, Lry7;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Lq98;->a:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lf63;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v2, p0, Lf63;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-object v3, p0, Lf63;->Y:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ll98;

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Ll98;->a(J)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-gez v4, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    invoke-virtual {v3, v0, v1, p1}, Ll98;->b(JLjava/lang/Object;)Ll98;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v2

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :try_start_1
    iget-object p0, v3, Ll98;->c:[Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p1, p0, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    monitor-exit v2

    .line 53
    return-void

    .line 54
    :goto_0
    monitor-exit v2

    .line 55
    throw p0
.end method

.method public B(Lna6;Lnl3;Z)Lmo8;
    .locals 7

    .line 1
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz47;

    .line 4
    .line 5
    iget-object v1, v0, Lz47;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lc6;

    .line 8
    .line 9
    iget-boolean p2, p2, Lnl3;->d:Z

    .line 10
    .line 11
    iget-object v2, p1, Lna6;->b:Lgb6;

    .line 12
    .line 13
    instance-of v3, v2, Leb6;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    move-object v3, v2

    .line 19
    check-cast v3, Leb6;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v3, v4

    .line 23
    :goto_0
    if-eqz v3, :cond_2

    .line 24
    .line 25
    iget-object v3, v3, Leb6;->a:Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3}, Lut3;->b(Ljava/lang/String;)Lut3;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Lut3;->c()Ldu5;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_1
    move-object v3, v4

    .line 50
    :goto_2
    new-instance v5, Ln44;

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    invoke-direct {v5, v0, p1, v6}, Ln44;-><init>(Lz47;Lvj3;Z)V

    .line 54
    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iget-object p0, v1, Lc6;->n0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Lwx4;

    .line 61
    .line 62
    iget-object p0, p0, Lwx4;->h0:Lzz3;

    .line 63
    .line 64
    invoke-virtual {p0, v3}, Lzz3;->r(Ldu5;)Laa7;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, Lvm;

    .line 69
    .line 70
    invoke-virtual {p0}, Lt14;->getAnnotations()Lsm;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    const/4 v0, 0x2

    .line 75
    new-array v0, v0, [Lsm;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    aput-object p3, v0, v1

    .line 79
    .line 80
    aput-object v5, v0, v6

    .line 81
    .line 82
    invoke-direct {p1, v0}, Lvm;-><init>([Lsm;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, p1}, Ly08;->m(Lt14;Lsm;)Lt14;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast p0, Laa7;

    .line 93
    .line 94
    if-eqz p2, :cond_3

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_3
    invoke-virtual {p0, v6}, Laa7;->u0(Z)Laa7;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p0, p1}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_4
    sget-object p1, Lzi8;->Y:Lzi8;

    .line 107
    .line 108
    const/4 v0, 0x6

    .line 109
    invoke-static {p1, p2, v4, v0}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0, v2, p1}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    sget-object p1, Lrt8;->Z:Lrt8;

    .line 118
    .line 119
    sget-object v0, Lrt8;->g0:Lrt8;

    .line 120
    .line 121
    if-eqz p2, :cond_6

    .line 122
    .line 123
    if-eqz p3, :cond_5

    .line 124
    .line 125
    move-object p1, v0

    .line 126
    :cond_5
    iget-object p2, v1, Lc6;->n0:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p2, Lwx4;

    .line 129
    .line 130
    iget-object p2, p2, Lwx4;->h0:Lzz3;

    .line 131
    .line 132
    invoke-virtual {p2, p1, p0, v5}, Lzz3;->i(Lrt8;Lt14;Lsm;)Laa7;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :cond_6
    iget-object p2, v1, Lc6;->n0:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p2, Lwx4;

    .line 140
    .line 141
    iget-object p2, p2, Lwx4;->h0:Lzz3;

    .line 142
    .line 143
    invoke-virtual {p2, p1, p0, v5}, Lzz3;->i(Lrt8;Lt14;Lsm;)Laa7;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p2, v1, Lc6;->n0:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p2, Lwx4;

    .line 150
    .line 151
    iget-object p2, p2, Lwx4;->h0:Lzz3;

    .line 152
    .line 153
    invoke-virtual {p2, v0, p0, v5}, Lzz3;->i(Lrt8;Lt14;Lsm;)Laa7;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {p0, v6}, Laa7;->u0(Z)Laa7;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {p1, p0}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0
.end method

.method public C(Lgb6;Lnl3;)Lt14;
    .locals 11

    .line 1
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz47;

    .line 4
    .line 5
    iget-object v0, v0, Lz47;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lc6;

    .line 8
    .line 9
    instance-of v1, p1, Leb6;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    check-cast p1, Leb6;

    .line 15
    .line 16
    iget-object p0, p1, Leb6;->a:Ljava/lang/Class;

    .line 17
    .line 18
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lut3;->b(Ljava/lang/String;)Lut3;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lut3;->c()Ldu5;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_0
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Lc6;->n0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lwx4;

    .line 44
    .line 45
    iget-object p0, p0, Lwx4;->h0:Lzz3;

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lzz3;->t(Ldu5;)Laa7;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_1
    iget-object p0, v0, Lc6;->n0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lwx4;

    .line 55
    .line 56
    iget-object p0, p0, Lwx4;->h0:Lzz3;

    .line 57
    .line 58
    invoke-virtual {p0}, Lzz3;->x()Laa7;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_2
    instance-of v1, p1, Lva6;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    if-eqz v1, :cond_9

    .line 67
    .line 68
    check-cast p1, Lva6;

    .line 69
    .line 70
    iget-object v0, p1, Lva6;->a:Ljava/lang/reflect/Type;

    .line 71
    .line 72
    iget-boolean v1, p2, Lnl3;->d:Z

    .line 73
    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    iget-object v1, p2, Lnl3;->a:Lzi8;

    .line 77
    .line 78
    sget-object v4, Lzi8;->X:Lzi8;

    .line 79
    .line 80
    if-eq v1, v4, :cond_3

    .line 81
    .line 82
    const/4 v3, 0x1

    .line 83
    :cond_3
    invoke-virtual {p1}, Lva6;->d()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    sget-object v4, Ls32;->Z:Ls32;

    .line 88
    .line 89
    if-nez v1, :cond_5

    .line 90
    .line 91
    if-nez v3, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0, p1, p2, v2}, Lf63;->m(Lva6;Lnl3;Laa7;)Laa7;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-eqz p0, :cond_4

    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    filled-new-array {p0}, [Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {v4, p0}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_5
    const/4 v9, 0x0

    .line 114
    const/16 v10, 0x3d

    .line 115
    .line 116
    sget-object v6, Lol3;->Z:Lol3;

    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    const/4 v8, 0x0

    .line 120
    move-object v5, p2

    .line 121
    invoke-static/range {v5 .. v10}, Lnl3;->a(Lnl3;Lol3;ZLjava/util/Set;Laa7;I)Lnl3;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p0, p1, p2, v2}, Lf63;->m(Lva6;Lnl3;Laa7;)Laa7;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    if-nez p2, :cond_6

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    filled-new-array {p0}, [Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {v4, p0}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :cond_6
    const/4 v9, 0x0

    .line 145
    const/16 v10, 0x3d

    .line 146
    .line 147
    sget-object v6, Lol3;->Y:Lol3;

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    invoke-static/range {v5 .. v10}, Lnl3;->a(Lnl3;Lol3;ZLjava/util/Set;Laa7;I)Lnl3;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {p0, p1, v2, p2}, Lf63;->m(Lva6;Lnl3;Laa7;)Laa7;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-nez p0, :cond_7

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    filled-new-array {p0}, [Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-static {v4, p0}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :cond_7
    if-eqz v1, :cond_8

    .line 175
    .line 176
    new-instance p1, Lr66;

    .line 177
    .line 178
    invoke-direct {p1, p2, p0}, Lce2;-><init>(Laa7;Laa7;)V

    .line 179
    .line 180
    .line 181
    sget-object v0, Lv14;->a:Lq45;

    .line 182
    .line 183
    invoke-virtual {v0, p2, p0}, Lq45;->b(Lt14;Lt14;)Z

    .line 184
    .line 185
    .line 186
    return-object p1

    .line 187
    :cond_8
    invoke-static {p2, p0}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :cond_9
    move-object v5, p2

    .line 193
    instance-of p2, p1, Lna6;

    .line 194
    .line 195
    if-eqz p2, :cond_a

    .line 196
    .line 197
    check-cast p1, Lna6;

    .line 198
    .line 199
    invoke-virtual {p0, p1, v5, v3}, Lf63;->B(Lna6;Lnl3;Z)Lmo8;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :cond_a
    instance-of p2, p1, Ljb6;

    .line 205
    .line 206
    if-eqz p2, :cond_c

    .line 207
    .line 208
    check-cast p1, Ljb6;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljb6;->c()Lgb6;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-eqz p1, :cond_b

    .line 215
    .line 216
    invoke-virtual {p0, p1, v5}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    return-object p0

    .line 221
    :cond_b
    iget-object p0, v0, Lc6;->n0:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p0, Lwx4;

    .line 224
    .line 225
    iget-object p0, p0, Lwx4;->h0:Lzz3;

    .line 226
    .line 227
    invoke-virtual {p0}, Lzz3;->n()Laa7;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0

    .line 232
    :cond_c
    if-nez p1, :cond_d

    .line 233
    .line 234
    iget-object p0, v0, Lc6;->n0:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p0, Lwx4;

    .line 237
    .line 238
    iget-object p0, p0, Lwx4;->h0:Lzz3;

    .line 239
    .line 240
    invoke-virtual {p0}, Lzz3;->n()Laa7;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :cond_d
    const-string p0, "Unsupported type: "

    .line 246
    .line 247
    invoke-static {p1, p0}, Lem7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return-object v2
.end method

.method public D()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls05;

    .line 4
    .line 5
    iget-object v1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ls05;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ldn2;

    .line 20
    .line 21
    invoke-interface {v2, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0, v1, v2}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
.end method

.method public a()Landroid/content/ClipDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/ClipDescription;

    .line 4
    .line 5
    return-object p0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lqt5;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lqt5;->e:Lyo2;

    .line 9
    .line 10
    return-void
.end method

.method public c(Ljava/util/concurrent/Executor;Ln85;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lf63;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v2, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance p2, Lrc4;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {p2, p0, v1}, Lrc4;-><init>(Lf63;B)V

    .line 31
    .line 32
    .line 33
    check-cast p1, Llv2;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Llv2;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v1, Lsc4;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-direct {v1, p0, p2, v2}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lf63;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lhi5;->a0(Lf91;)Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lue3;->y(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lc6;

    .line 17
    .line 18
    iget-object v1, p0, Lc6;->j0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lc6;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lc6;->n0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    invoke-static {p0}, Lhi5;->a0(Lf91;)Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lue3;->y(Landroid/content/Context;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lqi3;

    .line 51
    .line 52
    iget-object p0, p0, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public e()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object p0
.end method

.method public f()V
    .locals 0

    .line 1
    return-void
.end method

.method public g()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object p0
.end method

.method public get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lf63;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lry7;->f()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sget-wide v2, Lq98;->a:J

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ll98;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Ll98;->a(J)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-ltz v0, :cond_1

    .line 34
    .line 35
    iget-object p0, p0, Ll98;->c:[Ljava/lang/Object;

    .line 36
    .line 37
    aget-object p0, p0, v0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    :goto_0
    return-object p0

    .line 42
    :pswitch_0
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lv06;

    .line 45
    .line 46
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/content/Context;

    .line 51
    .line 52
    iget-object v1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lv06;

    .line 55
    .line 56
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lwr6;

    .line 61
    .line 62
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Lg55;

    .line 65
    .line 66
    invoke-virtual {p0}, Lg55;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ldz;

    .line 71
    .line 72
    new-instance v2, Lf63;

    .line 73
    .line 74
    const/4 v3, 0x7

    .line 75
    invoke-direct {v2, v0, v1, p0, v3}, Lf63;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
.end method

.method public getRoot()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 4
    .line 5
    return-object p0
.end method

.method public h()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public i(Ln85;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v1, Lrc4;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {v1, p0, v2}, Lrc4;-><init>(Lf63;B)V

    .line 31
    .line 32
    .line 33
    check-cast p1, Llv2;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Llv2;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
.end method

.method public j()V
    .locals 4

    .line 1
    iget-byte v0, p0, Lf63;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lc6;

    .line 9
    .line 10
    iget-object v1, v0, Lc6;->j0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 13
    .line 14
    new-instance v2, Lv47;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p0, v3}, Lv47;-><init>(Lf63;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lc6;->f0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 26
    .line 27
    new-instance v2, Lv47;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {v2, p0, v3}, Lv47;-><init>(Lf63;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Lc6;->n0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 39
    .line 40
    new-instance v1, Lv47;

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    invoke-direct {v1, p0, v2}, Lv47;-><init>(Lf63;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_0
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lqi3;

    .line 53
    .line 54
    iget-object v0, v0, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v1, Li81;

    .line 60
    .line 61
    const/4 v2, 0x6

    .line 62
    invoke-direct {v1, p0, v2}, Li81;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public k()Lv76;
    .locals 12

    .line 1
    new-instance v0, Ls76;

    .line 2
    .line 3
    iget-object v1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p0, Lf63;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lt63;

    .line 10
    .line 11
    iget-object v3, p0, Lf63;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lr72;

    .line 14
    .line 15
    new-instance v4, Ls72;

    .line 16
    .line 17
    iget-object v3, v3, Lr72;->a:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-static {v3}, Lw51;->P(Ljava/util/Map;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v4, v3}, Ls72;-><init>(Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    const/16 v3, 0x1fff

    .line 27
    .line 28
    invoke-static {v2, v4, v3}, Lt63;->a(Lt63;Ls72;I)Lt63;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, Ltv2;

    .line 33
    .line 34
    const/16 v4, 0x13

    .line 35
    .line 36
    invoke-direct {v3, v4}, Ltv2;-><init>(B)V

    .line 37
    .line 38
    .line 39
    move-object v4, v3

    .line 40
    new-instance v3, Lvz7;

    .line 41
    .line 42
    invoke-direct {v3, v4}, Lvz7;-><init>(Ldn2;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, Ltb2;

    .line 46
    .line 47
    const/16 v5, 0x9

    .line 48
    .line 49
    invoke-direct {v4, p0, v5}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    move-object p0, v4

    .line 53
    new-instance v4, Lvz7;

    .line 54
    .line 55
    invoke-direct {v4, p0}, Lvz7;-><init>(Ldn2;)V

    .line 56
    .line 57
    .line 58
    new-instance p0, Ltv2;

    .line 59
    .line 60
    const/16 v5, 0x14

    .line 61
    .line 62
    invoke-direct {p0, v5}, Ltv2;-><init>(B)V

    .line 63
    .line 64
    .line 65
    new-instance v5, Lvz7;

    .line 66
    .line 67
    invoke-direct {v5, p0}, Lvz7;-><init>(Ldn2;)V

    .line 68
    .line 69
    .line 70
    new-instance v6, Luy0;

    .line 71
    .line 72
    sget-object v7, Ld02;->X:Ld02;

    .line 73
    .line 74
    move-object v8, v7

    .line 75
    move-object v9, v7

    .line 76
    move-object v10, v7

    .line 77
    move-object v11, v7

    .line 78
    invoke-direct/range {v6 .. v11}, Luy0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    invoke-direct/range {v0 .. v6}, Ls76;-><init>(Landroid/content/Context;Lt63;Lvz7;Lvz7;Lvz7;Luy0;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Lv76;

    .line 85
    .line 86
    invoke-direct {p0, v0}, Lv76;-><init>(Ls76;)V

    .line 87
    .line 88
    .line 89
    return-object p0
.end method

.method public l()V
    .locals 5

    .line 1
    invoke-static {}, Ls08;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Llr;

    .line 7
    .line 8
    invoke-static {}, Ls08;->b()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Llr;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lxx;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Llr;->Y:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lz76;

    .line 21
    .line 22
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Llr;->Z:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lz76;

    .line 28
    .line 29
    iget-object v2, v0, Lxx;->a:Lv73;

    .line 30
    .line 31
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lwg1;->a()V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, Lxx;->a:Lv73;

    .line 38
    .line 39
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget-object v2, v2, Lwg1;->e:Lud0;

    .line 43
    .line 44
    invoke-static {v2}, Lvr3;->P(Lxb4;)Lxb4;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, Lcn0;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v3, v1, v4}, Lcn0;-><init>(Lz76;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v2, v3, v1}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Lxx;->c:Lv73;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    invoke-virtual {v1}, Lwg1;->a()V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Lxx;->c:Lv73;

    .line 70
    .line 71
    iget-object v1, v1, Lwg1;->e:Lud0;

    .line 72
    .line 73
    invoke-static {v1}, Lvr3;->P(Lxb4;)Lxb4;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v3, Lcn0;

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-direct {v3, v4, v2}, Lcn0;-><init>(Lz76;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-interface {v1, v3, v4}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 88
    .line 89
    .line 90
    :cond_0
    iget-object v1, v0, Lxx;->f:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-le v1, v2, :cond_1

    .line 97
    .line 98
    iget-object v1, v0, Lxx;->b:Lv73;

    .line 99
    .line 100
    if-eqz v1, :cond_1

    .line 101
    .line 102
    invoke-virtual {v1}, Lwg1;->a()V

    .line 103
    .line 104
    .line 105
    iget-object v0, v0, Lxx;->b:Lv73;

    .line 106
    .line 107
    iget-object v0, v0, Lwg1;->e:Lud0;

    .line 108
    .line 109
    invoke-static {v0}, Lvr3;->P(Lxb4;)Lxb4;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v1, Lcn0;

    .line 114
    .line 115
    const/4 v2, 0x2

    .line 116
    invoke-direct {v1, p0, v2}, Lcn0;-><init>(Lz76;B)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-interface {v0, v1, p0}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    return-void
.end method

.method public m(Lva6;Lnl3;Laa7;)Laa7;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    iget-object v3, v0, Lnl3;->a:Lzi8;

    .line 10
    .line 11
    iget-object v4, v0, Lnl3;->b:Lol3;

    .line 12
    .line 13
    iget-boolean v6, v0, Lnl3;->d:Z

    .line 14
    .line 15
    iget-object v7, v1, Lf63;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v7, Lz47;

    .line 18
    .line 19
    iget-object v8, v7, Lz47;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v8, Lc6;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Lt14;->m0()Lch8;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    if-nez v10, :cond_1

    .line 31
    .line 32
    :cond_0
    new-instance v10, Ln44;

    .line 33
    .line 34
    invoke-direct {v10, v7, v5, v9}, Ln44;-><init>(Lz47;Lvj3;Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {v10}, Lbt7;->j(Lsm;)Lch8;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    :cond_1
    iget-object v11, v5, Lva6;->b:Lzj3;

    .line 42
    .line 43
    instance-of v12, v11, Lta6;

    .line 44
    .line 45
    sget-object v13, Lrt8;->g0:Lrt8;

    .line 46
    .line 47
    const-class v14, Ljava/lang/Object;

    .line 48
    .line 49
    sget-object v15, Lzi8;->X:Lzi8;

    .line 50
    .line 51
    move/from16 v16, v9

    .line 52
    .line 53
    sget-object v9, Lol3;->Z:Lol3;

    .line 54
    .line 55
    move/from16 v17, v6

    .line 56
    .line 57
    const/16 v18, 0x1

    .line 58
    .line 59
    if-eqz v12, :cond_10

    .line 60
    .line 61
    move-object v12, v11

    .line 62
    check-cast v12, Lta6;

    .line 63
    .line 64
    const/16 v19, 0x0

    .line 65
    .line 66
    invoke-virtual {v12}, Lta6;->c()Lfk2;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-eqz v6, :cond_f

    .line 71
    .line 72
    if-eqz v17, :cond_4

    .line 73
    .line 74
    sget-object v11, Ltl3;->a:Lfk2;

    .line 75
    .line 76
    invoke-virtual {v6, v11}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-eqz v11, :cond_4

    .line 81
    .line 82
    iget-object v6, v8, Lc6;->o0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v6, Lhc6;

    .line 85
    .line 86
    sget-object v11, Lhc6;->d:[Lnw3;

    .line 87
    .line 88
    aget-object v11, v11, v16

    .line 89
    .line 90
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-interface {v11}, Lxu3;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    invoke-static {v11}, Li21;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    invoke-static {v11}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    move-object/from16 v20, v10

    .line 106
    .line 107
    iget-object v10, v6, Lhc6;->b:Lg44;

    .line 108
    .line 109
    invoke-interface {v10}, Lg44;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    check-cast v10, Let4;

    .line 114
    .line 115
    move-object/from16 v21, v7

    .line 116
    .line 117
    sget-object v7, Lx45;->Y:Lx45;

    .line 118
    .line 119
    invoke-interface {v10, v11, v7}, Let4;->e(Lv15;Lx45;)Lot0;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    instance-of v10, v7, Lsx4;

    .line 124
    .line 125
    if-eqz v10, :cond_2

    .line 126
    .line 127
    check-cast v7, Lsx4;

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_2
    move-object/from16 v7, v19

    .line 131
    .line 132
    :goto_0
    if-nez v7, :cond_3

    .line 133
    .line 134
    iget-object v6, v6, Lhc6;->a:Lz47;

    .line 135
    .line 136
    new-instance v7, Lqs0;

    .line 137
    .line 138
    sget-object v10, Lug7;->i:Lfk2;

    .line 139
    .line 140
    invoke-direct {v7, v10, v11}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 141
    .line 142
    .line 143
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    invoke-static {v10}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-virtual {v6, v7, v10}, Lz47;->E(Lqs0;Ljava/util/List;)Lsx4;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    goto/16 :goto_5

    .line 156
    .line 157
    :cond_3
    move-object v6, v7

    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :cond_4
    move-object/from16 v21, v7

    .line 161
    .line 162
    move-object/from16 v20, v10

    .line 163
    .line 164
    iget-object v7, v8, Lc6;->n0:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v7, Lwx4;

    .line 167
    .line 168
    iget-object v7, v7, Lwx4;->h0:Lzz3;

    .line 169
    .line 170
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v6}, Lll3;->g(Lfk2;)Lqs0;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    if-eqz v6, :cond_5

    .line 178
    .line 179
    invoke-virtual {v6}, Lqs0;->a()Lfk2;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v7, v6}, Lzz3;->j(Lfk2;)Lsx4;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    goto :goto_1

    .line 188
    :cond_5
    move-object/from16 v6, v19

    .line 189
    .line 190
    :goto_1
    if-nez v6, :cond_6

    .line 191
    .line 192
    move-object/from16 v6, v19

    .line 193
    .line 194
    goto/16 :goto_5

    .line 195
    .line 196
    :cond_6
    invoke-static {v6}, Lbl1;->f(Led1;)Lgk2;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    sget-object v10, Lll3;->k:Ljava/util/HashMap;

    .line 201
    .line 202
    invoke-virtual {v10, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-eqz v7, :cond_b

    .line 207
    .line 208
    if-eq v4, v9, :cond_a

    .line 209
    .line 210
    if-eq v3, v15, :cond_a

    .line 211
    .line 212
    invoke-virtual {v5}, Lva6;->c()Ljava/util/ArrayList;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-static {v7}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    check-cast v7, Lgb6;

    .line 221
    .line 222
    instance-of v11, v7, Ljb6;

    .line 223
    .line 224
    if-eqz v11, :cond_7

    .line 225
    .line 226
    check-cast v7, Ljb6;

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_7
    move-object/from16 v7, v19

    .line 230
    .line 231
    :goto_2
    if-eqz v7, :cond_b

    .line 232
    .line 233
    invoke-virtual {v7}, Ljb6;->c()Lgb6;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    if-eqz v11, :cond_b

    .line 238
    .line 239
    iget-object v7, v7, Ljb6;->a:Ljava/lang/reflect/WildcardType;

    .line 240
    .line 241
    invoke-interface {v7}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    array-length v11, v7

    .line 249
    if-nez v11, :cond_8

    .line 250
    .line 251
    move-object/from16 v7, v19

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_8
    aget-object v7, v7, v16

    .line 255
    .line 256
    :goto_3
    invoke-static {v7, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_b

    .line 261
    .line 262
    invoke-static {v6}, Lbl1;->f(Led1;)Lgk2;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    sget-object v11, Lll3;->a:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v10, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    check-cast v7, Lfk2;

    .line 273
    .line 274
    if-eqz v7, :cond_9

    .line 275
    .line 276
    invoke-static {v6}, Lel1;->e(Led1;)Lzz3;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    invoke-virtual {v10, v7}, Lzz3;->j(Lfk2;)Lsx4;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-interface {v7}, Lot0;->l()Llh8;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-interface {v7}, Llh8;->g()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-static {v7}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    check-cast v7, Lhi8;

    .line 300
    .line 301
    if-eqz v7, :cond_b

    .line 302
    .line 303
    invoke-interface {v7}, Lhi8;->D()Lrt8;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    if-eqz v7, :cond_b

    .line 308
    .line 309
    if-eq v7, v13, :cond_b

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_9
    const-string v0, "Given class "

    .line 313
    .line 314
    const-string v1, " is not a read-only collection"

    .line 315
    .line 316
    invoke-static {v0, v6, v1}, Lio/sentry/c2;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    return-object v19

    .line 320
    :cond_a
    :goto_4
    invoke-static {v6}, Lpz2;->h(Lsx4;)Lsx4;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    :cond_b
    :goto_5
    if-nez v6, :cond_d

    .line 325
    .line 326
    iget-object v6, v8, Lc6;->l0:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v6, Llr5;

    .line 329
    .line 330
    iget-object v6, v6, Llr5;->Y:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v6, Lq02;

    .line 333
    .line 334
    if-eqz v6, :cond_c

    .line 335
    .line 336
    invoke-virtual {v6, v12}, Lq02;->R(Lta6;)Lsx4;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    goto :goto_6

    .line 341
    :cond_c
    const-string v0, "resolver"

    .line 342
    .line 343
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v19

    .line 347
    :cond_d
    :goto_6
    if-eqz v6, :cond_e

    .line 348
    .line 349
    invoke-interface {v6}, Lot0;->l()Llh8;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    if-eqz v6, :cond_e

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_e
    new-instance v0, Lfk2;

    .line 357
    .line 358
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 359
    .line 360
    iget-object v1, v5, Lva6;->a:Ljava/lang/reflect/Type;

    .line 361
    .line 362
    new-instance v2, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    const-string v3, "Type not found: "

    .line 365
    .line 366
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v0

    .line 380
    :cond_f
    const-string v0, "Class type should have a FQ name: "

    .line 381
    .line 382
    invoke-static {v11, v0}, Lom0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    return-object v19

    .line 386
    :cond_10
    move-object/from16 v21, v7

    .line 387
    .line 388
    move-object/from16 v20, v10

    .line 389
    .line 390
    const/16 v19, 0x0

    .line 391
    .line 392
    instance-of v6, v11, Lhb6;

    .line 393
    .line 394
    if-eqz v6, :cond_2b

    .line 395
    .line 396
    iget-object v6, v1, Lf63;->Z:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v6, Lki8;

    .line 399
    .line 400
    check-cast v11, Lhb6;

    .line 401
    .line 402
    invoke-interface {v6, v11}, Lki8;->M(Lhb6;)Lhi8;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    if-eqz v6, :cond_11

    .line 407
    .line 408
    invoke-interface {v6}, Lhi8;->l()Llh8;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    goto :goto_7

    .line 413
    :cond_11
    move-object/from16 v6, v19

    .line 414
    .line 415
    :goto_7
    if-nez v6, :cond_12

    .line 416
    .line 417
    return-object v19

    .line 418
    :cond_12
    if-ne v4, v9, :cond_14

    .line 419
    .line 420
    :cond_13
    move/from16 v7, v16

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_14
    if-nez v17, :cond_13

    .line 424
    .line 425
    if-eq v3, v15, :cond_13

    .line 426
    .line 427
    move/from16 v7, v18

    .line 428
    .line 429
    :goto_8
    if-eqz v2, :cond_15

    .line 430
    .line 431
    invoke-virtual {v2}, Lt14;->n0()Llh8;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    goto :goto_9

    .line 436
    :cond_15
    move-object/from16 v3, v19

    .line 437
    .line 438
    :goto_9
    invoke-static {v3, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-eqz v3, :cond_16

    .line 443
    .line 444
    invoke-virtual {v5}, Lva6;->d()Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-nez v3, :cond_16

    .line 449
    .line 450
    if-eqz v7, :cond_16

    .line 451
    .line 452
    move/from16 v3, v18

    .line 453
    .line 454
    invoke-virtual {v2, v3}, Laa7;->u0(Z)Laa7;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    return-object v0

    .line 459
    :cond_16
    move/from16 v3, v18

    .line 460
    .line 461
    invoke-virtual {v5}, Lva6;->d()Z

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    if-nez v2, :cond_18

    .line 466
    .line 467
    invoke-virtual {v5}, Lva6;->c()Ljava/util/ArrayList;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_17

    .line 476
    .line 477
    invoke-interface {v6}, Llh8;->g()Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-nez v2, :cond_17

    .line 489
    .line 490
    goto :goto_a

    .line 491
    :cond_17
    move/from16 v3, v16

    .line 492
    .line 493
    :cond_18
    :goto_a
    invoke-interface {v6}, Llh8;->g()Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    const/16 v4, 0xa

    .line 501
    .line 502
    if-eqz v3, :cond_1b

    .line 503
    .line 504
    new-instance v9, Ljava/util/ArrayList;

    .line 505
    .line 506
    invoke-static {v2, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 511
    .line 512
    .line 513
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v10

    .line 517
    :goto_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-eqz v2, :cond_1a

    .line 522
    .line 523
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    check-cast v2, Lhi8;

    .line 528
    .line 529
    iget-object v3, v0, Lnl3;->e:Ljava/util/Set;

    .line 530
    .line 531
    move-object/from16 v4, v19

    .line 532
    .line 533
    invoke-static {v2, v4, v3}, Ly08;->g(Lhi8;Llh8;Ljava/util/Set;)Z

    .line 534
    .line 535
    .line 536
    move-result v3

    .line 537
    if-eqz v3, :cond_19

    .line 538
    .line 539
    invoke-static {v2, v0}, Lcj8;->k(Lhi8;Lnl3;)Lni8;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    move-object v15, v6

    .line 544
    move-object v6, v1

    .line 545
    goto :goto_c

    .line 546
    :cond_19
    new-instance v11, Lz74;

    .line 547
    .line 548
    iget-object v3, v8, Lc6;->f0:Ljava/lang/Object;

    .line 549
    .line 550
    move-object v12, v3

    .line 551
    check-cast v12, Lve4;

    .line 552
    .line 553
    new-instance v0, Lsl3;

    .line 554
    .line 555
    move-object/from16 v3, p2

    .line 556
    .line 557
    move-object v4, v6

    .line 558
    invoke-direct/range {v0 .. v5}, Lsl3;-><init>(Lf63;Lhi8;Lnl3;Llh8;Lva6;)V

    .line 559
    .line 560
    .line 561
    move-object v6, v1

    .line 562
    move-object v13, v2

    .line 563
    move-object v15, v4

    .line 564
    invoke-direct {v11, v12, v0}, Lz74;-><init>(Lve4;Ldn2;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {p1 .. p1}, Lva6;->d()Z

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    const/4 v4, 0x0

    .line 572
    const/16 v5, 0x3b

    .line 573
    .line 574
    const/4 v1, 0x0

    .line 575
    const/4 v3, 0x0

    .line 576
    move-object/from16 v0, p2

    .line 577
    .line 578
    invoke-static/range {v0 .. v5}, Lnl3;->a(Lnl3;Lol3;ZLjava/util/Set;Laa7;I)Lnl3;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    iget-object v0, v6, Lf63;->f0:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v0, Lxd6;

    .line 585
    .line 586
    invoke-static {v13, v1, v0, v11}, Lwe5;->e(Lhi8;Lnl3;Lxd6;Lt14;)Lni8;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    :goto_c
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-object/from16 v5, p1

    .line 594
    .line 595
    move-object/from16 v0, p2

    .line 596
    .line 597
    move-object v1, v6

    .line 598
    move-object v6, v15

    .line 599
    const/16 v19, 0x0

    .line 600
    .line 601
    goto :goto_b

    .line 602
    :cond_1a
    move-object v15, v6

    .line 603
    :goto_d
    move-object/from16 v10, v20

    .line 604
    .line 605
    goto/16 :goto_19

    .line 606
    .line 607
    :cond_1b
    move-object v15, v6

    .line 608
    move-object v6, v1

    .line 609
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    invoke-virtual/range {p1 .. p1}, Lva6;->c()Ljava/util/ArrayList;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 618
    .line 619
    .line 620
    move-result v1

    .line 621
    if-eq v0, v1, :cond_1d

    .line 622
    .line 623
    new-instance v0, Ljava/util/ArrayList;

    .line 624
    .line 625
    invoke-static {v2, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 626
    .line 627
    .line 628
    move-result v1

    .line 629
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    if-eqz v2, :cond_1c

    .line 641
    .line 642
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    check-cast v2, Lhi8;

    .line 647
    .line 648
    new-instance v3, Lwg7;

    .line 649
    .line 650
    invoke-interface {v2}, Led1;->getName()Lv15;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    invoke-virtual {v2}, Lv15;->b()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    filled-new-array {v2}, [Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    sget-object v4, Ls32;->u0:Ls32;

    .line 666
    .line 667
    invoke-static {v4, v2}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    invoke-direct {v3, v2}, Lwg7;-><init>(Lt14;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    goto :goto_e

    .line 678
    :cond_1c
    invoke-static {v0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 679
    .line 680
    .line 681
    move-result-object v9

    .line 682
    goto :goto_d

    .line 683
    :cond_1d
    invoke-virtual/range {p1 .. p1}, Lva6;->c()Ljava/util/ArrayList;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-static {v0}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    new-instance v1, Ljava/util/ArrayList;

    .line 692
    .line 693
    invoke-static {v0, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0}, Lgu;->iterator()Ljava/util/Iterator;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    :goto_f
    move-object v3, v0

    .line 705
    check-cast v3, Lrw1;

    .line 706
    .line 707
    iget-object v4, v3, Lrw1;->Y:Ljava/util/Iterator;

    .line 708
    .line 709
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    if-eqz v4, :cond_2a

    .line 714
    .line 715
    invoke-virtual {v3}, Lrw1;->next()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    check-cast v3, Lpb3;

    .line 720
    .line 721
    iget v4, v3, Lpb3;->a:I

    .line 722
    .line 723
    iget-object v3, v3, Lpb3;->b:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v3, Lgb6;

    .line 726
    .line 727
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 728
    .line 729
    .line 730
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v4

    .line 734
    check-cast v4, Lhi8;

    .line 735
    .line 736
    sget-object v5, Lzi8;->Y:Lzi8;

    .line 737
    .line 738
    const/4 v8, 0x7

    .line 739
    move/from16 v9, v16

    .line 740
    .line 741
    const/4 v10, 0x0

    .line 742
    invoke-static {v5, v9, v10, v8}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 743
    .line 744
    .line 745
    move-result-object v11

    .line 746
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    instance-of v9, v3, Ljb6;

    .line 750
    .line 751
    sget-object v10, Lrt8;->Z:Lrt8;

    .line 752
    .line 753
    if-eqz v9, :cond_29

    .line 754
    .line 755
    check-cast v3, Ljb6;

    .line 756
    .line 757
    invoke-virtual {v3}, Ljb6;->c()Lgb6;

    .line 758
    .line 759
    .line 760
    move-result-object v9

    .line 761
    iget-object v12, v3, Ljb6;->a:Ljava/lang/reflect/WildcardType;

    .line 762
    .line 763
    invoke-interface {v12}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 764
    .line 765
    .line 766
    move-result-object v12

    .line 767
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 768
    .line 769
    .line 770
    array-length v8, v12

    .line 771
    if-nez v8, :cond_1e

    .line 772
    .line 773
    const/4 v8, 0x0

    .line 774
    goto :goto_10

    .line 775
    :cond_1e
    const/16 v16, 0x0

    .line 776
    .line 777
    aget-object v8, v12, v16

    .line 778
    .line 779
    :goto_10
    invoke-static {v8, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 780
    .line 781
    .line 782
    move-result v8

    .line 783
    if-nez v8, :cond_1f

    .line 784
    .line 785
    move-object v8, v13

    .line 786
    goto :goto_11

    .line 787
    :cond_1f
    sget-object v8, Lrt8;->f0:Lrt8;

    .line 788
    .line 789
    :goto_11
    if-eqz v9, :cond_21

    .line 790
    .line 791
    invoke-interface {v4}, Lhi8;->D()Lrt8;

    .line 792
    .line 793
    .line 794
    move-result-object v12

    .line 795
    if-ne v12, v10, :cond_20

    .line 796
    .line 797
    goto :goto_12

    .line 798
    :cond_20
    invoke-interface {v4}, Lhi8;->D()Lrt8;

    .line 799
    .line 800
    .line 801
    move-result-object v10

    .line 802
    if-eq v8, v10, :cond_22

    .line 803
    .line 804
    :cond_21
    move-object/from16 p2, v0

    .line 805
    .line 806
    move-object/from16 p3, v2

    .line 807
    .line 808
    move-object/from16 v12, v21

    .line 809
    .line 810
    const/4 v2, 0x0

    .line 811
    goto/16 :goto_17

    .line 812
    .line 813
    :cond_22
    :goto_12
    invoke-virtual {v3}, Ljb6;->c()Lgb6;

    .line 814
    .line 815
    .line 816
    move-result-object v10

    .line 817
    if-eqz v10, :cond_28

    .line 818
    .line 819
    new-instance v10, Ln44;

    .line 820
    .line 821
    move-object/from16 v12, v21

    .line 822
    .line 823
    const/4 v11, 0x0

    .line 824
    invoke-direct {v10, v12, v3, v11}, Ln44;-><init>(Lz47;Lvj3;Z)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v10}, Ln44;->iterator()Ljava/util/Iterator;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    :goto_13
    move-object v10, v3

    .line 832
    check-cast v10, Lka2;

    .line 833
    .line 834
    invoke-virtual {v10}, Lka2;->hasNext()Z

    .line 835
    .line 836
    .line 837
    move-result v11

    .line 838
    if-eqz v11, :cond_25

    .line 839
    .line 840
    invoke-virtual {v10}, Lka2;->next()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v10

    .line 844
    move-object v11, v10

    .line 845
    check-cast v11, Lgm;

    .line 846
    .line 847
    move-object/from16 p2, v0

    .line 848
    .line 849
    sget-object v0, Lel3;->b:[Lfk2;

    .line 850
    .line 851
    move-object/from16 p3, v2

    .line 852
    .line 853
    array-length v2, v0

    .line 854
    move-object/from16 v17, v0

    .line 855
    .line 856
    const/4 v0, 0x0

    .line 857
    :goto_14
    if-ge v0, v2, :cond_24

    .line 858
    .line 859
    move/from16 v18, v0

    .line 860
    .line 861
    aget-object v0, v17, v18

    .line 862
    .line 863
    move/from16 v21, v2

    .line 864
    .line 865
    invoke-interface {v11}, Lgm;->d()Lfk2;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    invoke-static {v2, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    if-eqz v0, :cond_23

    .line 874
    .line 875
    goto :goto_15

    .line 876
    :cond_23
    add-int/lit8 v0, v18, 0x1

    .line 877
    .line 878
    move/from16 v2, v21

    .line 879
    .line 880
    goto :goto_14

    .line 881
    :cond_24
    move-object/from16 v0, p2

    .line 882
    .line 883
    move-object/from16 v2, p3

    .line 884
    .line 885
    goto :goto_13

    .line 886
    :cond_25
    move-object/from16 p2, v0

    .line 887
    .line 888
    move-object/from16 p3, v2

    .line 889
    .line 890
    const/4 v10, 0x0

    .line 891
    :goto_15
    check-cast v10, Lgm;

    .line 892
    .line 893
    const/4 v0, 0x7

    .line 894
    const/4 v2, 0x0

    .line 895
    const/4 v3, 0x0

    .line 896
    invoke-static {v5, v2, v3, v0}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-virtual {v6, v9, v0}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    if-eqz v10, :cond_27

    .line 905
    .line 906
    invoke-virtual {v0}, Lt14;->getAnnotations()Lsm;

    .line 907
    .line 908
    .line 909
    move-result-object v3

    .line 910
    invoke-static {v3, v10}, Lwv0;->G0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 915
    .line 916
    .line 917
    move-result v5

    .line 918
    if-eqz v5, :cond_26

    .line 919
    .line 920
    sget-object v3, Loy1;->f0:Lrm;

    .line 921
    .line 922
    goto :goto_16

    .line 923
    :cond_26
    new-instance v5, Lvm;

    .line 924
    .line 925
    invoke-direct {v5, v3, v2}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 926
    .line 927
    .line 928
    move-object v3, v5

    .line 929
    :goto_16
    invoke-static {v0, v3}, Ly08;->m(Lt14;Lsm;)Lt14;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    :cond_27
    invoke-static {v0, v8, v4}, Ly08;->b(Lt14;Lrt8;Lhi8;)Lwg7;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    goto :goto_18

    .line 938
    :cond_28
    const-string v0, "Nullability annotations on unbounded wildcards aren\'t supported"

    .line 939
    .line 940
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    const/16 v19, 0x0

    .line 944
    .line 945
    return-object v19

    .line 946
    :goto_17
    invoke-static {v4, v11}, Lcj8;->k(Lhi8;Lnl3;)Lni8;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    goto :goto_18

    .line 951
    :cond_29
    move-object/from16 p2, v0

    .line 952
    .line 953
    move-object/from16 p3, v2

    .line 954
    .line 955
    move-object/from16 v12, v21

    .line 956
    .line 957
    const/4 v2, 0x0

    .line 958
    new-instance v0, Lwg7;

    .line 959
    .line 960
    invoke-virtual {v6, v3, v11}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 961
    .line 962
    .line 963
    move-result-object v3

    .line 964
    invoke-direct {v0, v3, v10}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 965
    .line 966
    .line 967
    :goto_18
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    move-object/from16 v0, p2

    .line 971
    .line 972
    move/from16 v16, v2

    .line 973
    .line 974
    move-object/from16 v21, v12

    .line 975
    .line 976
    move-object/from16 v2, p3

    .line 977
    .line 978
    goto/16 :goto_f

    .line 979
    .line 980
    :cond_2a
    invoke-static {v1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 981
    .line 982
    .line 983
    move-result-object v9

    .line 984
    goto/16 :goto_d

    .line 985
    .line 986
    :goto_19
    invoke-static {v10, v15, v9, v7}, Ldh3;->N(Lch8;Llh8;Ljava/util/List;Z)Laa7;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    return-object v0

    .line 991
    :cond_2b
    const-string v0, "Unknown classifier kind: "

    .line 992
    .line 993
    invoke-static {v11, v0}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    const/16 v19, 0x0

    .line 997
    .line 998
    return-object v19
.end method

.method public o()Lr05;
    .locals 7

    .line 1
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzs6;

    .line 4
    .line 5
    iget-object v1, v0, Lzs6;->r:Lks6;

    .line 6
    .line 7
    iget-object v0, v0, Lzs6;->s:Lks6;

    .line 8
    .line 9
    const/high16 v2, -0x40800000    # -1.0f

    .line 10
    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    invoke-virtual {v1}, Lks6;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_5

    .line 18
    .line 19
    iget v3, v1, Lks6;->Y:I

    .line 20
    .line 21
    const/16 v4, 0x9

    .line 22
    .line 23
    if-eq v3, v4, :cond_5

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    if-eq v3, v5, :cond_5

    .line 27
    .line 28
    const/4 v6, 0x3

    .line 29
    if-ne v3, v6, :cond_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    invoke-virtual {v1}, Lks6;->a()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, Lks6;->g()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    iget p0, v0, Lks6;->Y:I

    .line 45
    .line 46
    if-eq p0, v4, :cond_2

    .line 47
    .line 48
    if-eq p0, v5, :cond_2

    .line 49
    .line 50
    if-ne p0, v6, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Lks6;->a()F

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    new-instance p0, Lr05;

    .line 59
    .line 60
    invoke-direct {p0, v2, v2, v2, v2}, Lr05;-><init>(FFFF)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_3
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lzs6;

    .line 67
    .line 68
    iget-object p0, p0, Lkt6;->o:Lr05;

    .line 69
    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    iget v0, p0, Lr05;->e:F

    .line 73
    .line 74
    mul-float/2addr v0, v1

    .line 75
    iget p0, p0, Lr05;->d:F

    .line 76
    .line 77
    div-float p0, v0, p0

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move p0, v1

    .line 81
    :goto_1
    new-instance v0, Lr05;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-direct {v0, v2, v2, v1, p0}, Lr05;-><init>(FFFF)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_5
    :goto_2
    new-instance p0, Lr05;

    .line 89
    .line 90
    invoke-direct {p0, v2, v2, v2, v2}, Lr05;-><init>(FFFF)V

    .line 91
    .line 92
    .line 93
    return-object p0
.end method

.method public q()Lov8;
    .locals 1

    .line 1
    iget-byte v0, p0, Lf63;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lc6;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lqi3;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public r(Lav8;)I
    .locals 11

    .line 1
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_8

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lwv4;

    .line 22
    .line 23
    iget v3, v2, Lwv4;->d:I

    .line 24
    .line 25
    iget-object v4, v2, Lwv4;->a:Lgx4;

    .line 26
    .line 27
    invoke-virtual {v4, p1}, Lgx4;->a(Lav8;)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    add-int/lit8 v6, v5, 0x4

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x4

    .line 39
    const/4 v9, 0x1

    .line 40
    if-eq v4, v9, :cond_5

    .line 41
    .line 42
    const/4 v10, 0x6

    .line 43
    if-eq v4, v7, :cond_3

    .line 44
    .line 45
    if-eq v4, v8, :cond_2

    .line 46
    .line 47
    const/4 v2, 0x5

    .line 48
    if-eq v4, v2, :cond_1

    .line 49
    .line 50
    if-eq v4, v10, :cond_0

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_0
    mul-int/lit8 v3, v3, 0xd

    .line 54
    .line 55
    add-int/2addr v6, v3

    .line 56
    goto :goto_3

    .line 57
    :cond_1
    add-int/lit8 v6, v5, 0xc

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_2
    invoke-virtual {v2}, Lwv4;->a()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    mul-int/lit8 v2, v2, 0x8

    .line 65
    .line 66
    add-int/2addr v6, v2

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    div-int/lit8 v2, v3, 0x2

    .line 69
    .line 70
    mul-int/lit8 v2, v2, 0xb

    .line 71
    .line 72
    add-int/2addr v2, v6

    .line 73
    rem-int/lit8 v3, v3, 0x2

    .line 74
    .line 75
    if-ne v3, v9, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move v10, v0

    .line 79
    :goto_1
    add-int v6, v2, v10

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    div-int/lit8 v2, v3, 0x3

    .line 83
    .line 84
    mul-int/lit8 v2, v2, 0xa

    .line 85
    .line 86
    add-int/2addr v2, v6

    .line 87
    rem-int/lit8 v3, v3, 0x3

    .line 88
    .line 89
    if-ne v3, v9, :cond_6

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    if-ne v3, v7, :cond_7

    .line 93
    .line 94
    const/4 v8, 0x7

    .line 95
    goto :goto_2

    .line 96
    :cond_7
    move v8, v0

    .line 97
    :goto_2
    add-int v6, v2, v8

    .line 98
    .line 99
    :goto_3
    add-int/2addr v1, v6

    .line 100
    goto :goto_0

    .line 101
    :cond_8
    return v1
.end method

.method public s()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldw7;

    .line 4
    .line 5
    iget-object v0, v0, Ldw7;->n:Lck4;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lyv7;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget-object v0, v0, Lck4;->X:Lb6;

    .line 19
    .line 20
    iget-object v2, v0, Lb6;->A0:Landroid/view/View;

    .line 21
    .line 22
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    add-int/lit8 v3, p0, 0x2

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    instance-of v3, v2, Law7;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    check-cast v2, Law7;

    .line 35
    .line 36
    iget-object p0, v2, Law7;->w:Lzv7;

    .line 37
    .line 38
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lsi3;

    .line 41
    .line 42
    iget-object p0, p0, Lsi3;->h0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    instance-of v3, v2, Lyv7;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    check-cast v2, Lyv7;

    .line 54
    .line 55
    iget-object p0, v2, Lyv7;->v:Lf63;

    .line 56
    .line 57
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lc6;

    .line 60
    .line 61
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iget-object v0, v0, Lb6;->A0:Landroid/view/View;

    .line 71
    .line 72
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    instance-of v0, p0, Lyv7;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    check-cast p0, Lyv7;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    const/4 p0, 0x0

    .line 86
    :goto_0
    if-nez p0, :cond_3

    .line 87
    .line 88
    move p0, v1

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    iget-object p0, p0, Lyv7;->v:Lf63;

    .line 91
    .line 92
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Lc6;

    .line 95
    .line 96
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    :goto_1
    const/4 v0, 0x1

    .line 105
    if-ne p0, v0, :cond_4

    .line 106
    .line 107
    return v0

    .line 108
    :cond_4
    return v1
.end method

.method public t(ZLs51;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p2, p0, Lf63;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, p2

    .line 4
    check-cast v1, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p2}, Lys0;->z(Lg94;)Lu84;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    sget-object v0, Ltp1;->a:Lnf1;

    .line 15
    .line 16
    sget-object v6, Ldm4;->a:Lhv2;

    .line 17
    .line 18
    new-instance v0, Lqk4;

    .line 19
    .line 20
    iget-object v2, p0, Lf63;->Z:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v4, p0

    .line 28
    check-cast v4, Lgn2;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    move v2, p1

    .line 32
    invoke-direct/range {v0 .. v5}, Lqk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;ZLjava/lang/String;Lgn2;Lq51;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x2

    .line 36
    invoke-static {p2, v6, v0, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 37
    .line 38
    .line 39
    sget-object p0, Ldn8;->a:Ldn8;

    .line 40
    .line 41
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-byte v0, p0, Lf63;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lwv4;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    const-string v1, ","

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v2}, Lwv4;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-object v1, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lf63;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lqt5;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p1, Lqt5;->e:Lyo2;

    .line 7
    .line 8
    iget-object p1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lxg0;

    .line 33
    .line 34
    iget-object v2, p0, Lf63;->Z:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lxi0;

    .line 37
    .line 38
    check-cast v2, Laj0;

    .line 39
    .line 40
    invoke-interface {v2, v1}, Laj0;->y(Lxg0;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldw7;

    .line 4
    .line 5
    iget-object p0, p0, Ldw7;->n:Lck4;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lck4;->X:Lb6;

    .line 10
    .line 11
    iget-object p0, p0, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v0, 0x1

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    return v0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public w()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldw7;

    .line 4
    .line 5
    iget-object v0, v0, Ldw7;->n:Lck4;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, v0, Lck4;->X:Lb6;

    .line 10
    .line 11
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lyv7;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    iget-object v1, v0, Lb6;->A0:Landroid/view/View;

    .line 20
    .line 21
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    add-int/lit8 v2, p0, -0x1

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    instance-of v2, v1, Law7;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    check-cast v1, Law7;

    .line 34
    .line 35
    iget-object p0, v1, Law7;->w:Lzv7;

    .line 36
    .line 37
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lsi3;

    .line 40
    .line 41
    iget-object p0, p0, Lsi3;->h0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    iget-object v1, v0, Lb6;->A0:Landroid/view/View;

    .line 49
    .line 50
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    add-int/lit8 p0, p0, -0x2

    .line 53
    .line 54
    invoke-virtual {v1, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    instance-of v1, p0, Lyv7;

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    check-cast p0, Lyv7;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 p0, 0x0

    .line 66
    :goto_0
    if-eqz p0, :cond_2

    .line 67
    .line 68
    iget-object p0, p0, Lyv7;->v:Lf63;

    .line 69
    .line 70
    if-eqz p0, :cond_2

    .line 71
    .line 72
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Lc6;

    .line 75
    .line 76
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    iget-object p0, v0, Lb6;->i0:Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedImageButton;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    :goto_1
    const/4 v0, 0x1

    .line 92
    if-ne p0, v0, :cond_3

    .line 93
    .line 94
    return v0

    .line 95
    :cond_3
    const/4 p0, 0x0

    .line 96
    return p0
.end method

.method public x(Ln84;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx47;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lx47;->run()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Lx47;

    .line 11
    .line 12
    iget-object v1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lg94;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1}, Lx47;-><init>(Lg94;Ln84;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public y(Ljava/lang/String;)Let6;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_1

    .line 5
    .line 6
    :cond_0
    const-string v1, "\""

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sub-int/2addr v2, v3

    .line 26
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v2, "\\\""

    .line 31
    .line 32
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v1, "\'"

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    sub-int/2addr v2, v3

    .line 56
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v2, "\\\'"

    .line 61
    .line 62
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :cond_2
    :goto_0
    const-string v1, "\\\n"

    .line 67
    .line 68
    const-string v2, ""

    .line 69
    .line 70
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v1, "\\A"

    .line 75
    .line 76
    const-string v2, "\n"

    .line 77
    .line 78
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-le v1, v3, :cond_6

    .line 87
    .line 88
    const-string v1, "#"

    .line 89
    .line 90
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object v1, p0, Lf63;->f0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_3

    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_3
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lzs6;

    .line 114
    .line 115
    iget-object v0, v0, Let6;->c:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Lzs6;

    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_4
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast p0, Let6;

    .line 139
    .line 140
    return-object p0

    .line 141
    :cond_5
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, Lzs6;

    .line 144
    .line 145
    invoke-static {p0, p1}, Lf63;->p(Lct6;Ljava/lang/String;)Let6;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {v1, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_6
    :goto_1
    return-object v0
.end method

.method public z(Lqz;IZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lf63;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ldz;

    .line 10
    .line 11
    new-instance v4, Landroid/content/ComponentName;

    .line 12
    .line 13
    iget-object v5, v0, Lf63;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Landroid/content/Context;

    .line 16
    .line 17
    const-class v6, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 18
    .line 19
    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    const-string v6, "jobscheduler"

    .line 23
    .line 24
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    check-cast v6, Landroid/app/job/JobScheduler;

    .line 29
    .line 30
    new-instance v7, Ljava/util/zip/Adler32;

    .line 31
    .line 32
    invoke-direct {v7}, Ljava/util/zip/Adler32;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-string v8, "UTF-8"

    .line 40
    .line 41
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-virtual {v5, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    .line 50
    .line 51
    .line 52
    iget-object v5, v1, Lqz;->a:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {v5, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v7, v8}, Ljava/util/zip/Adler32;->update([B)V

    .line 63
    .line 64
    .line 65
    const/4 v8, 0x4

    .line 66
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    iget-object v9, v1, Lqz;->c:Lfu5;

    .line 71
    .line 72
    invoke-static {v9}, Lhu5;->a(Lfu5;)I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v7, v8}, Ljava/util/zip/Adler32;->update([B)V

    .line 85
    .line 86
    .line 87
    iget-object v8, v1, Lqz;->b:[B

    .line 88
    .line 89
    if-eqz v8, :cond_0

    .line 90
    .line 91
    invoke-virtual {v7, v8}, Ljava/util/zip/Adler32;->update([B)V

    .line 92
    .line 93
    .line 94
    :cond_0
    invoke-virtual {v7}, Ljava/util/zip/Adler32;->getValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v10

    .line 98
    long-to-int v7, v10

    .line 99
    const-string v10, "JobInfoScheduler"

    .line 100
    .line 101
    const-string v11, "attemptNumber"

    .line 102
    .line 103
    if-nez p3, :cond_2

    .line 104
    .line 105
    invoke-virtual {v6}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    :cond_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    if-eqz v13, :cond_2

    .line 118
    .line 119
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    check-cast v13, Landroid/app/job/JobInfo;

    .line 124
    .line 125
    invoke-virtual {v13}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    invoke-virtual {v14, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    invoke-virtual {v13}, Landroid/app/job/JobInfo;->getId()I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-ne v13, v7, :cond_1

    .line 138
    .line 139
    if-lt v14, v2, :cond_2

    .line 140
    .line 141
    const-string v0, "Upload for context %s is already scheduled. Returning..."

    .line 142
    .line 143
    invoke-static {v1, v10, v0}, Lmb6;->x(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_2
    iget-object v0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lwr6;

    .line 150
    .line 151
    invoke-virtual {v0}, Lwr6;->g()Landroid/database/sqlite/SQLiteDatabase;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v9}, Lhu5;->a(Lfu5;)I

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    filled-new-array {v5, v12}, [Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    const-string v13, "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"

    .line 168
    .line 169
    invoke-virtual {v0, v13, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    :try_start_0
    invoke-interface {v12}, Landroid/database/Cursor;->moveToNext()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    const/4 v13, 0x0

    .line 178
    if-eqz v0, :cond_3

    .line 179
    .line 180
    invoke-interface {v12, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 181
    .line 182
    .line 183
    move-result-wide v14

    .line 184
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    goto :goto_0

    .line 189
    :cond_3
    const-wide/16 v14, 0x0

    .line 190
    .line 191
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    :goto_0
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 199
    .line 200
    .line 201
    move-result-wide v14

    .line 202
    new-instance v12, Landroid/app/job/JobInfo$Builder;

    .line 203
    .line 204
    invoke-direct {v12, v7, v4}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 205
    .line 206
    .line 207
    move-object v4, v6

    .line 208
    move/from16 v16, v7

    .line 209
    .line 210
    invoke-virtual {v3, v9, v14, v15, v2}, Ldz;->a(Lfu5;JI)J

    .line 211
    .line 212
    .line 213
    move-result-wide v6

    .line 214
    invoke-virtual {v12, v6, v7}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 215
    .line 216
    .line 217
    iget-object v6, v3, Ldz;->b:Ljava/util/HashMap;

    .line 218
    .line 219
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    check-cast v6, Lez;

    .line 224
    .line 225
    iget-object v6, v6, Lez;->c:Ljava/util/Set;

    .line 226
    .line 227
    sget-object v7, Lyw6;->X:Lyw6;

    .line 228
    .line 229
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    const/4 v13, 0x1

    .line 234
    if-eqz v7, :cond_4

    .line 235
    .line 236
    const/4 v7, 0x2

    .line 237
    invoke-virtual {v12, v7}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_4
    invoke-virtual {v12, v13}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 242
    .line 243
    .line 244
    :goto_1
    sget-object v7, Lyw6;->Z:Lyw6;

    .line 245
    .line 246
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    if-eqz v7, :cond_5

    .line 251
    .line 252
    invoke-virtual {v12, v13}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 253
    .line 254
    .line 255
    :cond_5
    sget-object v7, Lyw6;->Y:Lyw6;

    .line 256
    .line 257
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    if-eqz v6, :cond_6

    .line 262
    .line 263
    invoke-virtual {v12, v13}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 264
    .line 265
    .line 266
    :cond_6
    new-instance v6, Landroid/os/PersistableBundle;

    .line 267
    .line 268
    invoke-direct {v6}, Landroid/os/PersistableBundle;-><init>()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6, v11, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 272
    .line 273
    .line 274
    const-string v7, "backendName"

    .line 275
    .line 276
    invoke-virtual {v6, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const-string v5, "priority"

    .line 280
    .line 281
    invoke-static {v9}, Lhu5;->a(Lfu5;)I

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    invoke-virtual {v6, v5, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 286
    .line 287
    .line 288
    if-eqz v8, :cond_7

    .line 289
    .line 290
    const-string v5, "extras"

    .line 291
    .line 292
    const/4 v7, 0x0

    .line 293
    invoke-static {v8, v7}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-virtual {v6, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    :cond_7
    invoke-virtual {v12, v6}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 301
    .line 302
    .line 303
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    invoke-virtual {v3, v9, v14, v15, v2}, Ldz;->a(Lfu5;JI)J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    filled-new-array {v1, v5, v3, v0, v2}, [Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v10}, Lmb6;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    const/4 v2, 0x3

    .line 328
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    if-eqz v1, :cond_8

    .line 333
    .line 334
    const-string v1, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"

    .line 335
    .line 336
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    :cond_8
    invoke-virtual {v12}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v4, v0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :catchall_0
    move-exception v0

    .line 348
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 349
    .line 350
    .line 351
    throw v0
.end method
